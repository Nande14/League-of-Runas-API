package com.example.League.of.Runes.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Balanceamento {

    public String resumo;

    public String tipo;

    public Campeoes camp;

    public Balanceamento(String resumo, String tipo) {
        this.resumo = resumo;
        this.tipo = tipo;
        

    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

     @ManyToOne
    @JoinColumn(name="guias")
    private Guias guias;

}
