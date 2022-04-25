package br.edu.infnet.projeto.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Gerente;

@Repository
public interface GerenteRepository extends CrudRepository<Gerente, Integer>{

	@Query("from Gerente g where g.usuario.id = :id")
	Collection<Gerente> findAll(Integer id, Sort by);

}
