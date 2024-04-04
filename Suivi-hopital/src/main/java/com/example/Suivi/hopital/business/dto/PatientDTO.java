package com.example.Suivi.hopital.business.dto;

import java.util.Date;

/**
 * Objet DTO (Data Transfer Object) représentant un patient.
 */
public class PatientDTO {

    private int idPatientDTO; // Identifiant du patient
    private String nom; // Nom du patient
    private String prenom; // Prénom du patient
    private String sexe; // Sexe du patient
    private Date dateNaissance; // Date de naissance du patient
    private String ville; // Ville de résidence du patient
    private int cp; // Code postal du patient

    /**
     * Obtient l'identifiant du patient.
     *
     * @return L'identifiant du patient.
     */
    public int getIdPatientDTO() {
        return idPatientDTO;
    }

    /**
     * Définit l'identifiant du patient.
     *
     * @param idPatientDTO L'identifiant du patient à définir.
     */
    public void setIdPatientDTO(int idPatientDTO) {
        this.idPatientDTO = idPatientDTO;
    }

    /**
     * Obtient le nom du patient.
     *
     * @return Le nom du patient.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du patient.
     *
     * @param nom Le nom du patient à définir.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le prénom du patient.
     *
     * @return Le prénom du patient.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom du patient.
     *
     * @param prenom Le prénom du patient à définir.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Obtient le sexe du patient.
     *
     * @return Le sexe du patient.
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Définit le sexe du patient.
     *
     * @param sexe Le sexe du patient à définir.
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Obtient la date de naissance du patient.
     *
     * @return La date de naissance du patient.
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la date de naissance du patient.
     *
     * @param dateNaissance La date de naissance du patient à définir.
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * Obtient la ville de résidence du patient.
     *
     * @return La ville de résidence du patient.
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la ville de résidence du patient.
     *
     * @param ville La ville de résidence du patient à définir.
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Obtient le code postal du patient.
     *
     * @return Le code postal du patient.
     */
    public int getCp() {
        return cp;
    }

    /**
     * Définit le code postal du patient.
     *
     * @param cp Le code postal du patient à définir.
     */
    public void setCp(int cp) {
        this.cp = cp;
    }
}