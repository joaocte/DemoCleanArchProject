package br.com.jror.DemoCleanArchProject.application.usecase.cadastrarpessoausecase;

import br.com.jror.DemoCleanArchProject.application.command.CadastrarPessoaCommand;
import br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.cadastrarpessoausecase.CadastrarPessoaUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CadastrarPessoaUseCaseImpl implements CadastrarPessoaUseCase {
    @Override
    public UUID execute(CadastrarPessoaCommand cadastrarPessoaCommand) {
        return null;
    }
}
