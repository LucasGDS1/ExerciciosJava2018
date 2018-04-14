package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;
import br.edu.unicesumar.Automovel;
import br.edu.unicesumar.Caminhao;
import br.edu.unicesumar.Motocicleta;
import java.util.Scanner;

/**
 *	Classe para trabalhar o polimorfismo dos m�todos que controlam o programa;
 *
 *
 * @author Lucas Gabriel de Souza
 */

public class View {
	
	//Associa��o da classe ControlaVeiculo e de mais atributos;
	private ControlaVeiculo control;
	private Scanner scan;
	
		//M�todo construtor que instancia a Classe: ControlaVeiculo, utilizando a var�avel que faz refer�ncia a um novo objeto da Classe;
		public View() {
			control = new ControlaVeiculo();
		}
		
		//M�todo que utiliza a var�avel (control) para chamar o m�todo de exibi��o da Classe ControlaVeiculo;
		public void listarTodos() {
			control.exibirTodos();
		}
		
		//M�todo para fazer a inser��o de dados da Classe Autom�vel;
		public void inserirAutomovel() {
			scan = new Scanner(System.in);
			
			System.out.println("Digite o Chassi do Autom�vel: ");
			String chassi = scan.nextLine();
			System.out.println("Digite o nome do Autom�vel: ");
			String nome = scan.nextLine();
			System.out.println("Digite a marca do Autom�vel: ");
			String marca = scan.nextLine();
			System.out.println("Digite o modelo do Autom�vel: ");
			String modelo = scan.nextLine();
			System.out.println("Digite o ano de fabrica��o do Autom�vel: ");
			int anoFab = scan.nextInt();
			System.out.println("Digite a placa do Autom�vel: ");
			String placa = scan.next().toString();
			System.out.println("Digite a cor do Autom�vel: ");
			String cor = scan.next().toString();
			System.out.println("Digite quantos kilometros faz por litro o Autom�vel: ");
			int kml = scan.nextInt();
			System.out.println("Digite a marca do motor do Autom�vel: ");
			String motor = scan.next();
			
			//Inst�ncia da Claase Autom�vel, passando como par�metro os dados inseridos pelo usu�rio;
			Veiculo a = new Automovel(chassi, nome, marca, modelo, anoFab, placa, cor,  kml, motor);
			
			//Comando para inserir as informa��es passadas pelo usu�rio no m�todo que inseri os dados no ArrayList de Ve�culo;
			//Control � a var�avel que faz referencia a Objeto da Classe ControlaVeiculo, justamente por isso essa var�avel pode chamar
			//O m�todo que vai inserir os dados no ArrayList de Veiculo;
			control.inserirAutomovel((Automovel)a);			
		}
		
		//M�todo para fazer a inser��o de dados da Classe Caminh�o;
		public void inserirCaminhao() {
			scan = new Scanner(System.in);
			
			System.out.println("Digite o Chassi do Caminh�o: ");
			String chassi = scan.nextLine();
			System.out.println("Digite o nome do Caminh�o: ");
			String nome = scan.nextLine();
			System.out.println("Digite a marca do Caminh�o: ");
			String marca = scan.nextLine();
			System.out.println("Digite o modelo do Caminh�o: ");
			String modelo = scan.nextLine();
			System.out.println("Digite o ano de fabrica��o do Caminh�o: ");
			int anoFab = scan.nextInt();
			System.out.println("Digite a placa do Caminh�o: ");
			String placa = scan.next().toString();
			System.out.println("Digite a cor do Caminh�o: ");
			String cor = scan.next().toString();
			System.out.println("Digite o peso do Caminh�o: ");
			int peso = scan.nextInt();
			System.out.println("Digite o tipo de carga que o Caminh�o transporta: ");
			String tipoCarga = scan.next();
			
			//Inst�ncia da Claase Caminh�o, passando como par�metro os dados inseridos pelo usu�rio;
			Veiculo c = new Caminhao(chassi, nome, marca, modelo, anoFab, placa, cor, peso, tipoCarga);
			
			//Comando para inserir as informa��es passadas pelo usu�rio no m�todo que inseri os dados no ArrayList de Ve�culo;
			//Control � a var�avel que faz refer�ncia a Objeto da Classe ControlaVeiculo, justamente por isso essa var�avel pode chamar
			//O m�todo que vai inserir os dados no ArrayList de Veiculo;
			control.inserirCaminhao((Caminhao)c);			
		}
		
		public void inserirMotocicleta() {
			scan = new Scanner(System.in);
			
			System.out.println("Digite o Chassi da Motocicleta: ");
			String chassi = scan.nextLine();
			System.out.println("Digite o nome da Motocicleta: ");
			String nome = scan.nextLine();
			System.out.println("Digite a marca da Motocicleta: ");
			String marca = scan.nextLine();
			System.out.println("Digite o modelo da Motocicleta: ");
			String modelo = scan.nextLine();
			System.out.println("Digite o ano de fabrica��o da Motocicleta: ");
			int anoFab = scan.nextInt();
			System.out.println("Digite a placa da Motocicleta: ");
			String placa = scan.next().toString();
			System.out.println("Digite a cor da Motocicleta: ");
			String cor = scan.next().toString();
			System.out.println("Digite as cilindradas da Motocicleta: ");
			int cilindra = scan.nextInt();
			System.out.println("Digite o tipo da Motocicleta: ");
			String tipoMoto = scan.next();
			
			Veiculo m = new Motocicleta(chassi, nome, marca, modelo, anoFab, placa, cor, cilindra, tipoMoto);
			
			control.inserirMotocicleta((Motocicleta)m);			
		}
		
		//M�todo que utiliza a var�avel (control) para chamar o m�todo de pesquisar da Classe ControlaVeiculo;
		public void pesquisarPorPlaca() {
			
			//Inst�ncia da fun��o Scanner para ler os dados inseridos pelo teclado;
			scan = new Scanner(System.in);
			
			//Mensagem para o usu�rio;
			System.out.println("Digite a placa do Veiculo que deseja pesquisar");
			//Leitura do dado informado pelo usu�rio, utilizando o mando nextLine;
			String placa = scan.nextLine();
			
			//Utiliza��o da var�avel control para chamar o m�todo de pesquisar e passar o par�metro informado pelo usu�rio;
			control.pesquisarPorPlaca(placa);
		}
}