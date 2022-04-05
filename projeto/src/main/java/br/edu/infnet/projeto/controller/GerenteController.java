package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.projeto.model.domain.Gerente;
import br.edu.infnet.projeto.model.service.GerenteService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GerenteController {
	
	// Ao invés de fazer o que está abaixo
	//GerenteService gerenteService = new GerenteService();
	// Faz-se
	@Autowired // Esconde a iniciação de gerenteService
	private GerenteService gerenteService;
	
	// gerente GET
	//@RequestMapping(value = "/gerente", method = RequestMethod.GET)
	@GetMapping(value = "/gerente") // Identifica quando vem da página /gerente via o método get
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/gerente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "gerente/cadastro"; // Chama a tela de cadastro de gerente
	}

	@GetMapping(value = "/gerentes") // Identifica quando vem da página /gerentes via o método get
	public String lista(Model model) {
		// Não precisa informar abaixo WEB-INF/jsp/gerente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		
		model.addAttribute("listagem", gerenteService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) gerentes
		
		return "/gerente/lista"; // Chama a tela de cadastro de gerente
	}

	// gerente/incluir
	@PostMapping(value = "/gerente/incluir")
	public String incluir(Model model, Gerente gerente) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário

		//System.out.println("Gerente cadastrado: " + gerente);
		// model.addAttribute("listagem", gerenteService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) gerentes
		gerenteService.incluir(gerente);
		return "redirect:/gerentes";
	}
	
	// 	/bebida/excluir/${o.id}
	@GetMapping(value="/gerente/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		gerenteService.excluir(id);
		return "redirect:/gerentes";
	}
}


//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class GerenteController {
//	// gerente GET
//	//@RequestMapping(value = "/gerente", method = RequestMethod.GET)
//	@GetMapping(value = "/gerente")
//	public String cadastro() {
//		// Não precisa informar abaixo WEB-INF/jsp/gerente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
//		return "gerente/cadastro"; 
//	}
//}
