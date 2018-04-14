package br.edu.unicesumar;

import br.edu.unicesumar.View;
import java.util.Scanner;

/**
 * Classe que vai conter o m�todo do Menu do programa;
 * 
 * @author Lucas Gabriel de Souza
 */


public class TelaVeiculo {
	
	//Atibutos da classe;
	private Scanner scan;
	private View view;
	
	//M�todo construtor que inst�ncia a Classe View;
	public TelaVeiculo() {
		view = new View();
	}
	
	//M�todo de desenvolvimento do menu do sistema;
	public void menu() {
		
		scan = new Scanner(System.in); //Leitura de dados passado pelo teclado;
		int opcao = 0;
		
		//Loop para continuar chamando o menu, enquanto o usu�rio n�o escolher uma op��o igual a 6;
		while(opcao != 6)
		{
			System.out.println("----- Welcome to Menu -----");
			System.out.println(" ");
			System.out.println("Escolhe uma das op��es para ter acesso as funcionaldades dispon�veis\n");
			System.out.println("-- 1 - Inserir Autom�vel --");
			System.out.println("-- 2 - Inserir Caminh�o --");
			System.out.println("-- 3 - Inserir Motocicleta --");
			System.out.println("-- 4 - Listar todos os veiculos cadastrados --");
			System.out.println("-- 5 - Pesquisar pela placa --");
			System.out.println("-- 6 - Sair do Sistema --");
			opcao = scan.nextInt();
		
			//Fun��o para escolher a op��o que o usu�rio escolheu;
			switch(opcao) {
				case 1:
					view.inserirAutomovel();
					break;
				case 2:
					view.inserirCaminhao();
					break;
				case 3:
					view.inserirMotocicleta();
					break;
				case 4:
					view.listarTodos();
					break;
				case 5:
					view.pesquisarPorPlaca();
					break;
				case 6:
					System.out.println("Saindo do sistema...");
			}
		}
	}
}