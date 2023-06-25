package com.example.League.of.Runes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Campeoes {
    private Integer id;


    public String funcao;

   

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @ManyToOne
    @JoinColumn(name="usuario_conta")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="arvoreRunas_id")
    private ArvoreRunas arvoreRunas;

}