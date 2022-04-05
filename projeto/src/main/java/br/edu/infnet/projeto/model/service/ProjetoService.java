package br.edu.infnet.projeto.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Projeto;

@Service
public class ProjetoService {
	
	private static Map<Integer, Projeto> mapa = new HashMap<Integer, Projeto>();
	
	private static Integer key = 1;
	
	public Collection<Projeto> obterLista(){
		return mapa.values();
	}
	// Incluir
	public void incluir(Projeto projeto){
		projeto.setId(key++);
		mapa.put(projeto.getId(),  projeto);
	}
	// Excluir
	public void excluir(Integer id){
		mapa.remove(id);
	}
	// ObterPorId
	public Projeto obterPorId(Integer id){
		return mapa.get(id);
	}
	
}
