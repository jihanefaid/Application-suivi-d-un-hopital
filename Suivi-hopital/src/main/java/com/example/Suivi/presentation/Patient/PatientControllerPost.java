
package com.example.Suivi.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.PatientDTO;
import com.example.Suivi.hopital.business.sservice.Patient.PatientService;

@RestController
public class PatientControllerPost {

    private final PatientService patientService;

    @Autowired
    public PatientControllerPost(PatientService patientService) {
        this.patientService = patientService;
    }

    @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
    @PostMapping("/patient")
    public PatientDTO creeNvPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.addPatient(patientDTO);
    }

}