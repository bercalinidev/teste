package br.com.teste.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.dto.AssinaturaEnderecoDTO;
import br.com.teste.input.AssinaturaEnderecoInput;
import br.com.teste.service.AssinaturaEnderecoService;

@RestController
@RequestMapping("assinaturasenderecos")
public class AssinaturaEnderecoController {
	
	@Autowired
	private AssinaturaEnderecoService assinaturaEnderecoService;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AssinaturaEnderecoDTO save(@Valid @RequestBody AssinaturaEnderecoInput assinaturaEnderecoInput) {
		return assinaturaEnderecoService.save(assinaturaEnderecoInput);
	}
	
	@GetMapping
	public List<AssinaturaEnderecoDTO> list() {
		return assinaturaEnderecoService.list();
	}
}
