package com.todocode.patients.dto;

import java.time.LocalDate;

public record PatientResponse(
    Long idPatient,
    String dni,
    String name,
    String lastName,
    LocalDate dateOfBirth,
    String phone
) {}
