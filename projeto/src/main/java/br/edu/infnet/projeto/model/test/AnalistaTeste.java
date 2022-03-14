package br.edu.infnet.projeto.model.test;

import br.edu.infnet.projeto.model.domain.Analista;

public class AnalistaTeste {

	public static void main(String[] args) {
		Analista a1 = new Analista("111111111-11", "Analista1", 5000, 0);
		a1.setAuxilioalimentacao(100.0f);
		a1.setAuxiliotransporte(50.0f);
		a1.setAuxilioescola(200.0f);
		System.out.println("O analista "+a1.getNome()+" tem sal�rio final:"+a1.calcularSalarioFinal());

		Analista a2 = new Analista("222222222-22", "Analista2", 6000, 0);
		a2.setAuxilioalimentacao(100.0f);
		a2.setAuxiliotransporte(50.0f);
		a2.setAuxilioescola(200.0f);
		System.out.println("O analista "+a2.getNome()+" tem sal�rio final:"+a2.calcularSalarioFinal());
}

}
