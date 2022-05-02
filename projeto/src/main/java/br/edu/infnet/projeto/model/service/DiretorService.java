package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Diretor;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.DiretorRepository;

@Service
public class DiretorService {
	
	@Autowired
	private DiretorRepository diretorRepository;
	
	public Collection<Diretor> obterLista(Usuario usuario){
		//return mapa.values();
		return (Collection<Diretor>) diretorRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	// Incluir
	public void incluir(Diretor diretor){
		diretorRepository.save(diretor);
	}
	// Excluir
	public void excluir(Integer id){
		diretorRepository.deleteById(id);
	}
}
