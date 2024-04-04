package com.example.Suivi.hopital.business.convert;

import com.example.Suivi.hopital.persistance.entity.Patient;
import com.example.Suivi.hopital.business.dto.PatientDTO;

import java.util.ArrayList;
import java.util.List;
/**
 * Convertisseur pour la conversion entre les entités Patient et les objets DTO PatientDTO.
 */
public class PatientConvert {

    // Instance singleton
    private static PatientConvert instance;

    // Constructeur privé pour le singleton
    private PatientConvert() {
    }

    /**
     * Méthode permettant d'obtenir l'instance unique de PatientConvert.
     *
     * @return L'instance unique de PatientConvert.
     */
    public static PatientConvert getInstance() {
        if (instance == null) {
            instance = new PatientConvert();
        }
        return instance;
    }

    /**
     * Convertit une entité Patient en un objet DTO PatientDTO.
     *
     * @param patient L'entité Patient à convertir.
     * @return L'objet DTO PatientDTO résultant de la conversion.
     */
    public PatientDTO convertEntityToDto(final Patient patient) {
        PatientDTO patientDto = new PatientDTO();
        patientDto.setIdPatientDTO(patient.getIdPatient());
        patientDto.setNom(patient.getNom());
        patientDto.setPrenom(patient.getPrenom());
        patientDto.setSexe(patient.getSexe());
        patientDto.setDateNaissance(patient.getDateNaissance());
        patientDto.setVille(patient.getVille());
        patientDto.setCp(patient.getCp());
        return patientDto;
    }

    /**
     * Convertit un objet DTO PatientDTO en une entité Patient.
     *
     * @param dto L'objet DTO PatientDTO à convertir.
     * @return L'entité Patient résultante de la conversion.
     */
    public Patient convertDtoToEntity(final PatientDTO dto) {
        final Patient entity = new Patient();
        entity.setIdPatient(dto.getIdPatientDTO());
        entity.setNom(dto.getNom());
        entity.setPrenom(dto.getPrenom());
        entity.setSexe(dto.getSexe());
        entity.setDateNaissance(dto.getDateNaissance());
        entity.setVille(dto.getVille());
        entity.setCp(dto.getCp());
        return entity;
    }

    /**
     * Convertit une liste d'entités Patient en une liste d'objets DTO PatientDTO.
     *
     * @param listEntities La liste d'entités Patient à convertir.
     * @return La liste d'objets DTO PatientDTO résultante de la conversion.
     */
    public List<PatientDTO> convertListEntityToListDto(final List<Patient> listEntities) {
        final List<PatientDTO> listeDto = new ArrayList<>();
        for (final Patient entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Convertit une liste d'objets DTO PatientDTO en une liste d'entités Patient.
     *
     * @param listDto La liste d'objets DTO PatientDTO à convertir.
     * @return La liste d'entités Patient résultante de la conversion.
     */
    public List<Patient> convertListDtoToEntity(final List<PatientDTO> listDto) {
        final List<Patient> listeEntities = new ArrayList<>();
        for (final PatientDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}