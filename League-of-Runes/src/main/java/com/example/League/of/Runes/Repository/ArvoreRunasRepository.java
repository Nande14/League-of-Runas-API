package com.example.League.of.Runes.Repository;

import com.example.League.of.Runes.model.ArvoreRunas;
import com.example.League.of.Runes.TipoDaRuna;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
public interface ArvoreRunasRepository extends JpaRepository<ArvoreRunas, Integer>{
    
    List<ArvoreRunas> findByTipoDaRuna(TipoDaRuna tipoDaRuna);
    
    
    
    
    long countByNome(String nome);
    void deleteById(Integer id);
    boolean existsByNome(String nome);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}
