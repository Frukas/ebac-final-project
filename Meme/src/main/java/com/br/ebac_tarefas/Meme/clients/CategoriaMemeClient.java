package com.br.ebac_tarefas.Meme.clients;

import com.br.ebac_tarefas.Meme.dto.CategoriaMemeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "https://localhost:8091", name = "CategoriaClient")
public interface CategoriaMemeClient {

    @GetMapping("/categorias")
    List<CategoriaMemeDTO> buscaCategorias();

    @PostMapping("/categorias")
    CategoriaMemeDTO novaCategoria(@RequestBody CategoriaMemeDTO categoriaMeme);
}
