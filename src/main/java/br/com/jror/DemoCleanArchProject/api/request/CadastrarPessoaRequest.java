package br.com.jror.DemoCleanArchProject.api.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class CadastrarPessoaRequest {
    private String nome;
}
