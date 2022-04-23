package br.edu.infnet.projeto.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="TDiretor")
public class Diretor extends Empregado {
	private float bonusdiretor;
	private float auxiliovoo;
	private boolean cartaocorporativo;

	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	public Diretor(String cpf, String nome, float salariobase, float salariofinal) {
		super(cpf, nome, salariobase, salariofinal);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(bonusdiretor);
		sb.append(";");
		sb.append(auxiliovoo);
		sb.append(";");
		sb.append(cartaocorporativo);
		
		return sb.toString();
	}
	@Override
	public float calcularSalarioFinal() {
		return getSalariobase() + bonusdiretor + auxiliovoo;
	}
	public float getBonusdiretor() {
		return bonusdiretor;
	}
	public void setBonusdiretor(float bonusdiretor) {
		this.bonusdiretor = bonusdiretor;
	}
	public float getAuxiliovoo() {
		return auxiliovoo;
	}
	public void setAuxiliovoo(float auxiliovoo) {
		this.auxiliovoo = auxiliovoo;
	}
	public boolean isCartaocorporativo() {
		return cartaocorporativo;
	}
	public void setCartaocorporativo(boolean cartaocorporativo) {
		this.cartaocorporativo = cartaocorporativo;
	}
}
