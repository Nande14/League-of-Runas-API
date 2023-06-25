package com.example.League.of.Runes.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArvoreRunasDTO {
    private Integer id;
    private String imagem;
    private String runas;
    private String usuario;
    private String tipoDaRuna;

}
