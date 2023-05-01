package br.com.jror.DemoCleanArchProject.application.handler;

import an.awesome.pipelinr.Command;
import br.com.jror.DemoCleanArchProject.application.command.CadastrarPessoaCommand;
import br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.cadastrarpessoausecase.CadastrarPessoaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class CadastrarPessoaHandler implements Command.Handler<CadastrarPessoaCommand, UUID> {

    private final CadastrarPessoaUseCase cadastrarPessoaUseCase;

    @Autowired
    public CadastrarPessoaHandler(CadastrarPessoaUseCase cadastrarPessoaUseCase) {
        this.cadastrarPessoaUseCase = cadastrarPessoaUseCase;
    }

    @Override
    public UUID handle(CadastrarPessoaCommand cadastrarPessoaCommand) {
        return cadastrarPessoaUseCase.execute(cadastrarPessoaCommand);
    }
}
