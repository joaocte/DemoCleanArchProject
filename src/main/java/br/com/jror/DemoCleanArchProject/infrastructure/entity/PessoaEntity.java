package br.com.jror.DemoCleanArchProject.infrastructure.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter

public class PessoaEntity {

    public PessoaEntity(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID();
    }

    private UUID id;
    private String nome;
}
