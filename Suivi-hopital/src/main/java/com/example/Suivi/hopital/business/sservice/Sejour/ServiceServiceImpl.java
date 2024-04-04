package com.example.Suivi.hopital.business.sservice.Sejour;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Suivi.hopital.business.convert.ServiceConvert;
import com.example.Suivi.hopital.business.dto.ServiceDTO;
import com.example.Suivi.hopital.persistance.repository.ServiceRepository;

@Service
public class ServiceServiceImpl implements ServiceService {

    public final ServiceRepository serviceRepository;

    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<ServiceDTO> lire() {
        List<com.example.Suivi.hopital.persistance.entity.Service> listeServices = serviceRepository.findAll();
        return ServiceConvert.getInstance().convertListEntityToListDto(listeServices);
    }

    @Override
    public ServiceDTO findById(long id) {
        Optional<com.example.Suivi.hopital.persistance.entity.Service> optionalService = serviceRepository.findById(id);
        if (optionalService.isPresent()) {
            Service service = (Service) optionalService.get();
            return ServiceConvert.getInstance().convertEntityToDto(service);
        } else {
            throw new RuntimeException("Le service avec l'ID " + id + " n'existe pas.");
        }
    }

    /*
     * @Override
     * public ServiceDTO addService(ServiceDTO serviceDto) {
     * Service serviceEntity =
     * ServiceConvert.getInstance().convertDtoToEntity(serviceDto);
     * Service savedService = serviceRepository.save(serviceEntity);
     * return ServiceConvert.getInstance().convertEntityToDto(savedService);
     * }
     */
}