package com.br.ebac_tarefas.Meme.controll;

import com.br.ebac_tarefas.Meme.dto.CategoriaMemeDTO;
import com.br.ebac_tarefas.Meme.service.CategoriaMemeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class CatergoriaControl {

    @Autowired
    private CategoriaMemeServ categoriaMemeServ;

    @GetMapping("/categorias")
    public List<CategoriaMemeDTO> buscaCategorias() {
        return categoriaMemeServ.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMemeDTO novaCategoria(@RequestBody CategoriaMemeDTO categoriaMeme) {
        return categoriaMemeServ.novaCategoriaMeme(categoriaMeme);
    }


}
