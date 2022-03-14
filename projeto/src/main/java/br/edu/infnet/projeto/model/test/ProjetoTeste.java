package br.edu.infnet.projeto.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.projeto.model.domain.Analista;
import br.edu.infnet.projeto.model.domain.Cliente;
import br.edu.infnet.projeto.model.domain.Diretor;
import br.edu.infnet.projeto.model.domain.Empregado;
import br.edu.infnet.projeto.model.domain.Gerente;
import br.edu.infnet.projeto.model.domain.Projeto;

public class ProjetoTeste {

	public static void main(String[] args) {
		Projeto projeto = new Projeto();
		projeto.setCodigo("001");
		projeto.setDescricao("Projeto XPTO");
		
		Cliente cliente = new Cliente("Reinaldo", "111111111-11", "teste@teste.com.br");
		projeto.setCliente(cliente);
		
		Diretor d1 = new Diretor("111111111-11", "Diretor1", 20000f, 0f);
		d1.setBonusdiretor(1000f);
		d1.setAuxiliovoo(5000f);
		d1.setCartaocorporativo(true);
		
		Gerente g1 = new Gerente("111111111-11", "Gerente1", 15000f, 0);
		g1.setAuxiliogasolina(500f);
		g1.setGratificacaogerente(500f);
		g1.setParticipacaolucros(true);

		Analista a1 = new Analista("111111111-11", "Analista1", 5000, 0);
		a1.setAuxilioalimentacao(100.0f);
		a1.setAuxiliotransporte(50.0f);
		a1.setAuxilioescola(200.0f);

		Analista a2 = new Analista("222222222-22", "Analista2", 6000, 0);
		a2.setAuxilioalimentacao(100.0f);
		a2.setAuxiliotransporte(50.0f);
		a2.setAuxilioescola(200.0f);

		List<Empregado> colecaoEmpregados = new ArrayList<Empregado>();
		colecaoEmpregados.add(d1);
		colecaoEmpregados.add(g1);
		colecaoEmpregados.add(a1);
		colecaoEmpregados.add(a2);

		projeto.setEmpregados(colecaoEmpregados);

		System.out.println(projeto);	
	}

}
