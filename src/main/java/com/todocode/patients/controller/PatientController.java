package com.todocode.patients.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todocode.patients.dto.PatientRequest;
import com.todocode.patients.dto.PatientResponse;
import com.todocode.patients.service.IPatientService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final IPatientService patientService;

    @PostMapping("/create")
    public ResponseEntity<PatientResponse> savePatient(@Valid @RequestBody PatientRequest request) {
        PatientResponse response = patientService.savePatient(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<PatientResponse>> findAllPatients() {
        return ResponseEntity.ok(patientService.getPatients());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PatientResponse> getPatient(@PathVariable Long id) {
        return ResponseEntity.ok(patientService.getPatientById(id));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<PatientResponse> editPatient(@PathVariable Long id, @Valid @RequestBody PatientRequest request) {
        PatientResponse response = patientService.editPatient(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        patientService.deletePatientById(id);
        return ResponseEntity.noContent().build();
    }
}
