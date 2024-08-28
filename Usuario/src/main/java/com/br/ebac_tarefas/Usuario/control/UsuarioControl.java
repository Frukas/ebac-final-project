package com.br.ebac_tarefas.Usuario.control;

import com.br.ebac_tarefas.Usuario.entities.Usuario;
import com.br.ebac_tarefas.Usuario.service.UsuarioServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioControl {

    @Autowired
    private UsuarioServ usuarioServ;

    @GetMapping("/usuarios")
    public List<Usuario> buscaUsuarios() {
        return usuarioServ.listaTodosUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return usuarioServ.novoUsuario(usuario);
    }
}
