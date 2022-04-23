package br.edu.infnet.projeto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.UsuarioService;

@SessionAttributes("usuarioLogado")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/") // Acessado automaticamente quando entrar na rota / (raiz do site) - localhost:8080
	public String telaIndex() {
		return "index"; // Chama a tela de login - index.jsp
	}

	@GetMapping(value = "/login") // Acessado automaticamente quando entrar na rota /login no navegador - localhost:8080/login
	public String telaLogin() {
		return "login"; // Chama a tela de login - login.jsp
	}

	@GetMapping(value = "/logout") // Acessado automaticamente quando entrar na rota /logout no navegador - localhost:8080/logout
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete(); // Encerra a sessão
		session.removeAttribute("usuarioLogado"); // Remove a variável usuarioLogado
		return "redirect:/"; // Chama a tela de login, mas não permite passar informações através do model
	}

	
	@PostMapping(value = "/login") // Identifica quando vem da página /login via método post
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
//		System.out.println("E-mail digitado: " + email);
//		System.out.println("Senha digitada: " + senha);
		
		Usuario usuario = usuarioService.validar(email, senha);
		
		if (usuario != null) {
			// A linha abaixo envia para a página de login o objeto usuario como usuarioLogado
			model.addAttribute("usuarioLogado", usuario); 
			return "index";
		}
			
				
		String msg = email + " você digitou informações inválidas";
		model.addAttribute("mensagem", msg); // Utilizado para passar informações para a página jsp - objeto model é a página
		return "login";
	}
}
