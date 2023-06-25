package com.example.League.of.Runes.service;

import com.example.League.of.Runes.model.Runas;
import com.example.League.of.Runes.Repository.RunasRepository;
import com.example.League.of.Runes.NotFoundEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RunasService {
@Autowired
private RunasRepository runasRepository;

public List<Runas> getAllRunas() {
    return runasRepository.findAll();
}

public Runas getRunasById(Integer id) throws NotFoundEntityException {
    return runasRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Erro: runas não encontradas"));
}

public Runas createRunas(Runas runas) {
    return runasRepository.save(runas);
}

public Runas updateRunas(Integer id, Runas runas) throws NotFoundEntityException {
    Runas existingRunas = runasRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Erro: runas não encontradas"));
    existingRunas.setQuantidade(runas.getQuantidade());
    existingRunas.setNome(runas.getNome());
    existingRunas.setArvoreRunas(runas.getArvoreRunas());

    return runasRepository.save(existingRunas);
}

public void deleteRunas(Integer id) {
    runasRepository.deleteById(id);
}


}

