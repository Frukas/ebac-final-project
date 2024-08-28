package com.br.ebac_tarefas.Meme.clients;

import com.br.ebac_tarefas.Meme.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "https://localhost:8092", name = "UsuarioClient")
public interface UsuarioClient {

    @GetMapping("/usuarios")
    List<UsuarioDTO> buscaUsuarios();

    @PostMapping("/usuarios")
    UsuarioDTO novoUsuario(@RequestBody UsuarioDTO usuario);
}
