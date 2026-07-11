package com.todocode.patients.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todocode.patients.persistence.entity.PatientEntity;
import com.todocode.patients.service.IPatientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientController {

    private final IPatientService patientService;

    @PostMapping("/create")
    public String savePatient(@RequestBody PatientEntity patient) {
        patientService.savePatient(patient);
        return "Patient created successfully";
    }
    
    @GetMapping("/find-all")
    public ResponseEntity<List<PatientEntity>> findAllPatients() {
        return ResponseEntity.ok(patientService.getPatients());
    }
    
}
