package br.edu.infnet.projeto.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Diretor;

@Repository
public interface DiretorRepository extends CrudRepository<Diretor, Integer>{

	@Query("from Diretor d where d.usuario.id = :id")
	Collection<Diretor> findAll(Integer id, Sort by);

}
