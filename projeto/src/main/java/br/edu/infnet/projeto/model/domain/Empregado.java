package br.edu.infnet.projeto.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TEmpregado")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Id;
	private String cpf;
	private String nome;
	private float salariobase;
	private float salariofinal;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy = "empregados")
	private List<Projeto> projetos;

	public Empregado() {
		// TODO Auto-generated constructor stub
	}
	
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
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
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
