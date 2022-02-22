package br.com.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.teste.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	@Query("FROM Pessoa as p WHERE p.nome = ?1")
	List<Pessoa> listarPorNomeEVerificarPorNome(String nome);
	
}
