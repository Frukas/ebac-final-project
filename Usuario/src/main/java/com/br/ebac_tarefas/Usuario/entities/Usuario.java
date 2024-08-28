package com.br.ebac_tarefas.Usuario.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_usuario")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;
}
