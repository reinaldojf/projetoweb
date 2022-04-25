package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Analista;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.AnalistaRepository;

@Service
public class AnalistaService {
	
//	private static Map<Integer, Analista> mapa = new HashMap<Integer, Analista>();
//	
//	private static Integer key = 1;
	
	@Autowired
	private AnalistaRepository analistaRepository;

	public Collection<Analista> obterLista(Usuario usuario){
//		return mapa.values();
		return (Collection<Analista>) analistaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	// Incluir
	public void incluir(Analista analista){
//		analista.setId(key++);
//		mapa.put(analista.getId(),  analista);
		analistaRepository.save(analista);
	}
	// Excluir
	public void excluir(Integer id){
//		mapa.remove(id);
		analistaRepository.deleteById(id);
	}
	// ObterPorId
//	public Analista obterPorId(Integer id){
//		return mapa.get(id);
//	}
	
}
