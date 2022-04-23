package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Diretor;
import br.edu.infnet.projeto.model.repository.DiretorRepository;

@Service
public class DiretorService {
	
//	private static Map<Integer, Diretor> mapa = new HashMap<Integer, Diretor>();
//	
//	private static Integer key = 1;
	
	@Autowired
	private DiretorRepository diretorRepository;
	
	public Collection<Diretor> obterLista(){
		//return mapa.values();
		return (Collection<Diretor>) diretorRepository.findAll();
	}
	// Incluir
	public void incluir(Diretor diretor){
//		diretor.setId(key++);
//		mapa.put(diretor.getId(),  diretor);
		diretorRepository.save(diretor);
	}
	// Excluir
	public void excluir(Integer id){
//		mapa.remove(id);
		diretorRepository.deleteById(id);
	}
	// ObterPorId
//	public Diretor obterPorId(Integer id){
//		return mapa.get(id);
//	}
	
}
