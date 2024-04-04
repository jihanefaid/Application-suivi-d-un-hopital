package com.example.Suivi.presentation.Lit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.LitDTO;
import com.example.Suivi.hopital.business.sservice.Lit.LitService;

@RestController
public class LitControllerPut {

    private final LitService litService;

    @Autowired
    public LitControllerPut(LitService litService) {
        this.litService = litService;
    }

    @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
    @PutMapping("/lit/{id}")
    public LitDTO updateLit(@RequestBody LitDTO dto, @PathVariable("id") Long id) {
        return litService.modify(id, dto); 
    }
}