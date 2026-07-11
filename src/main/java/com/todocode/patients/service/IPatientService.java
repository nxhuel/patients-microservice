package com.todocode.patients.service;

import java.util.List;

import com.todocode.patients.dto.PatientRequest;
import com.todocode.patients.dto.PatientResponse;

public interface IPatientService {

    PatientResponse savePatient(PatientRequest request);

    List<PatientResponse> getPatients();

    PatientResponse getPatientById(Long id);

    PatientResponse editPatient(Long id, PatientRequest request);

    void deletePatientById(Long id);
}
