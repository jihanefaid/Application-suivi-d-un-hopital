package com.example.Suivi.presentation.Servicef;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.ServiceDTO;
import com.example.Suivi.hopital.business.sservice.Sejour.ServiceService;

@RestController
public class ServiceControllerGet {

    private final ServiceService serviceService;

    @Autowired
    public ServiceControllerGet(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
    @GetMapping("/service")
    public List<ServiceDTO> listServicesDTO() {
        return serviceService.lire();
    }

    @GetMapping("/service/{id}")
    public ServiceDTO getPatientById(@PathVariable("id") Long id) {
        return serviceService.findById(id);
    }
}