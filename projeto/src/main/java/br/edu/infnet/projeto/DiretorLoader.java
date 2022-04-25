package br.edu.infnet.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.projeto.model.domain.Diretor;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.DiretorService;

@Order(3)
@Component
public class DiretorLoader implements ApplicationRunner{
	
	@Autowired // Evitar ter que instanciar o objeto diretorService
	private DiretorService diretorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Diretor diretor = new Diretor();
		diretor.setCpf("999.999.999-99");
		diretor.setNome("xxx");
		diretor.setSalariobase(10000);
		diretor.setSalariofinal(15000);
		diretor.setAuxiliovoo(1000);
		diretor.setBonusdiretor(5000);
		diretor.setCartaocorporativo(false);;
		diretorService.incluir(diretor);
	}
	
}
