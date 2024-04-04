package com.example.Suivi.presentation.Lit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.LitDTO;
import com.example.Suivi.hopital.business.sservice.Lit.LitService;

@RestController
public class LitControllerPost {

    private final LitService litService;

    @Autowired
    public LitControllerPost(LitService litService) {
        this.litService = litService;
    }

    @CrossOrigin
    @PostMapping("/lit")
    public LitDTO ajouternvChambre(@RequestBody LitDTO litDTO) {
        return litService.addLit(litDTO);
    }
}