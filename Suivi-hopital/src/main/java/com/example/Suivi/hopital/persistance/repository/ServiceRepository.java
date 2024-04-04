package com.example.Suivi.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Suivi.hopital.persistance.entity.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
 
}