package com.example.League.of.Runes.model;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Usuario {

    private String nickname;

    private String email;

    private String senha;

    public Usuario(String nickname, String email, String senha) {
        this.nickname = nickname;
        this.email = email;
        this.senha = senha;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

     @OneToMany(mappedBy = "usuario")
    private List<Guias> guias;

     @OneToMany(mappedBy = "usuario")
    private List<ArvoreRunas> arvoreRunas;

   
}