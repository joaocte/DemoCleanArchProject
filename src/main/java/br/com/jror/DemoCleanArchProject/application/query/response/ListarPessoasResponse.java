package br.com.jror.DemoCleanArchProject.application.query.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class ListarPessoasResponse {
    private Collection<PessoaQueryResponse> pessoas;
}
