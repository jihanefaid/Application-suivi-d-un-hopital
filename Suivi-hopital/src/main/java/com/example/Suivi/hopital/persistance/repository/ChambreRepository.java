package com.example.Suivi.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Suivi.hopital.persistance.entity.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
 
}