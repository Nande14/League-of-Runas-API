package com.example.League.of.Runes.model;

import com.example.League.of.Runes.TipoDaRuna;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Runas extends ArvoreRunas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private double quantidade;
   private TipoDaRuna tipoDaRuna;


    @ManyToOne
    @JoinColumn(name = "arvoreRunas")
    private ArvoreRunas arvoreRunas;

}
