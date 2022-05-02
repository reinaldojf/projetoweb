package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.EmpregadoService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpregadoController {
	
	// Ao invés de fazer o que está abaixo
	//EmpregadoService empregadoService = new EmpregadoService();
	// Faz-se
	@Autowired // Esconde a iniciação de diretorService
	private EmpregadoService empregadoService;
	
	
	@GetMapping(value = "/empregados") // Identifica quando vem da página /diretores via o método get
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		model.addAttribute("listagem", empregadoService.obterLista(usuario)); // Passa a informação listagem para a página (ou tmabém chamado de rota) diretores
		
		return "/empregado/lista"; // Chama a tela de cadastro de diretor
	}
	// 	/bebida/excluir/${o.id}
	@GetMapping(value="/empregado/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		empregadoService.excluir(id);
		return "redirect:/empregados";
	}
}
