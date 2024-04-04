package com.example.Suivi.hopital.business.sservice.Patient;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Suivi.hopital.business.convert.PatientConvert;
import com.example.Suivi.hopital.business.dto.PatientDTO;
import com.example.Suivi.hopital.persistance.entity.Patient;
import com.example.Suivi.hopital.persistance.repository.PatientRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<PatientDTO> lire() {
        List<Patient> patients = patientRepository.findAll();
        return PatientConvert.getInstance().convertListEntityToListDto(patients);
    }

    @Override
    public PatientDTO addPatient(PatientDTO patient) {
        Patient patientEntity = PatientConvert.getInstance().convertDtoToEntity(patient);
        @SuppressWarnings("null")
        Patient savedPatient = patientRepository.save(patientEntity);
        return PatientConvert.getInstance().convertEntityToDto(savedPatient);
    }

    @Override
    public PatientDTO findById(long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();
            return PatientConvert.getInstance().convertEntityToDto(patient);
        } else {
            // Gérer le cas où aucun patient avec l'ID donné n'est trouvé
            // Par exemple, vous pouvez retourner null ou lancer une exception
            return null;
        }
    }

    @Override
    public void supprimer(long id) {

        Optional<Patient> optionalPatientDelete = patientRepository.findById(id);

        if (optionalPatientDelete.isPresent()) {
            patientRepository.deleteById(id);

        } else {
            throw new EntityNotFoundException("Le patient d'id " + id + " n'a pas été trouvé.");
        }

    }

    @Override
    public PatientDTO modify(long id, PatientDTO patient) {

        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            Patient dejaExiste = optionalPatient.get();
            dejaExiste.setNom(patient.getNom());
            dejaExiste.setPrenom(patient.getPrenom());
            dejaExiste.setSexe(patient.getSexe());
            dejaExiste.setDateNaissance(patient.getDateNaissance());
            dejaExiste.setVille(patient.getVille());
            dejaExiste.setCp(patient.getCp());

            Patient newPatient = patientRepository.save(dejaExiste);

            return PatientConvert.getInstance().convertEntityToDto(newPatient);
        } else {
            throw new EntityNotFoundException(" le patient n'existe pas ");
        }
    }

}