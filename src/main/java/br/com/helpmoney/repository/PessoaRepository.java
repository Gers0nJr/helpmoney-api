package br.com.helpmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.helpmoney.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
