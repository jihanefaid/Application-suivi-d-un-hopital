
package com.example.Suivi.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Suivi.hopital.persistance.entity.Patient;


public interface PatientRepository extends  JpaRepository<Patient, Long> {
  
}