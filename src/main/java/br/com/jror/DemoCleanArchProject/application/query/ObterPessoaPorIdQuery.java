package br.com.jror.DemoCleanArchProject.application.query;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class ObterPessoaPorIdQuery {
    private UUID id;
}
