package br.com.teste.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.dto.PessoaDTO;
import br.com.teste.input.PessoaInput;
import br.com.teste.service.PessoaService;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PessoaDTO save(@Valid @RequestBody PessoaInput pessoaInput) {
		return pessoaService.save(pessoaInput);
	}
	
	@GetMapping("/{nome}")
	public List<PessoaDTO> findAll(@PathVariable String nome) {
		return pessoaService.findAllConsultNome(nome);
	}
	

}
