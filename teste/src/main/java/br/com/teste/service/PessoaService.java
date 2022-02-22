package br.com.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.teste.assembler.PessoaAssembler;
import br.com.teste.disassembler.PessoaDisassembler;
import br.com.teste.dto.PessoaDTO;
import br.com.teste.input.PessoaInput;
import br.com.teste.model.Pessoa;
import br.com.teste.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaDisassembler pessoaDisassembler;
	
	@Autowired
	private PessoaAssembler pessoaAssembler;
	
	@Transactional
	public PessoaDTO save(PessoaInput pessoaInput) {
		Pessoa pessoa = pessoaDisassembler.converterPessoaInputTOPessoa(pessoaInput);
		
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		
		return pessoaAssembler.converterPessoaTOPessoaDTO(pessoaSalva);
	}
	
	public List<PessoaDTO> findAllConsultNome(String nome) {
		List<Pessoa> pessoas = pessoaRepository.listarPorNomeEVerificarPorNome(nome);
		
		return pessoaAssembler.converterPessoaToListPessoaDTO(pessoas);
	}
	
}
