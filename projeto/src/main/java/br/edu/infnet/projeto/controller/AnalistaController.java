package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.projeto.model.domain.Analista;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.AnalistaService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnalistaController {
	
	// Ao invés de fazer o que está abaixo
	//DiretorService diretorService = new DiretorService();
	// Faz-se
	@Autowired // Esconde a iniciação de diretorService
	private AnalistaService analistaService;
	
	// analista GET
	//@RequestMapping(value = "/analista", method = RequestMethod.GET)
	@GetMapping(value = "/analista") // Identifica quando vem da página /analista via o método get
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/analista/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "analista/cadastro"; // Chama a tela de cadastro de analista
	}

	@GetMapping(value = "/analistas") // Identifica quando vem da página /analistas via o método get
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		// Não precisa informar abaixo WEB-INF/jsp/analista/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		
		model.addAttribute("listagem", analistaService.obterLista(usuario)); // Passa a informação listagem para a página (ou tmabém chamado de rota) analistas
		
		return "/analista/lista"; // Chama a tela de cadastro de analista
	}

	// analista/incluir
	@PostMapping(value = "/analista/incluir")
	public String incluir(Model model, Analista analista, @SessionAttribute("usuarioLogado") Usuario usuario) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário

		//System.out.println("Analista cadastrado: " + analista);
		// model.addAttribute("listagem", analistaService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) analistas
		analista.setUsuario(usuario);
		analistaService.incluir(analista);
		return "redirect:/analistas";
	}
	
	// 	/bebida/excluir/${o.id}
	@GetMapping(value="/analista/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		analistaService.excluir(id);
		return "redirect:/analistas";
	}
}

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class AnalistaController {
//	// analista GET
//	//@RequestMapping(value = "/diretor", method = RequestMethod.GET)
//	@GetMapping(value = "/analista")
//	public String cadastro() {
//		// Não precisa informar abaixo WEB-INF/jsp/analista/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
//		return "analista/cadastro"; 
//	}
//}
