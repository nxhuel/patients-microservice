package com.todocode.patients.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

public record PatientRequest(
    
    @NotBlank(message = "DNI is required")
    @Pattern(regexp = "\\d{7,8}", message = "DNI must have 7 or 8 digits")
    String dni,

    @NotBlank(message = "Name is required")
    String name,

    @NotBlank(message = "Last name is required")
    String lastName,

    @Past(message = "Date of birth must be in the past")
    LocalDate dateOfBirth,

    @NotBlank(message = "Phone is required")
    @Pattern(regexp = "\\+?\\d{7,15}", message = "Phone must be a valid number")
    String phone
) {}
