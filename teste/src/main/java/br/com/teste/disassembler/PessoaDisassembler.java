package br.com.teste.disassembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.input.PessoaInput;
import br.com.teste.model.Pessoa;

@Component
public class PessoaDisassembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Pessoa converterPessoaInputTOPessoa(PessoaInput pessoaInput) {
		return modelMapper.map(pessoaInput, Pessoa.class);
	}
	
}
