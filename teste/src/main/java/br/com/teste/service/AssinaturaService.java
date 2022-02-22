package br.com.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.teste.assembler.AssinaturaAssembler;
import br.com.teste.disassembler.AssinaturaDisassembler;
import br.com.teste.dto.AssinaturaDTO;
import br.com.teste.input.AssinaturaInput;
import br.com.teste.model.Assinatura;
import br.com.teste.repository.AssinaturaRepository;

@Service
public class AssinaturaService {
	
	@Autowired
	private AssinaturaRepository assinaturaRepository;
	
	@Autowired
	private AssinaturaDisassembler assinaturaDisassembler;
	
	@Autowired
	private AssinaturaAssembler assinaturaAssembler;
	
	@Transactional
	public AssinaturaDTO save(AssinaturaInput assinaturaInput) {
		Assinatura assinatura = assinaturaDisassembler.converterAssinaturaInputTOAssinatura(assinaturaInput);
		
		Assinatura assinaturaSalva = assinaturaRepository.save(assinatura);
		
		return assinaturaAssembler.converterAssinaturaTOAssinaturaDTO(assinaturaSalva);
	}
	
}
