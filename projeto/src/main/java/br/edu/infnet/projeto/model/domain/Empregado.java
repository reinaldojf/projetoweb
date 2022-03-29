package br.edu.infnet.projeto.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Empregado {
	
	private Integer Id;
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
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(float salariobase) {
		this.salariobase = salariobase;
	}
	public float getSalariofinal() {
		return salariofinal;
	}
	public void setSalariofinal(float salariofinal) {
		this.salariofinal = salariofinal;
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
