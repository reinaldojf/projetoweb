package br.edu.infnet.projeto.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Diretor;
import br.edu.infnet.projeto.model.domain.Empregado;

@Repository
public interface EmpregadoRepository extends CrudRepository<Empregado, Integer>{

	@Query("from Empregado e where e.usuario.id = :id")
	Collection<Empregado> findAll(Integer id, Sort by);

}
