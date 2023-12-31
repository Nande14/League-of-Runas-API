package com.example.League.of.Runes.service;

import com.example.League.of.Runes.model.Usuario;
import com.example.League.of.Runes.Repository.UsuarioRepository;
import com.example.League.of.Runes.NotFoundEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }


    public Usuario getUsuarioById(String conta) throws NotFoundEntityException {
        return usuarioRepository.findById(conta)
                .orElseThrow(() -> new NotFoundEntityException("Usuario não encontrado"));
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(String conta, Usuario usuario) throws NotFoundEntityException {
        Usuario existingUsuario = usuarioRepository.findById(conta)
                .orElseThrow(() -> new NotFoundEntityException("Usuario não encontrado"));
        existingUsuario.setNome(usuario.getNome());
        existingUsuario.setEmail(usuario.getEmail());
        existingUsuario.setSenha(usuario.getSenha());
        existingUsuario.setConta(usuario.getConta());

        return usuarioRepository.save(existingUsuario);
    }

    public void deleteUsuario(String conta) {
        usuarioRepository.deleteById(conta);
    }
}
