package br.edu.infnet.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnalistaController {
	// analista GET
	//@RequestMapping(value = "/diretor", method = RequestMethod.GET)
	@GetMapping(value = "/analista")
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/analista/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "analista/cadastro"; 
	}
}
