package br.com.teste.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.dto.AssinaturaDTO;
import br.com.teste.model.Assinatura;

@Component
public class AssinaturaAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public AssinaturaDTO converterAssinaturaTOAssinaturaDTO(Assinatura assinatura) {
		return modelMapper.map(assinatura, AssinaturaDTO.class);
	}
	
}
