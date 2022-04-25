package br.edu.infnet.projeto.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TGerente")
public class Gerente extends Empregado {
	private float gratificacaogerente;
	private float auxiliogasolina;
	private boolean participacaolucros;
	
//	private boolean gelada;
//	private float tamanho;
//	private String marca;

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public Gerente(String cpf, String nome, float salariobase, float salariofinal) {
		super(cpf, nome, salariobase, salariofinal);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(gratificacaogerente);
		sb.append(";");
		sb.append(auxiliogasolina);
		sb.append(";");
		sb.append(participacaolucros);
		
		return sb.toString();
	}
	@Override
	public float calcularSalarioFinal() {
		return getSalariobase() + gratificacaogerente + auxiliogasolina;
	}
	public float getGratificacaogerente() {
		return gratificacaogerente;
	}
	public void setGratificacaogerente(float gratificacaogerente) {
		this.gratificacaogerente = gratificacaogerente;
	}
	public float getAuxiliogasolina() {
		return auxiliogasolina;
	}
	public void setAuxiliogasolina(float auxiliogasolina) {
		this.auxiliogasolina = auxiliogasolina;
	}
	public boolean isParticipacaolucros() {
		return participacaolucros;
	}
	public void setParticipacaolucros(boolean participacaolucros) {
		this.participacaolucros = participacaolucros;
	}
}
