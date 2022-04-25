package br.edu.infnet.projeto.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Analista;

@Repository
public interface AnalistaRepository extends CrudRepository<Analista, Integer>{

}
