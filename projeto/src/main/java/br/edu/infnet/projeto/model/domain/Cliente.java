package br.edu.infnet.projeto.model.domain;

public class Cliente {
	private Integer Id;
	private String cnpj;
	private String razaosocial;
	private String email;

	public Cliente (String cnpj, String razaosocial, String email) {
		this.cnpj= cnpj;
		this.razaosocial = razaosocial;
		this.email = email;
	}
	
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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
}
