package br.com.helpmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.helpmoney.model.Lancamento;
import br.com.helpmoney.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
