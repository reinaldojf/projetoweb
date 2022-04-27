package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario")
	public String cadastro() {
		return "usuario/cadastro";
	}
	@GetMapping(value = "/usuarios")
	public String lista(Model model) {
		
		model.addAttribute("listagem", usuarioService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) clientes
		
		return "usuario/lista"; // Chama a tela de listagem de usuário
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model model, Usuario usuario) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário
		usuarioService.incluir(usuario);
		return "redirect:/";
	}
	
	@GetMapping(value="/usuario/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		usuarioService.excluir(id);
		return "redirect:/usuarios"; // Chama a rota usuarios que está acima no código
	}
}
