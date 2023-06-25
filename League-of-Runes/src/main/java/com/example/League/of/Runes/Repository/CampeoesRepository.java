package com.example.League.of.Runes.Repository;

import com.example.League.of.Runes.model.ArvoreRunas;
import com.example.League.of.Runes.model.Campeoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CampeoesRepository extends JpaRepository<Campeoes, Integer> {
    List<Campeoes> findByNota(double funcao);

    void deleteById(Integer id);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
}
