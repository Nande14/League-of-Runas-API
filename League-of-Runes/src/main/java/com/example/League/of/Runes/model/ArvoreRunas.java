package com.example.League.of.Runes.model;

import com.example.League.of.Runes.TipoDaRuna;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome;

    private String cor;

    private TipoDaRuna tipoDaRuna;

    public ArvoreRunas(String nome, String cor, String tipo) {
        this.nome = nome;
        this.cor = cor;
        this.tipoDaRuna = tipoDaRuna;

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

    @ManyToOne
    @JoinColumn(name = "usuario_conta")
    private Usuario usuario;

    @OneToMany(mappedBy = "arvoreRunas")
    private List<Runas> runas;

}
