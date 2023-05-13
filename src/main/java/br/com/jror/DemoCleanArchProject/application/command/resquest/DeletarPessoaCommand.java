package br.com.jror.DemoCleanArchProject.application.command.resquest;

import lombok.Getter;

import java.util.UUID;

@Getter
public class DeletarPessoaCommand {
    private UUID id;

    public DeletarPessoaCommand(UUID id) {
        this.id = id;
    }
}
