package br.edu.infnet.projeto.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Empregado {
	private String cpf;
	private String nome;
	private float salariobase;
	private float salariofinal;
	
	public Empregado(String cpf, String nome, float salariobase, float salariofinal) {
		this.cpf = cpf;
		this.nome = nome;
		this.salariobase = salariobase;
		this.salariofinal = salariofinal;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public float getSalariobase() {
		return salariobase;
	}
	public float getSalariofinal() {
		return salariofinal;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(cpf);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(salariobase);
		sb.append(";");
		sb.append(salariofinal);
		sb.append(";");
		sb.append(calcularSalarioFinal());
		
		return sb.toString();
	}
	public abstract float calcularSalarioFinal();
	
}
