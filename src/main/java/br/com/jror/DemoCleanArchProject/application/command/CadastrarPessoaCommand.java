package br.com.jror.DemoCleanArchProject.application.command;

import an.awesome.pipelinr.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class CadastrarPessoaCommand implements Command<UUID> {
    private String nome;
}
