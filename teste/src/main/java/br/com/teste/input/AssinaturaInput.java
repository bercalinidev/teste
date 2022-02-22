package br.com.teste.input;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AssinaturaInput {
	
	private Long codAssinatura;
	
	private PessoaRefInput codPessoa;
	
	private Long codProduto;
	
}
