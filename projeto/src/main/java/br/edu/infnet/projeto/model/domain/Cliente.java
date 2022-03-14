package br.edu.infnet.projeto.model.domain;

public class Cliente {
	private String cnpj;
	private String razaosocial;
	private String email;
	
	public Cliente (String cnpj, String razaosocial, String email) {
		this.cnpj= cnpj;
		this.razaosocial = razaosocial;
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(cnpj);
		sb.append(";");
		sb.append(razaosocial);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public String getEmail() {
		return email;
	}
}
