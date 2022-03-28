package br.edu.infnet.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.projeto.model.domain.Diretor;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DiretorController {
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
		
		Diretor d1 = new Diretor("111111111-11", "Diretor1", 20000f, 0f);
		d1.setBonusdiretor(1000f);
		d1.setAuxiliovoo(5000f);
		d1.setCartaocorporativo(true);

		Diretor d2 = new Diretor("222222222-22", "Diretor2", 20000f, 0f);
		d2.setBonusdiretor(1000f);
		d2.setAuxiliovoo(5000f);
		d2.setCartaocorporativo(true);

		List<Diretor> diretores = new ArrayList<Diretor>();
		diretores.add(d1);
		diretores.add(d2);
		
		model.addAttribute("listagem", diretores); // Passa a informação listagem para a página (ou tmabém chamado de rota) diretores
		
		return "diretor/lista"; // Chama a tela de cadastro de diretor
	}

	// diretor/incluir
	@PostMapping(value = "/diretor/incluir")
	public String incluir() {
		return "diretor/lista";
	}
}
