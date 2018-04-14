package br.unicesumar;

/**
 * Classe que 
 * 
 * @author Lucas Gabriel de Souza
 *
 */

public class Aluno{
	
	//Atributos da classe aluno;
	protected String cpf; //CPF é do tipo string, porque o usuário pode querer digiar o cpf com pontos;
	protected String nome;
	protected int ra;
	protected String email;
	protected int telefone;
	protected String status;
	protected String dataNascimento; //Data é string, porém depois é convertida;
	
	//Método construtor da classe aluno;
	public Aluno(String nome, String cpf, int ra, String email, int telefone, String status, String dataNascimento ) {
		this.nome = nome;
		this.cpf = cpf;
		this.ra = ra;
		this.email = email;
		this.telefone = telefone;
		this.status = status;
		this.dataNascimento = dataNascimento;
	}
	

	//Métodos getters e setters;
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

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
}