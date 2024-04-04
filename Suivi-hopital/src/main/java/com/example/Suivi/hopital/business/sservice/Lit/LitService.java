package com.example.Suivi.hopital.business.sservice.Lit;

import java.util.List;

import com.example.Suivi.hopital.business.dto.LitDTO;

public interface LitService {

     /**
      * Service permettant de lister les lits
      *
      * @return liste de tous les contacts
      */

     List<LitDTO> lire(); // méthodes GET pour récuperer

     /**
      * @param lit
      */
     LitDTO addLit(LitDTO lit); // méthodes POST pour ajouter

     /**
      * @param patient
      */

     LitDTO findById(long id);

     LitDTO modify(long id, LitDTO dto);

     void supprimer(long id);

}