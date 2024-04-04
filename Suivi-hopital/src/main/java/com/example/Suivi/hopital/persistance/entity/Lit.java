package com.example.Suivi.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 * Entité représentant un lit dans une chambre d'hôpital.
 */
@Entity
@Table(name = "Lit")
public class Lit {

    /**
     * Identifiant unique du lit.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lit_id")
    private int litId;

    /**
     * État du lit (occupé ou libre).
     */
    @Column(name = "Etat")
    private Boolean Etat;

    /**
     * Chambre à laquelle le lit est associé.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

    public int getLitId() {
        return litId;
    }

    public void setLitId(int litId) {
        this.litId = litId;
    }

    public Boolean getEtat() {
        return Etat;
    }

    public void setEtat(Boolean etat) {
        Etat = etat;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}