package com.example.League.of.Runes.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RunasDTO {
    private Integer id;
    private String nome;
    private double quintidade;
    private String usuario;
    private String tipoDaRuna;
    private Integer arvoreRunas_id;
    
}

