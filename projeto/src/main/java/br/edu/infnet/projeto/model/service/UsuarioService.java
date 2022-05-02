package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	// O método validar retorna um usuário ou nulo
	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public Collection<Usuario> obterLista() {
		// TODO Auto-generated method stub
		return (Collection<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
}
