package br.com.teste.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.dto.AssinaturaEnderecoDTO;
import br.com.teste.model.AssinaturaEndereco;

@Component
public class AssinaturaEnderecoAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AssinaturaEnderecoDTO converterAssinaturaEnderecoTOAssinaturaEnderecoDTO(AssinaturaEndereco assinaturaEndereco) {
		return modelMapper.map(assinaturaEndereco, AssinaturaEnderecoDTO.class);
	}
	
	public List<AssinaturaEnderecoDTO> converterListAssinaturaEnderecoTOAssinaturaEnderecoDTO(List<AssinaturaEndereco> assinaturas) {
		return assinaturas.stream()
					.map(a -> converterAssinaturaEnderecoTOAssinaturaEnderecoDTO(a))
					.collect(Collectors.toList());
	}
	
}
