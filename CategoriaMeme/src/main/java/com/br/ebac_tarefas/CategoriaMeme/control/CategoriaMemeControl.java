package com.br.ebac_tarefas.CategoriaMeme.control;

import com.br.ebac_tarefas.CategoriaMeme.entities.CategoriaMeme;
import com.br.ebac_tarefas.CategoriaMeme.service.CategoriaMemeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaMemeControl {

    @Autowired
    private CategoriaMemeServ categoriaMemeServ;

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        return categoriaMemeServ.listaTodasCategoriaMeme();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return categoriaMemeServ.novoCategoriaMeme(categoriaMeme);
    }

}
