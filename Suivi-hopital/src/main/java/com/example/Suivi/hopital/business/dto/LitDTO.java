package com.example.Suivi.hopital.business.dto;

/**
 * Objet DTO (Data Transfer Object) représentant un lit.
 */
public class LitDTO {

    private int litId; // Identifiant du lit
    private Boolean etat; // État du lit
    private ChambreDTO chambreDTO; // Chambre associée au lit
    public int getServiceId; // Attribut non utilisé

    /**
     * Obtient l'identifiant du lit.
     *
     * @return L'identifiant du lit.
     */

    /**
     * Obtient l'état du lit.
     *
     * @return L'état du lit.
     */
    public Boolean getEtat() {
        return etat;
    }

    public int getLitId() {
        return litId;
    }

    public void setLitId(int litId) {
        this.litId = litId;
    }

    /**
     * Définit l'état du lit.
     *
     * @param etat L'état du lit à définir.
     */
    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    /**
     * Obtient la chambre associée au lit.
     *
     * @return La chambre associée au lit.
     */
    public ChambreDTO getChambreDTO() {
        return chambreDTO;
    }

    /**
     * Définit la chambre associée au lit.
     *
     * @param chambreDTO La chambre associée au lit à définir.
     */
    public void setChambreDTO(ChambreDTO chambreDTO) {
        this.chambreDTO = chambreDTO;
    }

}