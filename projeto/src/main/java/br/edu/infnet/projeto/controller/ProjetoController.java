package br.edu.infnet.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoController {
	// projeto GET
	//@RequestMapping(value = "/projeto", method = RequestMethod.GET)
	@GetMapping(value = "/projeto")
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/projeto/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "projeto/cadastro"; 
	}
}
