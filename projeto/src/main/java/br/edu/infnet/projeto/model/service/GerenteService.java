package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Gerente;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.GerenteRepository;
import org.springframework.data.domain.Sort;

@Service
public class GerenteService {
	
//	private static Map<Integer, Gerente> mapa = new HashMap<Integer, Gerente>();
//	
//	private static Integer key = 1;
	
	@Autowired
	private GerenteRepository gerenteRepository;

	
	public Collection<Gerente> obterLista(Usuario usuario){
//		return mapa.values();
		return (Collection<Gerente>) gerenteRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	// Incluir
	public void incluir(Gerente gerente){
//		gerente.setId(key++);
//		mapa.put(gerente.getId(),  gerente);
		gerenteRepository.save(gerente);
	}
	// Excluir
	public void excluir(Integer id){
//		mapa.remove(id);
		gerenteRepository.deleteById(id);
	}
	// ObterPorId
//	public Gerente obterPorId(Integer id){
////		return mapa.get(id);
//		gerenteRepository.deleteById(id);
//	}
	
}
