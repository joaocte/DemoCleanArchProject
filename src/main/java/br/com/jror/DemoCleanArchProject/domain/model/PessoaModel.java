package br.com.jror.DemoCleanArchProject.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PessoaModel {
    private  UUID id;
    private String nome;
}
