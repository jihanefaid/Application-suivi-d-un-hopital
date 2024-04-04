package com.example.Suivi.presentation.Chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.business.sservice.Chambre.ChambreService;

@RestController
public class ChambreControllerPut {

  private final ChambreService chambreService;

  @Autowired
  public ChambreControllerPut(ChambreService chambreService) {
    this.chambreService = chambreService;
  }

  @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
  @PutMapping("/chambre/{id}")
  public ChambreDTO updatePatient(@RequestBody ChambreDTO dto, @PathVariable("id") Long id) {
    return chambreService.modifyChambre(dto, id);
  }
}