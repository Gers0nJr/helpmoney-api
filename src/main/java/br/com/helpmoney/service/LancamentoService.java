package br.com.helpmoney.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpmoney.model.Lancamento;
import br.com.helpmoney.model.Pessoa;
import br.com.helpmoney.repository.LancamentoRepository;
import br.com.helpmoney.repository.PessoaRepository;
import br.com.helpmoney.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		
		if(pessoa == null || pessoa.isInativo()) {
			
			throw new PessoaInexistenteOuInativaException();
			
		}
		
		return lancamentoRepository.save(lancamento);
	}

}
