package br.com.teste.disassembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.input.AssinaturaInput;
import br.com.teste.model.Assinatura;

@Component
public class AssinaturaDisassembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public Assinatura converterAssinaturaInputTOAssinatura(AssinaturaInput assinaturaInput) {
		return modelMapper.map(assinaturaInput, Assinatura.class);
	}
	
}
