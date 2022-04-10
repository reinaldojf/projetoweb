package br.edu.infnet.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.UsuarioService;

@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/") // Acessado automaticamente quando entrar na raiz do site - localhost:8080
	public String telaLogin() {
		return "login"; // Chama a tela de login
	}
	@PostMapping(value = "/login") // Identifica quando vem da página /login via método post
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
//		System.out.println("E-mail digitado: " + email);
//		System.out.println("Senha digitada: " + senha);
		
		Usuario usuario = usuarioService.validar(email, senha);
		
		if (usuario != null) {
			// A linha abaixo envia para a página o objeto usuario como usuarioLogado
			model.addAttribute("usuarioLogado", usuario); 
			return "index";
		}
			
				
		String msg = email + " você digitou informações inválidas";
		model.addAttribute("mensagem", msg); // Utilizado para passar informações para a página jsp
		return "login";
	}
}
