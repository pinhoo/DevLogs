package br.hackathon.projeto.model;

public class Usuario {

	private String nome;
	private String email;
	private String telefone;
	private String pass;
	
	public Usuario(){
		
	}

	public Usuario(String nome, String email, String telefone, String pass) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.pass = pass;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
