package com.example.Suivi.hopital.business.sservice.Sejour;

import java.util.List;

import com.example.Suivi.hopital.business.dto.ServiceDTO;

public interface ServiceService {

    // ServiceDTO addservice(ServiceDTO service);

    List<ServiceDTO> lire();

    ServiceDTO findById(long id);

}