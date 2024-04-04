package com.example.Suivi.hopital.business.sservice.Chambre;

import java.util.List;

import com.example.Suivi.hopital.business.dto.ChambreDTO;

/**
 * Interface définissant les opérations de service pour la gestion des chambres.
 */
public interface ChambreService {

    /**
     * Ajoute une chambre.
     *
     * @param chambre La chambre à ajouter.
     * @return Le DTO de la chambre ajoutée.
     */
    ChambreDTO addchambre(ChambreDTO chambre);

    /**
     * Récupère la liste de toutes les chambres.
     *
     * @return La liste des DTO des chambres.
     */
    List<ChambreDTO> lire();

    /**
     * Modifie une chambre existante.
     *
     * @param dto Le DTO de la chambre modifiée.
     * @param id L'identifiant de la chambre à modifier.
     * @return Le DTO de la chambre modifiée.
     */
    ChambreDTO modifyChambre(ChambreDTO dto, long id);

    /**
     * Supprime une chambre.
     *
     * @param id L'identifiant de la chambre à supprimer.
     */
    void delete(long id);

    /**
     * Recherche une chambre par son identifiant.
     *
     * @param id L'identifiant de la chambre à rechercher.
     * @return Le DTO de la chambre trouvé, ou null s'il n'existe pas.
     */
    ChambreDTO findById(long id);
}