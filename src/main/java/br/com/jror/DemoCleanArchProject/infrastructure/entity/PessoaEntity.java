package br.com.jror.DemoCleanArchProject.infrastructure.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class PessoaEntity {
    private UUID id;
    private String nome;
}
