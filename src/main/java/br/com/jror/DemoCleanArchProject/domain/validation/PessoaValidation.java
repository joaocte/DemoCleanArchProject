package br.com.jror.DemoCleanArchProject.domain.validation;

import br.com.fluentvalidator.AbstractValidator;
import br.com.jror.DemoCleanArchProject.domain.model.PessoaModel;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions.Erros;
import br.com.jror.DemoCleanArchProject.infrastructure.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaValidation extends AbstractValidator<PessoaModel> {

    private final PessoaRepository repository;

    @Autowired
    public PessoaValidation(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void rules() {
        ruleFor(PessoaModel::getNome)
                .must(this::nomeJaCadastrado)
                .withMessage(Erros.P0001.getMessagem())
                .withCode(Erros.P0001.toString())
                .withFieldName("nome")
                .critical();


    }
    private boolean nomeJaCadastrado(final String nome) {
        var nomeJaCadastrado = repository.findByNome(nome);

        return nomeJaCadastrado.isPresent();
    }
}
