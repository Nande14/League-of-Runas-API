package com.example.League.of.Runes.service;

import com.example.League.of.Runes.model.Campeoes;
import com.example.League.of.Runes.Repository.CampeoesRepository;
import com.example.League.of.Runes.NotFoundEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CampeoesService {
@Autowired
private CampeoesRepository campeoesRepository;

public List<Campeoes> getAllCampeoes() {
    return campeoesRepository.findAll();
}

public Campeoes getCampeoesById(Integer id) throws NotFoundEntityException {
    return campeoesRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Campeão não encontrado"));
}

public Campeoes createCampeoes(Campeoes campeoes) {
    return campeoesRepository.save(campeoes);
}

public Campeoes updateCampeoes(Integer id, Campeoes campeoes) throws NotFoundEntityException {

    Campeoes existingCampeoes = campeoesRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Campeão não encontrado"));

    existingCampeoes.setFuncao(campeoes.getFuncao());
    
    existingCampeoes.setUsuario(campeoes.getUsuario());
  
   
    return campeoesRepository.save(existingCampeoes);
}

public void deleteCampeoes(Integer id)  throws NotFoundEntityException {
    Campeoes existingCampeoes = campeoesRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Campeão não encontrado"));
    campeoesRepository.deleteById(id);
}

}