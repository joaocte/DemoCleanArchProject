package br.com.jror.DemoCleanArchProject.application.query.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PessoaQueryResponse {
    private UUID id;
    private String nome;
}
