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
 * Polimorfismo dos métodos: Carregar, Exluir, Listar, Procurar e Alterar;
 * 
 * @author Lucas Gabriel de Souza;
 *
 */

public class ShowAluno {
	
	//Atributos da classe e Associação da classe ControlarAluno;
	private static ControlarAluno control;
	private Scanner scan;
	private Date data;
	private String valor;
	private SimpleDateFormat formato;
	
	//Método construtor que instância a classe ControlarAluno;
	public ShowAluno() {
		control = new ControlarAluno();
	}
	
	//Métodos para receber os dados que seram adicionados no ArrayList de Aluno;
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
		
		//Intância da classe Aluno;
		Aluno a = new Aluno(nome, cpf, ra, email, telefone, status, dataNascimento);
		
		//Utilização da varívavel (control) para chamar o método de Inserir os dados do Aluno no ArrayList de Aluno;
		control.inserirAluno(a);
	}
	
	//Métodos para alteração de dados de um determinado aluno a partir de um parâmetro;
	public void alterar() {
		
		//Mostra na tela uma mensagem ao usuário inserir o CPF do aluno que deseja encontrar;
		System.out.println("Digite o cpf do aluno que deseja alterar...");
		
		//A varíval (scan), lê o CPF que  usuário passou;
		String i = scan.nextLine();
		
		//Utilização da varívavel (control) para chamar o método de Alteração dos dados do ArrayList de Aluno 
		//referênte ao Aluno que corresponda ao CPF que o usuário informou acima;
		control.alterarAluno(i);
	}
	
	//Método para excluir um determinado Aluno depois que passar um parâmetro;
	public void excluir() {
		
		//Mostra na tela uma mensagem ao usuário para digitar o nome do aluno que deseja excluir;
		System.out.println("Digite o nome do aluno que deseja excluir...");
		
		//A varíval (scan), lê o NOME que o usuário passou;
		String nome = scan.nextLine();
		
		//Utilização da varívavel (control) para chamar o método de Exclusão dos dados do ArrayList de Aluno 
		//referênte ao Aluno que corresponda ao NOME que o usuário informou acima;
		control.excluirAluno(nome);
	}
	
	//Método para pesquisar um determinado Aluno depois que passar um parâmetro;
	public void pesquisar() {
		
		//Mostra na tela uma mensagem ao usuário para digitar o CPF do aluno que deseja pesquisar;
		System.out.println("Digite o cpf do aluno que deseja pesquisar");
		
		//A varíval (scan), lê o CPF que o usuário passou;
		String cpf = scan.nextLine();
		
		//Utilização da varívavel (control) para chamar o método de Pesquisa dos dados do ArrayList de Aluno 
		//referênte ao Aluno que corresponda ao CPF que o usuário informou acima;
		control.pesquisarAluno(cpf);
	}
	
	//Método para listar todos os Alunos adicionados no ArrayList de Aluno;
	public  void listar() {
		control.listarAluno(null);
	}

	//Métodos GETTERS E SETTERS;
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