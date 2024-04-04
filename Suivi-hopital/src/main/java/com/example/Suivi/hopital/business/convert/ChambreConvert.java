package com.example.Suivi.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.persistance.entity.Chambre;

/**
 * Convertisseur pour la conversion entre les entités Chambre et les objets DTO
 * ChambreDTO.
 */
public class ChambreConvert {

  // Instance singleton
  private static ChambreConvert instance;

  // Constructeur privé pour le singleton
  private ChambreConvert() {
  }

  /**
   * Méthode permettant d'obtenir l'instance unique de ChambreConvert.
   *
   * @return L'instance unique de ChambreConvert.
   */
  public static ChambreConvert getInstance() {
    if (instance == null) {
      instance = new ChambreConvert();
    }
    return instance;
  }

  /**
   * Convertit une entité Chambre en un objet DTO ChambreDTO.
   *
   * @param chambreEntity L'entité Chambre à convertir.
   * @return L'objet DTO ChambreDTO résultant de la conversion.
   */
  public ChambreDTO convertEntityToChambreDto(final Chambre chambreEntity) {
    ChambreDTO dto = new ChambreDTO();
    dto.setChambre_id(chambreEntity.getChambre_id());
    dto.setNum_chambres(chambreEntity.getNum_chambres());
    dto.setNb_lits(chambreEntity.getNb_lits());
    return dto;
  }

  /**
   * Convertit un objet DTO ChambreDTO en une entité Chambre.
   *
   * @param chambreDto L'objet DTO ChambreDTO à convertir.
   * @return L'entité Chambre résultant de la conversion.
   */
  public Chambre convertChambreDtoToEntity(final ChambreDTO chambreDto) {
    Chambre entity = new Chambre();
    entity.setChambre_id(chambreDto.getChambre_id());
    entity.setNum_chambres(chambreDto.getNum_chambres());
    entity.setNb_lits(chambreDto.getNb_lits());
    return entity;
  }

  /**
   * Convertit une liste d'entités Chambre en une liste d'objets DTO ChambreDTO.
   *
   * @param listChambres La liste d'entités Chambre à convertir.
   * @return La liste d'objets DTO ChambreDTO résultante de la conversion.
   */
  public List<ChambreDTO> convertListEntitiesToListDTO(List<Chambre> listChambres) {
    List<ChambreDTO> listChambreDto = new ArrayList<>();
    for (final Chambre chambre : listChambres) {
      listChambreDto.add(convertEntityToChambreDto(chambre));
    }
    return listChambreDto;
  }

  /**
   * Convertit une liste d'objets DTO ChambreDTO en une liste d'entités Chambre.
   *
   * @param chambresDto La liste d'objets DTO ChambreDTO à convertir.
   * @return La liste d'entités Chambre résultante de la conversion.
   */
  public List<Chambre> convertListDtoToListEntity(List<ChambreDTO> chambresDto) {
    List<Chambre> listChambresEntity = new ArrayList<>();
    for (final ChambreDTO dto : chambresDto) {
      listChambresEntity.add(convertChambreDtoToEntity(dto));
    }
    return listChambresEntity;
  }
}