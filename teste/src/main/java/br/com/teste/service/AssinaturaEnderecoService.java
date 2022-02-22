package br.com.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.teste.assembler.AssinaturaEnderecoAssembler;
import br.com.teste.disassembler.AssinaturaEnderecoDisassembler;
import br.com.teste.dto.AssinaturaEnderecoDTO;
import br.com.teste.input.AssinaturaEnderecoInput;
import br.com.teste.model.AssinaturaEndereco;
import br.com.teste.repository.AssinaturaEnderecoRepository;

@Service
public class AssinaturaEnderecoService {
	
	@Autowired
	private AssinaturaEnderecoRepository assinaturaEnderecoRepository;
	
	@Autowired
	private AssinaturaEnderecoAssembler assinaturaEnderecoAssembler;
	
	@Autowired
	private AssinaturaEnderecoDisassembler assinaturaEnderecoDisassembler;
	
	@Transactional
	public AssinaturaEnderecoDTO save(AssinaturaEnderecoInput assinaturaEnderecoInput) {
		AssinaturaEndereco assinaturaEndereco = assinaturaEnderecoDisassembler.converterAssinaturaEnderecoTOAssinaturaEnderecoInput(assinaturaEnderecoInput);
		
		AssinaturaEndereco assinaturaEnderecoSalvo = assinaturaEnderecoRepository.save(assinaturaEndereco);
		
		return assinaturaEnderecoAssembler.converterAssinaturaEnderecoTOAssinaturaEnderecoDTO(assinaturaEnderecoSalvo);
	}
	
	public List<AssinaturaEnderecoDTO> list() {
		List<AssinaturaEndereco> assinaturas = assinaturaEnderecoRepository.list();
		
		return assinaturaEnderecoAssembler.converterListAssinaturaEnderecoTOAssinaturaEnderecoDTO(assinaturas);
	}
	
}
