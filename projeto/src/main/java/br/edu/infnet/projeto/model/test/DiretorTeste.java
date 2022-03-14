package br.edu.infnet.projeto.model.test;

import br.edu.infnet.projeto.model.domain.Diretor;

public class DiretorTeste {

	public static void main(String[] args) {
		Diretor d1 = new Diretor("111111111-11", "Diretor1", 20000f, 0f);
		d1.setBonusdiretor(1000f);
		d1.setAuxiliovoo(5000f);
		d1.setCartaocorporativo(true);
		System.out.println("O diretor "+d1.getNome()+" tem sal�rio final:"+d1.calcularSalarioFinal());

		Diretor d2 = new Diretor("222222222-22", "Diretor2", 30000f, 0f);
		d2.setBonusdiretor(2000f);
		d2.setAuxiliovoo(5000f);
		d2.setCartaocorporativo(true);
		System.out.println("O diretor "+d2.getNome()+" tem sal�rio final:"+d2.calcularSalarioFinal());
	}

}
