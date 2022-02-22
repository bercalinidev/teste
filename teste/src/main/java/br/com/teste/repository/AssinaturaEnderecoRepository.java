package br.com.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.teste.model.AssinaturaEndereco;

@Repository
public interface AssinaturaEnderecoRepository extends JpaRepository<AssinaturaEndereco, Long> {	
	@Query("FROM AssinaturaEndereco ae JOIN FETCH ae.codAssinatura a WHERE a.codProduto = 55 AND ae.numCep = 06190001")
	List<AssinaturaEndereco> list();
	
}
