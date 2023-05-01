package br.com.jror.DemoCleanArchProject.application.usecase.cadastrarpessoausecase;

import br.com.jror.DemoCleanArchProject.application.command.CadastrarPessoaCommand;
import br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.cadastrarpessoausecase.CadastrarPessoaUseCase;
import br.com.jror.DemoCleanArchProject.domain.model.PessoaModel;
import br.com.jror.DemoCleanArchProject.domain.validation.PessoaValidation;
import br.com.jror.DemoCleanArchProject.infrastructure.entity.PessoaEntity;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.notification.interfaces.NotificationContext;
import br.com.jror.DemoCleanArchProject.infrastructure.repository.PessoaRepository;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarPessoaUseCaseImpl implements CadastrarPessoaUseCase {


    private final PessoaRepository pessoaRepository;

    private final PessoaValidation validation;
    private final ModelMapper mapper;

    private final NotificationContext notificationContext;


    @Autowired
    public CadastrarPessoaUseCaseImpl(PessoaRepository pessoaRepository, PessoaValidation validation, ModelMapper mapper, NotificationContext notificationContext) {
        this.pessoaRepository = pessoaRepository;
        this.validation = validation;
        this.mapper = mapper;
        this.notificationContext = notificationContext;
    }

    @SneakyThrows
    @Override
    public UUID execute(CadastrarPessoaCommand cadastrarPessoaCommand)  {


      var pessoaModel = mapper.map(cadastrarPessoaCommand, PessoaModel.class);

      var pessoaInvalida = validation.validate(pessoaModel);
      if(!pessoaInvalida.isValid())
      {
          pessoaInvalida.getErrors().forEach(x-> notificationContext.addNotification(x.getCode(), x.getMessage()));
          return null;
      }

     var pessoaEntity = mapper.map(pessoaModel, PessoaEntity.class);

      var novaPessoa = pessoaRepository.save(pessoaEntity);
        return novaPessoa.getId();
    }
}
