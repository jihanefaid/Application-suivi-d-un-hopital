package com.example.Suivi.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.business.dto.LitDTO;
import com.example.Suivi.hopital.persistance.entity.Chambre;
import com.example.Suivi.hopital.persistance.entity.Lit;

/**
 * Convertisseur pour la conversion entre les entités Lit et les objets DTO
 * LitDTO.
 */
public class LitConvert {

    // Instance singleton
    private static LitConvert instance;

    // Constructeur privé pour le singleton
    private LitConvert() {
    }

    /**
     * Méthode permettant d'obtenir l'instance unique de LitConvert.
     *
     * @return L'instance unique de LitConvert.
     */
    public static LitConvert getInstance() {
        if (instance == null) {
            instance = new LitConvert();
        }
        return instance;
    }

    /**
     * Convertit une entité Lit en un objet DTO LitDTO.
     *
     * @param lit L'entité Lit à convertir.
     * @return L'objet DTO LitDTO résultant de la conversion.
     */
    public LitDTO convertEntityToDto(Lit lit) {
        LitDTO dto = new LitDTO();
        dto.setLitId(lit.getLitId());
        dto.setEtat(lit.getEtat());

        // Convertit l'entité Chambre en ChambreDTO
        ChambreDTO chambreDTO = ChambreConvert.getInstance().convertEntityToChambreDto(lit.getChambre());
        dto.setChambreDTO(chambreDTO);

        return dto;
    }

    /**
     * Convertit un objet DTO LitDTO en une entité Lit.
     *
     * @param litDTO L'objet DTO LitDTO à convertir.
     * @return L'entité Lit résultante de la conversion.
     */
    public Lit convertDtoToEntity(LitDTO litDTO) {
        Lit litEntity = new Lit();
        litEntity.setLitId(litDTO.getLitId());
        litEntity.setEtat(litDTO.getEtat());

        // Convertit le DTO Chambre en Entité Chambre
        Chambre chambreEntity = ChambreConvert.getInstance().convertChambreDtoToEntity(litDTO.getChambreDTO());
        litEntity.setChambre(chambreEntity);

        return litEntity;
    }

    /**
     * Convertit une liste d'entités Lit en une liste d'objets DTO LitDTO.
     *
     * @param listEntities La liste d'entités Lit à convertir.
     * @return La liste d'objets DTO LitDTO résultante de la conversion.
     */
    public List<LitDTO> convertListEntityToListDto(List<Lit> listEntities) {
        List<LitDTO> listLitDTO = new ArrayList<>();
        for (Lit c : listEntities) {
            listLitDTO.add(convertEntityToDto(c));
        }
        return listLitDTO;
    }

    /**
     * Convertit une liste d'objets DTO LitDTO en une liste d'entités Lit.
     *
     * @param listDTOs La liste d'objets DTO LitDTO à convertir.
     * @return La liste d'entités Lit résultante de la conversion.
     */
    public List<Lit> convertListDtoToListEntity(List<LitDTO> listDTOs) {
        List<Lit> listEntities = new ArrayList<>();
        for (LitDTO dto : listDTOs) {
            listEntities.add(convertDtoToEntity(dto));
        }
        return listEntities;
    }
}