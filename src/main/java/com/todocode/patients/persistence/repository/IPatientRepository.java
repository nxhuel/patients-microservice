package com.todocode.patients.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todocode.patients.persistence.entity.PatientEntity;

public interface IPatientRepository extends JpaRepository<PatientEntity, Long> {

	PatientEntity findByDni(String dni);
}
