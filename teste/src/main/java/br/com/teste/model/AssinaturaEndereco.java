package br.com.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "assinatura_endereco")
public class AssinaturaEndereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Column(name = "cod_assinatura_endereco")
	private Long codAssinaturaEndereco;
	
	@ManyToOne
	@JoinTable(name = "cod_assinatura")
	private Assinatura codAssinatura;
	
	@Column(name = "tipo_endereco")
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;
	
	@Column(name = "numero_cep")
	private Long numCep;

}
