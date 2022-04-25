package br.edu.infnet.projeto.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TAnalista")
public class Analista extends Empregado {
	private float auxilioalimentacao;
	private float auxiliotransporte;
	private float auxilioescola;
	
	public Analista() {
		// TODO Auto-generated constructor stub
	}

	public Analista(String cpf, String nome, float salariobase, float salariofinal) {
		super(cpf, nome, salariobase, salariofinal);
	}
	public float getAuxilioalimentacao() {
		return auxilioalimentacao;
	}
	public void setAuxilioalimentacao(float auxilioalimentacao) {
		this.auxilioalimentacao = auxilioalimentacao;
	}
	public float getAuxiliotransporte() {
		return auxiliotransporte;
	}
	public void setAuxiliotransporte(float auxiliotransporte) {
		this.auxiliotransporte = auxiliotransporte;
	}
	public float getAuxilioescola() {
		return auxilioescola;
	}
	public void setAuxilioescola(float auxilioescola) {
		this.auxilioescola = auxilioescola;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(auxilioalimentacao);
		sb.append(";");
		sb.append(auxiliotransporte);
		sb.append(";");
		sb.append(auxilioescola);
		
		return sb.toString();
	}
	@Override
	public float calcularSalarioFinal() {
		return getSalariobase() + auxilioalimentacao + auxiliotransporte + auxilioescola;
	}
}
