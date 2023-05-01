package br.com.jror.DemoCleanArchProject.infrastructure.repository;

import br.com.jror.DemoCleanArchProject.infrastructure.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PessoaRepository extends JpaRepository<PessoaEntity, UUID> {
    Optional<PessoaEntity> findByNome(String nome);

}
