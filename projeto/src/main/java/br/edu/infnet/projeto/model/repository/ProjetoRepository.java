package br.edu.infnet.projeto.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Empregado;
import br.edu.infnet.projeto.model.domain.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Integer>{
	@Query("from Projeto p where p.usuario.id = :id")
	Collection<Projeto> findAll(Integer id, Sort by);

	Collection<Projeto> findAll(Sort by);
}
