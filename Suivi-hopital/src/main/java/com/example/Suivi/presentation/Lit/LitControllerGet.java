package com.example.Suivi.presentation.Lit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.business.dto.LitDTO;
import com.example.Suivi.hopital.business.sservice.Lit.LitService;

@RestController
public class LitControllerGet {

    private final LitService litService;

    @Autowired
    public LitControllerGet(LitService litService) {
        this.litService = litService;
    }

    /**
     * Récupère la liste de toutes les chambres disponibles.
     * 
     * @return Une liste de {@link ChambreDTO} représentant les chambres.
     */
    @CrossOrigin
    @GetMapping("/lit")
    public List<LitDTO> getAll() {
        return litService.lire();
    }

    /**
     * Récupère une chambre spécifique par son identifiant.
     * 
     * @param id L'identifiant de la chambre à récupérer.
     * @return {@link ChambreDTO} La chambre correspondante à l'identifiant fourni.
     */
    @GetMapping("/lit/{id}")
    public LitDTO getById(@PathVariable("id") long id) {
        return litService.findById(id);
    }
}