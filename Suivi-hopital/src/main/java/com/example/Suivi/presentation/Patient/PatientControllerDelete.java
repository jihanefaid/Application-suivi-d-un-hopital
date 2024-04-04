package com.example.Suivi.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.sservice.Patient.PatientService;



@RestController
public class PatientControllerDelete {
  
  private final PatientService patientService;

 
  @Autowired
  public PatientControllerDelete(PatientService patientService) {
    this.patientService = patientService;
  }

  
  /**
   * @param id
   */
  @CrossOrigin // Permet les requêtes cross-origin à ce point de terminaison.
  @DeleteMapping("/patient/{id}")
  public void deletePatient(@PathVariable("id") Long id) {
    patientService.supprimer(id);
  }
}