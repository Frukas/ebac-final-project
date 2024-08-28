package com.br.ebac_tarefas.Usuario.service;

import com.br.ebac_tarefas.Usuario.entities.Usuario;
import com.br.ebac_tarefas.Usuario.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServ {

    @Autowired
    private UsuarioRepo usuarioRepo;

    public Usuario novoUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return usuarioRepo.findAll();
    }
}
