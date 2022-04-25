package br.edu.infnet.projeto.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Gerente;

@Repository
public interface GerenteRepository extends CrudRepository<Gerente, Integer>{

}
