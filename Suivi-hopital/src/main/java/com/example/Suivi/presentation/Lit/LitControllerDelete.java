package com.example.Suivi.presentation.Lit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.sservice.Lit.LitService;

@RestController
public class LitControllerDelete {

    private final LitService litService;

    /**
     * Construit le contrôleur avec le service de gestion des chambres injecté.
     * 
     * @param chambreService Le service de gestion des chambres.
     */
    @Autowired
    public LitControllerDelete(LitService litService) {
        this.litService = litService;
    }

    /**
     * Supprime une chambre de l'application en utilisant son identifiant.
     * 
     * @param id L'identifiant de la chambre à supprimer.
     */
    @CrossOrigin
    @DeleteMapping("/lit/{id}")
    public void deleteById(@PathVariable("id") long id) {
        litService.supprimer(id);
    }
}