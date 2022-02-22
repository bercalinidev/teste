package br.com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.model.Assinatura;

@Repository
public interface AssinaturaRepository extends JpaRepository<Assinatura, Long>{

}
