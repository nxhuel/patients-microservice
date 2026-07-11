package com.todocode.patients.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todocode.patients.dto.PatientMapper;
import com.todocode.patients.dto.PatientRequest;
import com.todocode.patients.dto.PatientResponse;
import com.todocode.patients.exception.ResourceNotFoundException;
import com.todocode.patients.persistence.entity.PatientEntity;
import com.todocode.patients.persistence.repository.IPatientRepository;
import com.todocode.patients.service.IPatientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService {

    private final IPatientRepository patientRepository;
    private final PatientMapper patientMapper;

    @Override
    @Transactional
    public PatientResponse savePatient(PatientRequest request) {
        PatientEntity entity = patientMapper.toEntity(request);
        PatientEntity saved = patientRepository.save(entity);
        return patientMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PatientResponse> getPatients() {
        return patientRepository.findAll()
                .stream()
                .map(patientMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public PatientResponse getPatientById(Long id) {
        PatientEntity entity = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", id));
        return patientMapper.toResponse(entity);
    }

    @Override
    @Transactional
    public PatientResponse editPatient(Long id, PatientRequest request) {
        patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", id));

        PatientEntity updated = patientMapper.toEntityWithId(id, request);
        PatientEntity saved = patientRepository.save(updated);
        return patientMapper.toResponse(saved);
    }

    @Override
    @Transactional
    public void deletePatientById(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new ResourceNotFoundException("Patient", id);
        }
        patientRepository.deleteById(id);
    }
}
