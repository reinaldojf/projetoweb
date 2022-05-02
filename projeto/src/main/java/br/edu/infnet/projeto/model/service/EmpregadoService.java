package br.edu.infnet.projeto.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.projeto.model.domain.Empregado;
import br.edu.infnet.projeto.model.domain.Usuario;
import br.edu.infnet.projeto.model.repository.EmpregadoRepository;

@Service
public class EmpregadoService {
	
//	private static Map<Integer, Diretor> mapa = new HashMap<Integer, Diretor>();
//	
//	private static Integer key = 1;
	
	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	public Collection<Empregado> obterLista(Usuario usuario){
		//return mapa.values();
		return (Collection<Empregado>) empregadoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	// Excluir
	public void excluir(Integer id){
//		mapa.remove(id);
		empregadoRepository.deleteById(id);
	}
}
