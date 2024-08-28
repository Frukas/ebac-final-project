package com.br.ebac_tarefas.Meme.controll;

import com.br.ebac_tarefas.Meme.dto.UsuarioDTO;
import com.br.ebac_tarefas.Meme.service.UsuarioServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class UsuarioControl {

    @Autowired
    private UsuarioServ usuarioServ;

    @GetMapping("/usuarios")
    public List<UsuarioDTO> buscaUsuarios() {
        return usuarioServ.listaTodosUsuarios();
    }

    @PostMapping("/usuarios")
    public UsuarioDTO novoUsuario(@RequestBody UsuarioDTO usuario) {
        return usuarioServ.novoUsuario(usuario);
    }

}
