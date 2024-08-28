package com.br.ebac_tarefas.CategoriaMeme.service;

import com.br.ebac_tarefas.CategoriaMeme.entities.CategoriaMeme;
import com.br.ebac_tarefas.CategoriaMeme.repository.CategoriaMemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaMemeServ {

    @Autowired
    private CategoriaMemeRepo categoriaMemeRepo;

    public CategoriaMeme novoCategoriaMeme(CategoriaMeme categoriaMeme){
        return categoriaMemeRepo.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategoriaMeme(){
        return categoriaMemeRepo.findAll();
    }
}
