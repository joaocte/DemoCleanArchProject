package br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.cadastrarpessoausecase;

import br.com.jror.DemoCleanArchProject.application.command.resquest.CadastrarPessoaCommand;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions.AlreadyRegisteredException;

import java.util.UUID;

public interface CadastrarPessoaUseCase {
    UUID execute(CadastrarPessoaCommand cadastrarPessoaCommand) throws AlreadyRegisteredException;
}
