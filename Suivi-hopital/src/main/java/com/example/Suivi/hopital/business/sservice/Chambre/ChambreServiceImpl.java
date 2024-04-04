package com.example.Suivi.hopital.business.sservice.Chambre;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import com.example.Suivi.hopital.business.convert.ChambreConvert;
import com.example.Suivi.hopital.business.dto.ChambreDTO;
import com.example.Suivi.hopital.persistance.entity.Chambre;
import com.example.Suivi.hopital.persistance.repository.ChambreRepository;

@Service
public class ChambreServiceImpl implements ChambreService {

  private ChambreRepository chambreRepository;

  public ChambreServiceImpl(ChambreRepository chambreRepository) {
    this.chambreRepository = chambreRepository;
  }

  @Override
  public ChambreDTO addchambre(ChambreDTO chambre) {
    Chambre chambreEntity = ChambreConvert.getInstance().convertChambreDtoToEntity(chambre);
    @SuppressWarnings("null")
    Chambre saveChambre = chambreRepository.save(chambreEntity);
    return ChambreConvert.getInstance().convertEntityToChambreDto(saveChambre);
  }

  @Override
  public List<ChambreDTO> lire() {
    List<Chambre> listeEntitees = chambreRepository.findAll();

    return ChambreConvert.getInstance().convertListEntitiesToListDTO(listeEntitees);
  }

  @Override
  public ChambreDTO findById(long id) {
    Optional<Chambre> optionalChambre = chambreRepository.findById(id);

    Chambre chambre = optionalChambre.get();

    return ChambreConvert.getInstance().convertEntityToChambreDto(chambre);
  }

  @Override
  public ChambreDTO modifyChambre(ChambreDTO chambre, long id) {
    Optional<Chambre> chambreOptionel = chambreRepository.findById(id);

    if (chambreOptionel.isPresent()) {
      Chambre chambreBasedeDonnees = chambreOptionel.get();
      chambreBasedeDonnees.setNum_chambres(chambre.getNum_chambres());
      chambreBasedeDonnees.setNb_lits(chambre.getNb_lits());
      Chambre chambreModifiee = chambreRepository.save(chambreBasedeDonnees);
      return ChambreConvert.getInstance().convertEntityToChambreDto(chambreModifiee);
    } else {
      throw new ServiceException("La chambre n'esxite pas ");
    }

  }

  @Override
  public void delete(long id) {

    Optional<Chambre> chambreOptional = chambreRepository.findById(id);

    if (chambreOptional.isPresent()) {
      chambreRepository.deleteById(id);
    } else {
      throw new ServiceException("La chambre que vous avez selectionner n'existe pas");

    }
  }

}