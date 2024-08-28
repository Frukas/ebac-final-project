package com.br.ebac_tarefas.Usuario.repository;

import com.br.ebac_tarefas.Usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
