package br.com.teste.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.dto.PessoaDTO;
import br.com.teste.model.Pessoa;

@Component
public class PessoaAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public PessoaDTO converterPessoaTOPessoaDTO(Pessoa pessoa) {
		return modelMapper.map(pessoa, PessoaDTO.class);
	}
	
	public List<PessoaDTO> converterPessoaToListPessoaDTO(List<Pessoa> pessoas) {
		return pessoas.stream()
					.map(p -> converterPessoaTOPessoaDTO(p))
					.collect(Collectors.toList());
	}
	
}
