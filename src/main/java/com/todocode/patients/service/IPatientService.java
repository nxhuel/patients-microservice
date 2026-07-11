package com.todocode.patients.service;

import java.util.List;

import com.todocode.patients.persistence.entity.PatientEntity;

public interface IPatientService {
    
    void savePatient(PatientEntity patient);

    List<PatientEntity> getPatients();

    PatientEntity getPatientById(Long id);

    void editPatient(PatientEntity patient);
    
    void deletePatientById(Long id);
}
