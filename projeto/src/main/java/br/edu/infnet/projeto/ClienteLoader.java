package br.edu.infnet.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.projeto.model.domain.Cliente;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.ClienteService;

@Order(2)
@Component
public class ClienteLoader implements ApplicationRunner{
	
	@Autowired // Evitar ter que instanciar o objeto usuarioService
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 
		Usuario usuario = new Usuario();
		usuario.setId(1); // Foi o usuário criado pelo UsuarioLoader
		
		Cliente cliente = new Cliente();
		cliente.setCnpj("111.111.111-11");
		cliente.setEmail("acme@acme.com.br");
		cliente.setRazaosocial("ACME Ltda");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
	}
	
}

