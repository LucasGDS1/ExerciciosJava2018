package br.unicesumar;

import br.unicesumar.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe 
 * 
 * 
 * @author Lucas Gabriel de Souza
 *
 */

public class ControlarAluno {
	
	private  ArrayList<Aluno> listaAluno;
	private Scanner scan;
	
	public ControlarAluno() {
		listaAluno = new ArrayList<Aluno>();
	}
	
	public void inserirAluno(Aluno a) {
		listaAluno.add(a);
	}
	
	public void alterarAluno(String cpf) {
		scan = new Scanner(System.in);
		
		for(Aluno a : listaAluno) {
			
			if(a.getCpf().equals(cpf)) {
				
				System.out.println(" ");
				System.out.println("Antigo nome " + a.getNome());
				System.out.println("Digite um novo nome...");
				a.setNome(scan.nextLine());
				System.out.println("Antigo cpf " + a.getCpf());
				System.out.println("Digite um novo cpf...");
				a.setCpf(scan.nextLine());
				System.out.println("Antigo ra " + a.getRa());
				System.out.println("Digite um novo ra...");
				a.setRa(scan.nextInt());
				System.out.println("Antigo telefone " + a.getTelefone());
				System.out.println("Digite um novo telefone...");
				a.setTelefone(scan.nextInt());
				System.out.println("Antigo email " + a.getEmail());
				System.out.println("Digite um novo email...");
				a.setEmail(scan.next());
				System.out.println("Antigo status " + a.getStatus());
				System.out.println("Digite um novo status...");
				a.setStatus(scan.next());
				System.out.println("Antiga data de nascimento " + a.getDataNascimento());
				System.out.println("Digite uma nova data de nascimento...");
				a.setDataNascimento(scan.next());
				
				System.out.println("Alteração feita com sucesso... :)");
				System.out.println(" ");
			}
		}
	}
	
	public  void pesquisarAluno(String cpf) {
		for(Aluno a : listaAluno) {
			
			if(a.getCpf().equals(cpf)) {
				
				System.out.println(" ");
				System.out.println("Nome: " + a.getNome());
				System.out.println("Cpf: " + a.getCpf());
				System.out.println("Ra: " + a.getRa());
				System.out.println("Telefone: " + a.getTelefone());
				System.out.println("Email: " + a.getEmail());
				System.out.println("Status: " + a.getStatus());
				System.out.println("Data de nascimento: " + a.getDataNascimento());
				System.out.println(" ");
			}
		}
	}
	
	public void listarAluno(Aluno a) {
		
		for(Aluno al : listaAluno) {
			
			if(listaAluno != null && listaAluno.size() > 0){
				
				System.out.print("\n");
				System.out.println("Nome: " + al.getNome());
				System.out.println("Cpf: " + al.getCpf());
				System.out.println("Ra: " + al.getRa());
				System.out.println("Telefone: " + al.getTelefone());
				System.out.println("Email: " + al.getEmail());
				System.out.println("Status: " + al.getStatus());
				System.out.println("Data de nascimento: " + al.getDataNascimento());
				System.out.print("\n");
			}
		}
	}
	
	public void excluirAluno(String nome) {
			
		if(listaAluno != null && listaAluno.size() > 0)
			{
			for(int i = 0; i < listaAluno.size(); i++) 
				{
					Aluno a = listaAluno.get(i);
			 
					if (a.getNome().equals(nome))
					{
						listaAluno.remove(a);
						System.out.println("O aluno escolhido foi excluido com sucesso...");
					}
				}
			} else {
				System.out.println("Este aluno já foi excluido ou não pertence a está lista...");
			}
		}
}