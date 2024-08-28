package com.br.ebac_tarefas.Meme.service;

import com.br.ebac_tarefas.Meme.entities.Meme;
import com.br.ebac_tarefas.Meme.repositories.MemeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeServ {

    private static final Logger log = LoggerFactory.getLogger(MemeServ.class);

    @Autowired
    private MemeRepo memeRepo;

    public Meme novoMeme(Meme meme) {
        Meme dto = memeRepo.save(meme);

        log.info("Meme criado: id ={} , nome = {}, descricao = {}, dataCadastro = {}, categoriaMeme = {}, usuario = {}",
                dto.getId(),
                dto.getNome(),
                dto.getDescricao(),
                dto.getDataCadastro(),
                dto.getCategoriaMeme(),
                dto.getUsuario());

        return dto;
    }

    public List<Meme> listaTodosMemes() {
        return memeRepo.findAll();
    }

    public Meme memeAleatorio(){
        List<Meme> memes = this.listaTodosMemes();
        double index = Math.random() * ((double) memes.size()- 1);
        return memes.get( (int)index);
    }
}
