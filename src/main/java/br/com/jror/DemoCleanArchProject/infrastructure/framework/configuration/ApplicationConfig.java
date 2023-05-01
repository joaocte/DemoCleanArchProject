package br.com.jror.DemoCleanArchProject.infrastructure.framework.configuration;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Notification;
import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Pipelinr;
import br.com.jror.DemoCleanArchProject.application.command.CadastrarPessoaCommand;
import br.com.jror.DemoCleanArchProject.application.handler.CadastrarPessoaHandler;
import br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.cadastrarpessoausecase.CadastrarPessoaUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class ApplicationConfig {

    private final CadastrarPessoaUseCase cadastrarPessoaUseCase;

    public ApplicationConfig(CadastrarPessoaUseCase cadastrarPessoaUseCase) {
        this.cadastrarPessoaUseCase = cadastrarPessoaUseCase;
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
    @Bean
    Pipeline pipeline(ObjectProvider<Command.Handler> commandHandlers, ObjectProvider<Notification.Handler> notificationHandlers, ObjectProvider<Command.Middleware> middlewares) {
        return new Pipelinr()
                .with(commandHandlers::stream)
                .with(notificationHandlers::stream)
                .with(middlewares::orderedStream);
    }
}