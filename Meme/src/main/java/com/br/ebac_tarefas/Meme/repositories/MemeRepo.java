package com.br.ebac_tarefas.Meme.repositories;

import com.br.ebac_tarefas.Meme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepo extends JpaRepository<Meme, Long> {
}
