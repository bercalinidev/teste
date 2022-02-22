package br.com.teste.input;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaInput {
	
	private Long codPessoa;
	
	private String nome;
	
	
}
