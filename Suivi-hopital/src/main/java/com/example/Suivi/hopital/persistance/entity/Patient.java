package com.example.Suivi.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
/**
 * Entité représentant un patient dans un hôpital.
 */
@Entity
@Table(name = "Patient")
public class Patient {

    /**
     * Identifiant unique du patient.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private int idPatient;

    /**
     * Nom du patient.
     */
    @Column(name = "nom_patient")
    private String nom;

    /**
     * Prénom du patient.
     */
    @Column(name = "prenom_patient")
    private String prenom;

    /**
     * Sexe du patient.
     */
    @Column(name = "sexe_patient")
    private String sexe;

    /**
     * Date de naissance du patient.
     */
    @Column(name = "date_naissance_patient")
    private Date dateNaissance;

    /**
     * Ville de résidence du patient.
     */
    @Column(name = "ville_patient")
    private String ville;

    /**
     * Code postal de la ville de résidence du patient.
     */
    @Column(name = "cp_patient")
    private int cp;

    /**
     * Obtient l'identifiant unique du patient.
     *
     * @return L'identifiant du patient.
     */
    public int getIdPatient() {
        return idPatient;
    }

    /**
     * Définit l'identifiant unique du patient.
     *
     * @param idPatient L'identifiant du patient à définir.
     */
    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
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
     * Obtient le code postal de la ville de résidence du patient.
     *
     * @return Le code postal de la ville de résidence du patient.
     */
    public int getCp() {
        return cp;
    }

    /**
     * Définit le code postal de la ville de résidence du patient.
     *
     * @param cp Le code postal de la ville de résidence du patient à définir.
     */
    public void setCp(int cp) {
        this.cp = cp;
    }
}