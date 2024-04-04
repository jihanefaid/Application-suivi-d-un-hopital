package com.example.Suivi.presentation.Patient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.PatientDTO;
import com.example.Suivi.hopital.business.sservice.Patient.PatientService;

@RestController
public class PatientControllerGet {

    private final PatientService patientService;

    @Autowired
    public PatientControllerGet(PatientService patientService) {
        this.patientService = patientService;
    }

    @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
    @GetMapping("/patient")
    public List<PatientDTO> listPatientsDTO() {
        return patientService.lire();
    }

    @GetMapping("/patient/{id}")
    public PatientDTO getPatientById(@PathVariable("id") Long id) {
        return patientService.findById(id);
    }
}