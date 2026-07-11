package com.todocode.patients.dto;

import org.springframework.stereotype.Component;

import com.todocode.patients.persistence.entity.PatientEntity;

@Component
public class PatientMapper {

    public PatientEntity toEntity(PatientRequest request) {
        return PatientEntity.builder()
                .dni(request.dni())
                .name(request.name())
                .lastName(request.lastName())
                .dateOfBirth(request.dateOfBirth())
                .phone(request.phone())
                .build();
    }

    public PatientEntity toEntityWithId(Long id, PatientRequest request) {
        return PatientEntity.builder()
                .idPatient(id)
                .dni(request.dni())
                .name(request.name())
                .lastName(request.lastName())
                .dateOfBirth(request.dateOfBirth())
                .phone(request.phone())
                .build();
    }

    public PatientResponse toResponse(PatientEntity entity) {
        return new PatientResponse(
                entity.getIdPatient(),
                entity.getDni(),
                entity.getName(),
                entity.getLastName(),
                entity.getDateOfBirth(),
                entity.getPhone());
    }
}
