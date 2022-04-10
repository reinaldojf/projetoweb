package br.edu.infnet.projeto.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.projeto.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	// u é um objeto que será criado
	// Faz a busca no banco por email e senha e retorna um Usuario
	// Se não retornar nada, volta para a classe UsuarioService um valor nulo
	@Query("from Usuario u where email = :email and senha = :senha")
	Usuario autenticacao(String email, String senha);
}
