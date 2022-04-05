package br.edu.infnet.projeto.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Cliente;

@Service
public class ClienteService {
	
	private static Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
	
	private static Integer key = 1;
	
	public Collection<Cliente> obterLista(){
		return mapa.values();
	}
	// Incluir
	public void incluir(Cliente cliente){
		cliente.setId(key++);
		mapa.put(cliente.getId(),  cliente);
	}
	// Excluir
	public void excluir(Integer id){
		mapa.remove(id);
	}
	// ObterPorId
	public Cliente obterPorId(Integer id){
		return mapa.get(id);
	}
	
}
