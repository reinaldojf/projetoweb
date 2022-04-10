package br.edu.infnet.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner{
	
	@Autowired // Evitar ter que instanciar o objeto usuarioService
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 
		Usuario usuario = new Usuario();
		usuario.setAdmin(true);
		usuario.setEmail("reijf@terra.com.br");
		usuario.setNome("Reinaldo Freitas");
		usuario.setSenha("123");
		usuarioService.incluir(usuario);
	}
	
}
