package br.edu.infnet.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController_backup {
	// produto GET
	//@RequestMapping(value = "/produto", method = RequestMethod.GET)
	@GetMapping(value = "/produto")
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/produto/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "produto/cadastro"; 
	}
}
