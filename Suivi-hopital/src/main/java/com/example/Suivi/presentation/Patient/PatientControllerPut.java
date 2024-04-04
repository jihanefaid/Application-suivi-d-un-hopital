package com.example.Suivi.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.PatientDTO;
import com.example.Suivi.hopital.business.sservice.Patient.PatientService;

@RestController
public class PatientControllerPut {

  private final PatientService patientService;

  @Autowired
  public PatientControllerPut(PatientService patientService) {
    this.patientService = patientService;
  }

  @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
  @PutMapping("/patient/{id}")
  public PatientDTO updatePatient(@PathVariable("id") Long id, @RequestBody PatientDTO dto) {
    return patientService.modify(id, dto);
  }
}