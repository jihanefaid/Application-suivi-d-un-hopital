package com.example.Suivi.hopital.business.convert;

import com.example.Suivi.hopital.business.dto.PatientDTO;
import com.example.Suivi.hopital.business.dto.ServiceDTO;
import com.example.Suivi.hopital.persistance.entity.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Convertisseur pour la conversion entre les entités Service et les objets DTO
 * ServiceDTO.
 */
public class ServiceConvert {

    // Instance singleton
    private static ServiceConvert instance;

    // Constructeur privé pour le singleton
    private ServiceConvert() {
    }

    /**
     * Méthode permettant d'obtenir l'instance unique de ServiceConvert.
     *
     * @return L'instance unique de ServiceConvert.
     */
    public static ServiceConvert getInstance() {
        if (instance == null) {
            instance = new ServiceConvert();
        }
        return instance;
    }

    /**
     * Convertit une entité Service en un objet DTO ServiceDTO.
     *
     * @param savedService L'entité Service à convertir.
     * @return L'objet DTO ServiceDTO résultant de la conversion.
     */
    public ServiceDTO convertEntityToDto(org.springframework.stereotype.Service savedService) {
        ServiceDTO dto = new ServiceDTO();
        dto.setServiceId(((ServiceDTO) savedService).getServiceId());
        dto.setNom(((PatientDTO) savedService).getNom());

        // Convertit l'entité Patient en PatientDTO
        PatientDTO patientDTO = PatientConvert.getInstance().convertEntityToDto(((Service) savedService).getPatient());
        dto.setPatientDTO(patientDTO);

        return dto;
    }

    /**
     * Convertit un objet DTO ServiceDTO en une entité Service.
     *
     * @param serviceDTO L'objet DTO ServiceDTO à convertir.
     * @return L'entité Service résultante de la conversion.
     */
    public Service convertDtoToEntity(ServiceDTO serviceDTO) {
        Service serviceEntity = new Service();
        serviceEntity.setServiceId(serviceDTO.getServiceId());
        serviceEntity.setNom(serviceDTO.getNom());
        // Vous pouvez ajouter d'autres attributs à mapper ici

        return serviceEntity;
    }

    /**
     * Convertit une liste d'entités Service en une liste d'objets DTO ServiceDTO.
     *
     * @param listEntities La liste d'entités Service à convertir.
     * @return La liste d'objets DTO ServiceDTO résultante de la conversion.
     */
    public List<ServiceDTO> convertListEntityToListDto(List<Service> listEntities) {
        List<ServiceDTO> listServiceDTO = new ArrayList<>();
        for (Service serviceEntity : listEntities) {
            listServiceDTO.add(convertEntityToDto((org.springframework.stereotype.Service) serviceEntity));
        }
        return listServiceDTO;
    }

    /**
     * Convertit une liste d'objets DTO ServiceDTO en une liste d'entités Service.
     *
     * @param listDTOs La liste d'objets DTO ServiceDTO à convertir.
     * @return La liste d'entités Service résultante de la conversion.
     */
    public List<Service> convertListDtoToListEntity(List<ServiceDTO> listDTOs) {
        List<Service> listEntities = new ArrayList<>();
        for (ServiceDTO dto : listDTOs) {
            listEntities.add(convertDtoToEntity(dto));
        }
        return listEntities;
    }
}