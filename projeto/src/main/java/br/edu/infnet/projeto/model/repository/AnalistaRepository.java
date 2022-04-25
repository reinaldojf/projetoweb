package br.edu.infnet.projeto.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Analista;

@Repository
public interface AnalistaRepository extends CrudRepository<Analista, Integer>{

	@Query("from Analista a where a.usuario.id = :id")
	Collection<Analista> findAll(Integer id, Sort by);

}
