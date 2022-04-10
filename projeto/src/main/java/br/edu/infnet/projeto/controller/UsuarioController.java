package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model model, Usuario usuario) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário
		usuarioService.incluir(usuario);
		return "redirect:/";
	}
}
