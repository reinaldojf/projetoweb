package br.edu.infnet.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GerenteController {
	// gerente GET
	//@RequestMapping(value = "/gerente", method = RequestMethod.GET)
	@GetMapping(value = "/gerente")
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/gerente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "gerente/cadastro"; 
	}
}
