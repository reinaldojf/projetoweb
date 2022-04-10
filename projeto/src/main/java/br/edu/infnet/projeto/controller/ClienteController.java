package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.projeto.model.domain.Cliente;
import br.edu.infnet.projeto.model.service.ClienteService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {
	
	// Ao invés de fazer o que está abaixo
	//ClienteService clienteService = new ClienteService();
	// Faz-se
	@Autowired // Esconde a iniciação de clienteService
	private ClienteService clienteService;
	
	// cliente GET
	//@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	@GetMapping(value = "/cliente") // Identifica quando vem da página /cliente via o método get
	public String cadastro() {
		// Não precisa informar abaixo WEB-INF/jsp/cliente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		return "cliente/cadastro"; // Chama a tela de cadastro de cliente
	}

	@GetMapping(value = "/clientes") // Identifica quando vem da página /clientes via o método get
	public String lista(Model model) {
		// Não precisa informar abaixo WEB-INF/jsp/cliente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		
		model.addAttribute("listagem", clienteService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) clientes
		
		return "cliente/lista"; // Chama a tela de cadastro de cliente
	}

	// cliente/incluir
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Model model, Cliente cliente) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário

		//System.out.println("Cliente cadastrado: " + cliente);
		// model.addAttribute("listagem", clienteService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) clientes
		clienteService.incluir(cliente);
		return "redirect:/clientes";
	}
	
	// 	/bebida/excluir/${o.id}
	@GetMapping(value="/cliente/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		clienteService.excluir(id);
		return "redirect:/clientes";
	}
}

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class ClienteController {
//	// cliente GET
//	//@RequestMapping(value = "/cliente", method = RequestMethod.GET)
//	@GetMapping(value = "/cliente")
//	public String cadastro() {
//		// Não precisa informar abaixo WEB-INF/jsp/cliente/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
//		return "cliente/cadastro"; 
//	}
//}
