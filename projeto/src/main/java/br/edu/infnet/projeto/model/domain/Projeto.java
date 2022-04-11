package br.edu.infnet.projeto.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Projeto {
	private Integer Id;
	private String codigo;
	private String descricao;
	private LocalDateTime datainicio;
	private Cliente cliente;
	private List<Empregado> empregados;

	public Projeto() {
		datainicio = LocalDateTime.now();
		descricao = "Projeto de consultoria";
		cliente = null;
		empregados = null;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");

		return String.format("%s;%s;%s", 
				codigo,
				descricao,
				datainicio.format(formato));
	}
}
