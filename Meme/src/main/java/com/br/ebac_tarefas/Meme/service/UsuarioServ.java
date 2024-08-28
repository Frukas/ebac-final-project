package com.br.ebac_tarefas.Meme.service;

import com.br.ebac_tarefas.Meme.clients.UsuarioClient;
import com.br.ebac_tarefas.Meme.dto.UsuarioDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServ {

    private static final Logger log = LoggerFactory.getLogger(UsuarioServ.class);

    @Autowired
    private UsuarioClient usuarioClient;

    public UsuarioDTO novoUsuario(UsuarioDTO usuario) {
        UsuarioDTO dto = usuarioClient.novoUsuario(usuario);

        log.info("Usuario criado: id = {}, nome = {}, email = {}, dataCadastro = {}",
                dto.id(),
                dto.nome(),
                dto.email(),
                dto.dataCadastro()
        );

        return dto;
    }

    public List<UsuarioDTO> listaTodosUsuarios() {
        return usuarioClient.buscaUsuarios();
    }
}
