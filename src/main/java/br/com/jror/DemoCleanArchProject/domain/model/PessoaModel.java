package br.com.jror.DemoCleanArchProject.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class PessoaModel {
    private UUID id;
    private String nome;
}
