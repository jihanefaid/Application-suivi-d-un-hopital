package com.example.Suivi.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Entité représentant un service dans un hôpital.
 */
@Entity
@Table(name = "service") // Le nom de la table doit être en minuscules
public class Service {

    /**
     * Identifiant unique du service.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id") // Nom de la colonne corrigé
    private int serviceId;

    /**
     * Nom du service.
     */
    @Column(name = "nom")
    private String nom;

    /**
     * Lit associé à ce service.
     */
    @ManyToOne(fetch = FetchType.LAZY) // Plusieurs services peuvent être dans un lit
    @JoinColumn(name = "lit_id") // Nom de la colonne pour la clé étrangère
    public Lit litId;

    /**
     * Patient associé à ce service.
     */
    @OneToOne(fetch = FetchType.LAZY) // Un service est associé à un seul patient
    @JoinColumn(name = "id_patient")
    public Patient patientId;

    /**
     * Obtient l'identifiant unique du service.
     *
     * @return L'identifiant du service.
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Définit l'identifiant unique du service.
     *
     * @param serviceId L'identifiant du service à définir.
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Obtient le nom du service.
     *
     * @return Le nom du service.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du service.
     *
     * @param nom Le nom du service à définir.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le lit associé à ce service.
     *
     * @return Le lit associé à ce service.
     */
    public Lit getLit() {
        return litId;
    }

    /**
     * Définit le lit associé à ce service.
     *
     * @param lit Le lit associé à ce service.
     */
    public void setLit(Lit lit) {
        this.litId = lit;
    }

    /**
     * Obtient le patient associé à ce service.
     *
     * @return Le patient associé à ce service.
     */
    public Patient getPatient() {
        return patientId;
    }

    /**
     * Définit le patient associé à ce service.
     *
     * @param patient Le patient associé à ce service.
     */
    public void setPatient(Patient patient) {
        this.patientId = patient;
    }
}