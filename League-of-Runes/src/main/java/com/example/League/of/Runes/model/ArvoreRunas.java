package com.example.League.of.Runes.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Getter
@Setter



public class ArvoreRunas {

    public String nome;

    public String cor;

    public String tipo;

   
    public ArvoreRunas(String nome, String cor, String tipo) {
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
     
    @OneToMany(mappedBy = "arvoreRunas")
    private List<Runas> runas;

}
