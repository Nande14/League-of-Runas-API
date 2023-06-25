package com.example.League.of.Runes.service;

import com.example.League.of.Runes.model.ArvoreRunas;
import com.example.League.of.Runes.Repository.ArvoreRunasRepository;
import com.example.League.of.Runes.NotFoundEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ArvoreRunasService {
@Autowired
private ArvoreRunasRepository arvoreRunasRepository;
public List<ArvoreRunas> getAllArvoreRunas() {
    return arvoreRunasRepository.findAll();
}

public ArvoreRunas getArvoreRunasById(Integer id) throws NotFoundEntityException {
    return arvoreRunasRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Erro ao encontrar a Arvore de Runas"));
}

public ArvoreRunas createArvoreRunas(ArvoreRunas arvoreRunas) {
    return arvoreRunasRepository.save(arvoreRunas);
}

public ArvoreRunas updateArvoreRunas(Integer id, ArvoreRunas arvoreRunas) throws NotFoundEntityException {
    ArvoreRunas existingArvoreRunas = arvoreRunasRepository.findById(id)
            .orElseThrow(() -> new NotFoundEntityException("Erro ao encontrar a Arvore de Runas"));
    existingArvoreRunas.setNome(arvoreRunas.getNome());
    
    existingArvoreRunas.setUsuario(arvoreRunas.getUsuario());
    return arvoreRunasRepository.save(existingArvoreRunas);
}

public void deleteArvoreRunas(Integer id) {
    arvoreRunasRepository.deleteById(id);
}

}