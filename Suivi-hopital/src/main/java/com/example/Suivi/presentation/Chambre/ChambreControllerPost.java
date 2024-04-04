package com.example.Suivi.presentation.Chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.business.sservice.Chambre.ChambreService;

@RestController
public class ChambreControllerPost {

    private final ChambreService chambreService;

    @Autowired
    public ChambreControllerPost(ChambreService chambreService) {
        this.chambreService = chambreService;
    }

    @CrossOrigin
    @PostMapping("/chambre")
    public ChambreDTO ajouternvChambre(@RequestBody ChambreDTO chambreDTO) {
        return chambreService.addchambre(chambreDTO);
    }
}