package com.todocode.patients.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todocode.patients.persistence.entity.PatientEntity;
import com.todocode.patients.persistence.repository.IPatientRepository;
import com.todocode.patients.service.IPatientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService {

    private final IPatientRepository patientRepository;

    @Override
    public void savePatient(PatientEntity patient) {
        patientRepository.save(patient);
    }

    @Override
    public List<PatientEntity> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public PatientEntity getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public void editPatient(PatientEntity patient) {
        this.savePatient(patient);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

}
