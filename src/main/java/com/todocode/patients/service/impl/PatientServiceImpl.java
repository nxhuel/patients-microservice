package com.todocode.patients.service.impl;

import java.util.List;

import com.todocode.patients.persistence.entity.PatientEntity;
import com.todocode.patients.service.IPatientService;

public class PatientServiceImpl implements IPatientService {

    @Override
    public void savePatient(PatientEntity patient) {
        throw new UnsupportedOperationException("Unimplemented method 'savePatient'");
    }

    @Override
    public List<PatientEntity> getPatients() {
        throw new UnsupportedOperationException("Unimplemented method 'getPatients'");
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
