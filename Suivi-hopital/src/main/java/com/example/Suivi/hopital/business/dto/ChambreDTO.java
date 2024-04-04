package com.example.Suivi.hopital.business.dto;

/**
 * Objet DTO (Data Transfer Object) représentant une chambre.
 */
public class ChambreDTO {

    private int chambre_id; // Identifiant de la chambre
    private int num_chambres; // Numéro de la chambre
    private int nb_lits; // Nombre de lits dans la chambre

    /**
     * Obtient l'identifiant de la chambre.
     *
     * @return L'identifiant de la chambre.
     */
    public int getChambre_id() {
        return chambre_id;
    }

    /**
     * Définit l'identifiant de la chambre.
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
     * @return Le nombre de lits dans la chambre.
     */
    public int getNb_lits() {
        return nb_lits;
    }

    /**
     * Définit le nombre de lits dans la chambre.
     *
     * @param nb_lits Le nombre de lits dans la chambre à définir.
     */
    public void setNb_lits(int nb_lits) {
        this.nb_lits = nb_lits;
    }
}