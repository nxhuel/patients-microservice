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
        throw new UnsupportedOperationException("Unimplemented method 'savePatient'");
    }

    @Override
    public List<PatientEntity> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public PatientEntity getPatientById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getPatientById'");
    }

    @Override
    public void editPatient(PatientEntity patient) {
        throw new UnsupportedOperationException("Unimplemented method 'editPatient'");
    }

    @Override
    public void deletePatientById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deletePatientById'");
    }

}
