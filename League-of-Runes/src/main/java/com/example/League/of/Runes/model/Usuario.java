package com.example.League.of.Runes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Usuario {
    @Id
    private String nome;
    private String email;
    private String senha;
    private String conta;

    @OneToMany(mappedBy = "usuario")
    private List<ArvoreRunas> arvoreRunas;

   @OneToMany(mappedBy="usuario")
    private List<Campeoes> campeoes;


}
