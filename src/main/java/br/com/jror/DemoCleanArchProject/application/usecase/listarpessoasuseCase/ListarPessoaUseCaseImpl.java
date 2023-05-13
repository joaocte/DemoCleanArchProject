package br.com.jror.DemoCleanArchProject.application.usecase.listarpessoasuseCase;

import br.com.jror.DemoCleanArchProject.application.query.response.ListarPessoasResponse;
import br.com.jror.DemoCleanArchProject.domain.interfaces.usecase.listarpessoasusecase.ListarPessoasUseCase;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions.Erros;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions.NotFoundException;
import br.com.jror.DemoCleanArchProject.infrastructure.repository.PessoaRepository;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ListarPessoaUseCaseImpl implements ListarPessoasUseCase {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper mapper;

    public ListarPessoaUseCaseImpl(PessoaRepository pessoaRepository, ModelMapper mapper) {
        this.pessoaRepository = pessoaRepository;
        this.mapper = mapper;
    }


    @SneakyThrows
    @Override
    public ListarPessoasResponse execute() {
        var pessoasEntity = pessoaRepository.findAll();

        if(pessoasEntity.isEmpty())
            throw new NotFoundException(Erros.P0002.getMessagem());

        var response = mapper.map(pessoasEntity, ListarPessoasResponse.class);

        return  response;

    }
}
