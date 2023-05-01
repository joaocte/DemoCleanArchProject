package br.com.jror.DemoCleanArchProject.api.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PessoaResponse {
    private UUID id;
    private String nome;
}
