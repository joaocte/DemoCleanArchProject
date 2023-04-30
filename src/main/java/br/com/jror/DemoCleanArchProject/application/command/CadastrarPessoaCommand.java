package br.com.jror.DemoCleanArchProject.application.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CadastrarPessoaCommand {
    private String nome;
}
