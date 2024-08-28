package com.br.ebac_tarefas.Meme.controll;


import com.br.ebac_tarefas.Meme.entities.Meme;
import com.br.ebac_tarefas.Meme.service.MemeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class MemeControl {

    @Autowired
    private MemeServ memeServ;

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        return memeServ.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        return memeServ.novoMeme(meme);
    }

    @GetMapping("/memes/aleatorio")
    public Meme MemesAleatorio() {
        return memeServ.memeAleatorio();
    }
}
