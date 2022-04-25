package br.edu.infnet.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.projeto.model.domain.Gerente;
import br.edu.infnet.projeto.model.service.GerenteService;

@Order(4)
@Component
public class GerenteLoader implements ApplicationRunner{
	
	@Autowired // Evitar ter que instanciar o objeto gerenteService
	private GerenteService gerenteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Gerente gerente = new Gerente();
		gerente.setCpf("999.999.999-99");
		gerente.setNome("xxx");
		gerente.setSalariobase(20000);
		gerente.setSalariofinal(25000);
		gerente.setAuxiliogasolina(200);;
		gerente.setGratificacaogerente(500);
		gerente.setParticipacaolucros(false);
		gerenteService.incluir(gerente);
	}
	
}
