package br.com.jror.DemoCleanArchProject.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Entity
@Table(name = "Pessoa")
@Setter

public class PessoaEntity {

    public PessoaEntity() {
        this.id = UUID.randomUUID();
    }

    @Id
    private UUID id;
    private String nome;
}
