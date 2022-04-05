package br.edu.infnet.projeto.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Gerente;

@Service
public class GerenteService {
	
	private static Map<Integer, Gerente> mapa = new HashMap<Integer, Gerente>();
	
	private static Integer key = 1;
	
	public Collection<Gerente> obterLista(){
		return mapa.values();
	}
	// Incluir
	public void incluir(Gerente gerente){
		gerente.setId(key++);
		mapa.put(gerente.getId(),  gerente);
	}
	// Excluir
	public void excluir(Integer id){
		mapa.remove(id);
	}
	// ObterPorId
	public Gerente obterPorId(Integer id){
		return mapa.get(id);
	}
	
}
