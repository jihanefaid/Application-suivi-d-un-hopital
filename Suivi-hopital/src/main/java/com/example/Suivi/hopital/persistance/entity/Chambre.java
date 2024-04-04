package com.example.Suivi.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entité représentant une chambre d'hôpital.
 */
@Entity
@Table(name = "Chambre")
public class Chambre {

    /**
     * Identifiant unique de la chambre.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chambre_id")
    private int chambre_id;

    /**
     * Numéro de la chambre.
     */
    @Column(name = "num_chambres")
    private int num_chambres;

    /**
     * Nombre de lits dans la chambre.
     */
    @Column(name = "nb_lits")
    private int nb_lits;

    /**
     * Obtient l'identifiant unique de la chambre.
     *
     * @return L'identifiant de la chambre.
     */
    public int getChambre_id() {
        return chambre_id;
    }

    /**
     * Définit l'identifiant unique de la chambre.
     *
     * @param chambre_id L'identifiant de la chambre à définir.
     */
    public void setChambre_id(int chambre_id) {
        this.chambre_id = chambre_id;
    }

    /**
     * Obtient le numéro de la chambre.
     *
     * @return Le numéro de la chambre.
     */
    public int getNum_chambres() {
        return num_chambres;
    }

    /**
     * Définit le numéro de la chambre.
     *
     * @param num_chambres Le numéro de la chambre à définir.
     */
    public void setNum_chambres(int num_chambres) {
        this.num_chambres = num_chambres;
    }

    /**
     * Obtient le nombre de lits dans la chambre.
     *
     * @return Le nombre de lits.
     */
    public int getNb_lits() {
        return nb_lits;
    }

    /**
     * Définit le nombre de lits dans la chambre.
     *
     * @param nb_lits Le nombre de lits à définir.
     */
    public void setNb_lits(int nb_lits) {
        this.nb_lits = nb_lits;
    }
}