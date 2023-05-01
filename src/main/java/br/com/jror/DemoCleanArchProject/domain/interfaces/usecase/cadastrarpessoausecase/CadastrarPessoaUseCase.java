package br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.cadastrarpessoausecase;

import an.awesome.pipelinr.Command;
import br.com.jror.DemoCleanArchProject.application.command.CadastrarPessoaCommand;

import java.util.UUID;

public interface CadastrarPessoaUseCase {
    UUID execute(CadastrarPessoaCommand cadastrarPessoaCommand);
}
