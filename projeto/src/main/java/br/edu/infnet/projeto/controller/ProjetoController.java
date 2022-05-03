package br.edu.infnet.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.projeto.model.domain.Empregado;
import br.edu.infnet.projeto.model.domain.Projeto;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.service.ClienteService;
import br.edu.infnet.projeto.model.service.EmpregadoService;
import br.edu.infnet.projeto.model.service.ProjetoService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjetoController {
	
	// Ao invés de fazer o que está abaixo
	//ProjetoService projetoService = new ProjetoService();
	// Faz-se
	@Autowired // Esconde a iniciação de projetoService
	private ProjetoService projetoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private EmpregadoService empregadoService;
	
	// projeto GET
	//@RequestMapping(value = "/projeto", method = RequestMethod.GET)
	@GetMapping(value = "/projeto") // Identifica quando vem da página /projeto via o método get
	public String cadastro(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		// Não precisa informar abaixo WEB-INF/jsp/projeto/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		model.addAttribute("empregados", empregadoService.obterLista(usuario));
		return "projeto/cadastro"; // Chama a tela de cadastro de projeto
	}

	@GetMapping(value = "/projetos") // Identifica quando vem da página /projetos via o método get
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		// Não precisa informar abaixo WEB-INF/jsp/projeto/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
		
		model.addAttribute("listagem", projetoService.obterLista(usuario)); // Passa a informação listagem para a página (ou tmabém chamado de rota) projetos
		
		return "/projeto/lista"; // Chama a tela de cadastro de projeto
	}

	// projeto/incluir
	@PostMapping(value = "/projeto/incluir")
	public String incluir(Model model, Projeto projeto, @RequestParam String[] idsEmpregados, @SessionAttribute("usuarioLogado") Usuario usuario) { // Usa o conceito de reflexão, pois recebe automaticamente os campos do formulário

		//System.out.println("Projeto cadastrado: " + projeto);
		// model.addAttribute("listagem", projetoService.obterLista()); // Passa a informação listagem para a página (ou tmabém chamado de rota) projetos
		
//		System.out.println(projeto.toString());
		
		List<Empregado> empregados = new ArrayList<Empregado>();
		for(String id : idsEmpregados) {
			Empregado empregado = empregadoService.obterPorId(Integer.valueOf(id));
			empregados.add(empregado);
		}
		
		projeto.setUsuario(usuario);
		projeto.setEmpregados(empregados);
		projetoService.incluir(projeto);
		return "redirect:/projetos";
	}
	
	// 	/bebida/excluir/${o.id}
	@GetMapping(value="/projeto/excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		projetoService.excluir(id);
		return "redirect:/projetos";
	}
}

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class ProjetoController {
//	// projeto GET
//	//@RequestMapping(value = "/projeto", method = RequestMethod.GET)
//	@GetMapping(value = "/projeto")
//	public String cadastro() {
//		// Não precisa informar abaixo WEB-INF/jsp/projeto/cadastro.jsp pq o prefix e o suffix resolvem o que está faltando
//		return "projeto/cadastro"; 
//	}
//}
