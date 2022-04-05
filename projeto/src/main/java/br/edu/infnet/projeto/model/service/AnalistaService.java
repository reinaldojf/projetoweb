package br.edu.infnet.projeto.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Analista;

@Service
public class AnalistaService {
	
	private static Map<Integer, Analista> mapa = new HashMap<Integer, Analista>();
	
	private static Integer key = 1;
	
	public Collection<Analista> obterLista(){
		return mapa.values();
	}
	// Incluir
	public void incluir(Analista analista){
		analista.setId(key++);
		mapa.put(analista.getId(),  analista);
	}
	// Excluir
	public void excluir(Integer id){
		mapa.remove(id);
	}
	// ObterPorId
	public Analista obterPorId(Integer id){
		return mapa.get(id);
	}
	
}
