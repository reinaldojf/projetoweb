package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Projeto;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.ProjetoRepository;

@Service
public class ProjetoService {
	
//	private static Map<Integer, Projeto> mapa = new HashMap<Integer, Projeto>();
//	
//	private static Integer key = 1;
	
	@Autowired
	private ProjetoRepository projetoRepository;
	
	public Collection<Projeto> obterLista(Usuario usuario){
//		return mapa.values();
		return projetoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "datainicio"));
	}
	public Collection<Projeto> obterLista(){
//		return mapa.values();
		return projetoRepository.findAll(Sort.by(Sort.Direction.ASC, "datainicio"));
	}	// Incluir
	public void incluir(Projeto projeto){
//		projeto.setId(key++);
//		mapa.put(projeto.getId(),  projeto);
		projetoRepository.save(projeto);
	}
	// Excluir
	public void excluir(Integer id){
//		mapa.remove(id);
		projetoRepository.deleteById(id);
	}
	// ObterPorId
	public Projeto obterPorId(Integer id){
//		return mapa.get(id);
		return projetoRepository.findById(id).orElse(null); // orEsle (a partir da v8 Java) significa que se não houver projeto com id, é para returnar null
	}
	
}
