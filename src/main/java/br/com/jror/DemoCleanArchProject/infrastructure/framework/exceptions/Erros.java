package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

import lombok.Getter;

@Getter
public enum Erros {
    P0001("Pessoa já cadastrada"),
    P0002("Não há pessoas cadastradas.");

    Erros(String messagem) {
        this.messagem = messagem;
    }

    private String messagem;

}
