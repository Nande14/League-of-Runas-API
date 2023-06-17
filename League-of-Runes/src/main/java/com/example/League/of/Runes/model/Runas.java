package com.example.League.of.Runes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Runas extends ArvoreRunas {

    public String descricao;

    public Runas(String nome, String cor, String tipo, String descricao) {
        super(nome, cor, tipo);
        this.descricao = descricao;
    
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

     @ManyToOne
    @JoinColumn(name="arvoreRunas")
    private ArvoreRunas arvoreRunas;

   
    
}
