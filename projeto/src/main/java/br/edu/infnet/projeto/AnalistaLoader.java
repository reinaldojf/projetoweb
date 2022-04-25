package br.edu.infnet.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.projeto.model.domain.Analista;
import br.edu.infnet.projeto.model.service.AnalistaService;

@Order(5)
@Component
public class AnalistaLoader implements ApplicationRunner{
	
	@Autowired // Evitar ter que instanciar o objeto analistaService
	private AnalistaService analistaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Analista analista = new Analista();
		analista.setCpf("999.999.999-99");
		analista.setNome("xxx");
		analista.setSalariobase(10000);
		analista.setSalariofinal(15000);
		analista.setAuxilioalimentacao(300);
		analista.setAuxilioescola(300);
		analista.setAuxiliotransporte(300);
		analistaService.incluir(analista);
	}
	
}
