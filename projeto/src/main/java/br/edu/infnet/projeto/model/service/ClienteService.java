package br.edu.infnet.projeto.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Cliente;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private static Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
	
	private static Integer key = 1;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Collection<Cliente> obterLista(Usuario usuario){
		//return mapa.values();
		return (Collection<Cliente>) clienteRepository.findAll(usuario.getId()); // Vai trazer uma coleção de solicitante
	}
	
	// Incluir
	public void incluir(Cliente cliente){
//		cliente.setId(key++);
//		mapa.put(cliente.getId(),  cliente);
		clienteRepository.save(cliente);
	}
	
	// Excluir
	public void excluir(Integer id){
//		mapa.remove(id);
		clienteRepository.deleteById(id);;
	}
	// ObterPorId
//	public Cliente obterPorId(Integer id){
//		return mapa.get(id);
//	}
	
}
