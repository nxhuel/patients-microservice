package com.todocode.patients.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public record PatientResponse(
    Long idPatient,
    String dni,
    String name,
    String lastName,
    
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate dateOfBirth,
    
    String phone
) {}
