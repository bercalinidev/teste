package br.com.teste.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.dto.AssinaturaDTO;
import br.com.teste.input.AssinaturaInput;
import br.com.teste.service.AssinaturaService;

@RestController
@RequestMapping("assinaturas")
public class AssinaturaController {

	@Autowired
	private AssinaturaService assinaturaService;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AssinaturaDTO save(@Valid @RequestBody AssinaturaInput assinaturaInput) {
		return assinaturaService.save(assinaturaInput);
	}
	
}
