/* 
package com.example.Suivi.hopital.presentation.Servicef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Suivi.hopital.business.dto.ServiceDTO;
import com.example.Suivi.hopital.business.sservice.Sejour.ServiceService;

@RestController
public class ServiceControllerPost {

    private final ServiceService serviceService;

    @Autowired
    public ServiceControllerPost(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @CrossOrigin // Permet les requêtes cross-origin pour ce point de terminaison.
    @PostMapping("/Service")
    public ServiceDTO creeNvService(@RequestBody ServiceDTO ServiceDTO) {
        return serviceService.addservice(ServiceDTO);
    }
    { 
        
    
 */