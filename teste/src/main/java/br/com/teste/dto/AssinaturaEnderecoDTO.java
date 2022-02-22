package br.com.teste.dto;

import br.com.teste.model.TipoEndereco;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AssinaturaEnderecoDTO {
	
	
	private Long codAssinaturaEndereco;
	
	private AssinaturaDTO codAssinaturaDTO;
	
	private TipoEndereco tipoEndereco;
	
	private Long numCep;
	
}
