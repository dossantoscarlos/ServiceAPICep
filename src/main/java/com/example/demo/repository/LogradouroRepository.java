package com.example.demo.repository;

import com.example.demo.model.Logradouro;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
public interface LogradouroRepository extends JpaRepository<Logradouro, Integer> {

    @Query("SELECT l FROM logradouro l WHERE l.id_logradouro BETWEEN ?1 AND ?2")
    List<Logradouro> findFaixaLogradouro(int faixaInicial, int faixaFinal, Pageable limite);
    Logradouro cep (String cep);
    Optional<Logradouro> tipo(String tipo);

}
