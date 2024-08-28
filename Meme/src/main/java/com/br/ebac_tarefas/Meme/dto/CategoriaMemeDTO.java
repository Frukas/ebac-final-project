package com.br.ebac_tarefas.Meme.dto;

import java.sql.Date;

public record CategoriaMemeDTO(Long id, String nome, String descricao, Date dataCadastro, Long usuarioID) {
}
