package com.br.ebac_tarefas.Meme.dto;

import java.sql.Date;

public record UsuarioDTO(Long id, String nome, String email, Date dataCadastro) {
}
