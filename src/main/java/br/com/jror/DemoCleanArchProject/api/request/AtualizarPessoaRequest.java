package br.com.jror.DemoCleanArchProject.api.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AtualizarPessoaRequest {
    private String nome;
}
