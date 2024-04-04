package com.example.Suivi.hopital.business.dto;

/**
 * Objet DTO (Data Transfer Object) représentant un service.
 */
public class ServiceDTO {

    private int serviceId; // Identifiant du service
    private String nom; // Nom du service
    private LitDTO litDTO; // Lit associé au service
    private PatientDTO patientDTO; // Patient associé au service

    /**
     * Obtient l'identifiant du service.
     *
     * @return L'identifiant du service.
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Définit l'identifiant du service.
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
     * Obtient le DTO du lit associé au service.
     *
     * @return Le DTO du lit associé au service.
     */
    public LitDTO getLitDTO() {
        return litDTO;
    }

    /**
     * Définit le DTO du lit associé au service.
     *
     * @param litDTO Le DTO du lit associé au service à définir.
     */
    public void setLitDTO(LitDTO litDTO) {
        this.litDTO = litDTO;
    }

    /**
     * Obtient le DTO du patient associé au service.
     *
     * @return Le DTO du patient associé au service.
     */
    public PatientDTO getPatientDTO() {
        return patientDTO;
    }

    /**
     * Définit le DTO du patient associé au service.
     *
     * @param patientDTO Le DTO du patient associé au service à définir.
     */
    public void setPatientDTO(PatientDTO patientDTO) {
        this.patientDTO = patientDTO;
    }

}