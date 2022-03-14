package br.edu.infnet.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
	// cliente GET
	//@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	@GetMapping(value = "/cliente")
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/cliente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "cliente/cadastro"; 
	}
}
