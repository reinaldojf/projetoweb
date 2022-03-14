package br.edu.infnet.projeto.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Projeto {
	private String codigo;
	private String descricao;
	private LocalDateTime datainicio;
	private Cliente cliente;
	private List<Empregado> empregados;

	public Projeto() {
		datainicio = LocalDateTime.now();
		descricao = "Projeto de consultoria";
	}
	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");

		return String.format("%s;%s;%d", 
				codigo,
				descricao,
				datainicio.format(formato),
				empregados.size());
	}
	public LocalDateTime getDatainicio() {
		return datainicio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Empregado> getEmpregados() {
		return empregados;
	}
	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}
	
}
