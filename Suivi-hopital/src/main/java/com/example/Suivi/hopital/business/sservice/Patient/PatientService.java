package com.example.Suivi.hopital.business.sservice.Patient;

import java.util.List;

import com.example.Suivi.hopital.business.dto.PatientDTO;

public interface PatientService {

     /**
      * Service permettant de lister les patients
      *
      * @return liste de tous les contacts
      */

     List<PatientDTO> lire(); // méthodes GET pour récuperer

     /**
      * @param patient
      */
     PatientDTO addPatient(PatientDTO patient); // méthodes POST pour ajouter

     /**
      * @param patient
      */

     PatientDTO findById(long id);

     PatientDTO modify(long id, PatientDTO patient);
     
     void supprimer(long id);



}