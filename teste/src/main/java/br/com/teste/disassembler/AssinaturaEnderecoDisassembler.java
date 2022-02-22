package br.com.teste.disassembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.input.AssinaturaEnderecoInput;
import br.com.teste.model.AssinaturaEndereco;

@Component
public class AssinaturaEnderecoDisassembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AssinaturaEndereco converterAssinaturaEnderecoTOAssinaturaEnderecoInput(AssinaturaEnderecoInput assinaturaEnderecoInput) {
		return modelMapper.map(assinaturaEnderecoInput, AssinaturaEndereco.class);
	}
	
}
