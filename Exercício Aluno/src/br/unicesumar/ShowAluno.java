package br.unicesumar;

import br.unicesumar.Aluno;
import br.unicesumar.ControlarAluno;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que recebe os dados do Aluno; 
 * 
 * Polimorfismo dos m�todos: Carregar, Exluir, Listar, Procurar e Alterar;
 * 
 * @author Lucas Gabriel de Souza;
 *
 */

public class ShowAluno {
	
	//Atributos da classe e Associa��o da classe ControlarAluno;
	private static ControlarAluno control;
	private Scanner scan;
	private Date data;
	private String valor;
	private SimpleDateFormat formato;
	
	//M�todo construtor que inst�ncia a classe ControlarAluno;
	public ShowAluno() {
		control = new ControlarAluno();
	}
	
	//M�todos para receber os dados que seram adicionados no ArrayList de Aluno;
	public void carregarAluno() throws ParseException {
		scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno que deseja cadastrar na lista");
		String nome = scan.nextLine();
		System.out.println("Digite o cpf do aluno que deseja cadastrar na lista");
		String cpf = scan.nextLine();
		System.out.println("Digite o ra do aluno que deseja cadastrar na lista");
		int ra = scan.nextInt();
		System.out.println("Digite o email do aluno que deseja cadastrar na lista");
		String email = scan.next();
		System.out.println("Digite o telefone do aluno que deseja cadastrar na lista");
		int telefone = scan.nextInt();
		System.out.println("Digite o status do aluno que deseja cadastrar na lista");
		String status = scan.next().toString();
		System.out.println("Digite o data de nascimento do aluno que deseja cadastrar na lista");
		String dataNascimento = scan.next();
		
		setValor(dataNascimento);
		setFormato(new SimpleDateFormat("dd/mm/yyyy"));
		
		//Int�ncia da classe Aluno;
		Aluno a = new Aluno(nome, cpf, ra, email, telefone, status, dataNascimento);
		
		//Utiliza��o da var�vavel (control) para chamar o m�todo de Inserir os dados do Aluno no ArrayList de Aluno;
		control.inserirAluno(a);
	}
	
	//M�todos para altera��o de dados de um determinado aluno a partir de um par�metro;
	public void alterar() {
		
		//Mostra na tela uma mensagem ao usu�rio inserir o CPF do aluno que deseja encontrar;
		System.out.println("Digite o cpf do aluno que deseja alterar...");
		
		//A var�val (scan), l� o CPF que  usu�rio passou;
		String i = scan.nextLine();
		
		//Utiliza��o da var�vavel (control) para chamar o m�todo de Altera��o dos dados do ArrayList de Aluno 
		//refer�nte ao Aluno que corresponda ao CPF que o usu�rio informou acima;
		control.alterarAluno(i);
	}
	
	//M�todo para excluir um determinado Aluno depois que passar um par�metro;
	public void excluir() {
		
		//Mostra na tela uma mensagem ao usu�rio para digitar o nome do aluno que deseja excluir;
		System.out.println("Digite o nome do aluno que deseja excluir...");
		
		//A var�val (scan), l� o NOME que o usu�rio passou;
		String nome = scan.nextLine();
		
		//Utiliza��o da var�vavel (control) para chamar o m�todo de Exclus�o dos dados do ArrayList de Aluno 
		//refer�nte ao Aluno que corresponda ao NOME que o usu�rio informou acima;
		control.excluirAluno(nome);
	}
	
	//M�todo para pesquisar um determinado Aluno depois que passar um par�metro;
	public void pesquisar() {
		
		//Mostra na tela uma mensagem ao usu�rio para digitar o CPF do aluno que deseja pesquisar;
		System.out.println("Digite o cpf do aluno que deseja pesquisar");
		
		//A var�val (scan), l� o CPF que o usu�rio passou;
		String cpf = scan.nextLine();
		
		//Utiliza��o da var�vavel (control) para chamar o m�todo de Pesquisa dos dados do ArrayList de Aluno 
		//refer�nte ao Aluno que corresponda ao CPF que o usu�rio informou acima;
		control.pesquisarAluno(cpf);
	}
	
	//M�todo para listar todos os Alunos adicionados no ArrayList de Aluno;
	public  void listar() {
		control.listarAluno(null);
	}

	//M�todos GETTERS E SETTERS;
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public SimpleDateFormat getFormato() {
		return formato;
	}

	public void setFormato(SimpleDateFormat formato) {
		this.formato = formato;
	}
}