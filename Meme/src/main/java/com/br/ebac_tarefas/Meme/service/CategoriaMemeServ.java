package com.br.ebac_tarefas.Meme.service;

import com.br.ebac_tarefas.Meme.clients.CategoriaMemeClient;
import com.br.ebac_tarefas.Meme.dto.CategoriaMemeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaMemeServ {

    private static final Logger log = LoggerFactory.getLogger(CategoriaMemeServ.class);

    @Autowired
    private CategoriaMemeClient categoriaMemeClient;

    public CategoriaMemeDTO novaCategoriaMeme(CategoriaMemeDTO categoriaMeme) {
        CategoriaMemeDTO dto = categoriaMemeClient.novaCategoria(categoriaMeme);

        log.info("Categoria criada: id = {}, nome = {}, descricao = {},dataCadastro = {}, usuarioID = {} ",
                dto.id(),
                dto.nome(),
                dto.descricao(),
                dto.dataCadastro(),
                dto.usuarioID());

        return dto;
    }

    public List<CategoriaMemeDTO> listaTodasCategorias() {
        return categoriaMemeClient.buscaCategorias();
    }
}
