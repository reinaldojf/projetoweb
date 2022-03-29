package br.edu.infnet.projeto.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Diretor;

@Service
public class DiretorService {
	
	private static Map<Integer, Diretor> mapa = new HashMap<Integer, Diretor>();
	
	private static Integer key = 1;
	
	public Collection<Diretor> obterLista(){
		return mapa.values();
	}
	// Incluir
	public void incluir(Diretor diretor){
		diretor.setId(key++);
		mapa.put(diretor.getId(),  diretor);
	}
	// Excluir
	public void excluir(Integer id){
		mapa.remove(id);
	}
	// ObterPorId
	public Diretor obterPorId(Integer id){
		return mapa.get(id);
	}
	
}
