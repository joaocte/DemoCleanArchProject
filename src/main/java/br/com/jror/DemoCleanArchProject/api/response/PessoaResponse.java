package br.com.jror.DemoCleanArchProject.api.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class PessoaResponse {
    private UUID id;
    private String nome;
}
