package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.projeto.model.domain.Diretor;
import br.edu.infnet.projeto.model.service.DiretorService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DiretorController {
	
	// Ao invés de fazer o que está abaixo
	//DiretorService diretorService = new DiretorService();
	// Faz-se
	@Autowired // Esconde a iniciação de diretorService
	private DiretorService diretorService;
	
	// diretor GET
	//@RequestMapping(value = "/diretor", method = RequestMethod.GET)
	@GetMapping(value = "/diretor") // Identifica quando vem da página /diretor via o método get
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/diretor/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "diretor/cadastro"; // Chama a tela de cadastro de diretor
	}

	@GetMapping(value = "/diretores") // Identifica quando vem da página /diretores via o método get
	public String lista(Model model) {
		// Não precisa informar abaixo WEB-INF/jsp/diretor/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		
		model.addAttribute("listagem", diretorService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) diretores
		
		return "/diretor/lista"; // Chama a tela de cadastro de diretor
	}

	// diretor/incluir
	@PostMapping(value = "/diretor/incluir")
	public String incluir(Model model, Diretor diretor) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário

		//System.out.println("Diretor cadastrado: " + diretor);
		// model.addAttribute("listagem", diretorService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) diretores
		diretorService.incluir(diretor);
		return "redirect:/diretores";
	}
	
	// 	/bebida/excluir/${o.id}
	@GetMapping(value="/diretor/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		diretorService.excluir(id);
		return "redirect:/diretores";
	}
}
