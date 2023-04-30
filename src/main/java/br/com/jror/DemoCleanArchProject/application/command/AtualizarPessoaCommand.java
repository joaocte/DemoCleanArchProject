package br.com.jror.DemoCleanArchProject.application.command;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public class AtualizarPessoaCommand {
    private String nome;
    private @Setter UUID    id;

    public AtualizarPessoaCommand(String nome, UUID id) {
        this.nome = nome;
        this.id = id;
    }
}
