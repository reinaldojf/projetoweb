package br.edu.infnet.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DiretorController {
	// diretor GET
	//@RequestMapping(value = "/diretor", method = RequestMethod.GET)
	@GetMapping(value = "/diretor")
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/diretor/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "diretor/cadastro"; 
	}
	// diretor/incluir
	@PostMapping(value = "/diretor/incluir")
	public String incluir() {
		return "index";
	}
}
