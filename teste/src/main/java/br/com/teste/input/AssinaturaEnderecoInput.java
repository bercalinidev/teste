package br.com.teste.input;

import br.com.teste.model.TipoEndereco;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AssinaturaEnderecoInput {
	
	private Long codAssinaturaEndereco;
	
	private AssinaturaRefInput codAssinatura;
	
	private TipoEndereco tipoEndereco;
	
	private Long numCep;
	
}
