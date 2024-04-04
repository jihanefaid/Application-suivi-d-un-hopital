package com.example.Suivi.hopital.business.sservice.Lit;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Suivi.hopital.business.convert.LitConvert;
import com.example.Suivi.hopital.business.dto.LitDTO;
import com.example.Suivi.hopital.persistance.entity.Lit;
import com.example.Suivi.hopital.persistance.repository.LitRepository;

@Service
public class LitServiceImpl implements LitService {

    private final LitRepository litRepository;

    public LitServiceImpl(LitRepository litRepository) {
        this.litRepository = litRepository;
    }

    @Override
    public List<LitDTO> lire() {
        List<Lit> listeLits = litRepository.findAll();
        return LitConvert.getInstance().convertListEntityToListDto(listeLits);
    }

    @Override
    public LitDTO addLit(LitDTO litDto) {
        Lit litEntity = LitConvert.getInstance().convertDtoToEntity(litDto);
        @SuppressWarnings("null")
        Lit savedLit = litRepository.save(litEntity);
        return LitConvert.getInstance().convertEntityToDto(savedLit);
    }

    @Override
    public LitDTO findById(long id) {
        Optional<Lit> optionalLit = litRepository.findById(id);
        if (optionalLit.isPresent()) {
            Lit lit = optionalLit.get();
            return LitConvert.getInstance().convertEntityToDto(lit);
        } else {
            throw new RuntimeException("Le lit avec l'ID " + id + " n'existe pas.");
        }
    }

    @Override
    public LitDTO modify(long id, LitDTO dto) {
        Optional<Lit> optionalLit = litRepository.findById(id);
        if (optionalLit.isPresent()) {
            Lit litEntity = optionalLit.get();
            litEntity.setEtat(dto.getEtat());
            Lit modifiedLit = litRepository.save(litEntity);
            return LitConvert.getInstance().convertEntityToDto(modifiedLit);
        } else {
            throw new RuntimeException("Le lit avec l'ID " + id + " n'existe pas.");
        }
    }

    @Override
    public void supprimer(long id) {
        Optional<Lit> optionalLit = litRepository.findById(id);
        if (optionalLit.isPresent()) {
            litRepository.deleteById(id);
        } else {
            throw new RuntimeException("Le lit avec l'ID " + id + " n'existe pas.");
        }
    }
}