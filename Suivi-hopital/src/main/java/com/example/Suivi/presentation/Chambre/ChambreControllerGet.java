package com.example.Suivi.presentation.Chambre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.business.sservice.Chambre.ChambreService;

@RestController
public class ChambreControllerGet {

    private final ChambreService chambreService;

    @Autowired
    public ChambreControllerGet(ChambreService chambreService) {
        this.chambreService = chambreService;
    }

    /**
     * Récupère la liste de toutes les chambres disponibles.
     * 
     * @return Une liste de {@link ChambreDTO} représentant les chambres.
     */
    @CrossOrigin
    @GetMapping("/chambre")
    public List<ChambreDTO> getAll() {
        return chambreService.lire();
    }

    /**
     * Récupère une chambre spécifique par son identifiant.
     * 
     * @param id L'identifiant de la chambre à récupérer.
     * @return {@link ChambreDTO} La chambre correspondante à l'identifiant fourni.
     */
    @GetMapping("/chambre/{id}")
    public ChambreDTO getById(@PathVariable("id") long id) {
        return chambreService.findById(id);
    }
}