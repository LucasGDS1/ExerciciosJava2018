package br.unicesumar;

import br.unicesumar.ShowAluno;
import java.text.ParseException;
import java.util.Scanner;


public class AlunoApp {
	
	private static Scanner scan;

	public static void main(String[] args) throws ParseException {
		
		ShowAluno show = new ShowAluno();
		scan = new Scanner(System.in);
		
		int opcao = 0;
		
			while(opcao != 6)
			{
			System.out.println("Escolha uma das opções do menu a seguir...");
			System.out.println("1 - Inserir");
			System.out.println("2 - Alterar");
			System.out.println("3 - Pesquisar");
			System.out.println("4 - Listar");
			System.out.println("5 - Excluir");
			System.out.println("6 - Sair");
			System.out.println();
			opcao = scan.nextInt();
			
			
			switch(opcao){
			case 1:
				show.carregarAluno();
				break;
			case 2:
				show.alterar();
				break;
			case 3:
				show.pesquisar();
				break;
			case 4:
				show.listar();
				break;
			case 5:
				show.excluir();
				break;
			case 6:
				System.out.println("Saindo do sistema...");
			}
			}
	}

}
