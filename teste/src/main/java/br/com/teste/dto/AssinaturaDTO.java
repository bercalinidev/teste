package br.com.teste.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssinaturaDTO {
	
	private Long codAssinatura;
	
	private PessoaReferenciaDTO codPessoa;
	
	private Long codProduto;
	
}
