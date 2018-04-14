package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;
import br.edu.unicesumar.Automovel;
import br.edu.unicesumar.Caminhao;
import br.edu.unicesumar.Motocicleta;
import java.util.Scanner;

/**
 *	Classe para trabalhar o polimorfismo dos métodos que controlam o programa;
 *
 *
 * @author Lucas Gabriel de Souza
 */

public class View {
	
	//Associação da classe ControlaVeiculo e de mais atributos;
	private ControlaVeiculo control;
	private Scanner scan;
	
		//Método construtor que instancia a Classe: ControlaVeiculo, utilizando a varíavel que faz referência a um novo objeto da Classe;
		public View() {
			control = new ControlaVeiculo();
		}
		
		//Método que utiliza a varíavel (control) para chamar o método de exibição da Classe ControlaVeiculo;
		public void listarTodos() {
			control.exibirTodos();
		}
		
		//Método para fazer a inserção de dados da Classe Automóvel;
		public void inserirAutomovel() {
			scan = new Scanner(System.in);
			
			System.out.println("Digite o Chassi do Automóvel: ");
			String chassi = scan.nextLine();
			System.out.println("Digite o nome do Automóvel: ");
			String nome = scan.nextLine();
			System.out.println("Digite a marca do Automóvel: ");
			String marca = scan.nextLine();
			System.out.println("Digite o modelo do Automóvel: ");
			String modelo = scan.nextLine();
			System.out.println("Digite o ano de fabricação do Automóvel: ");
			int anoFab = scan.nextInt();
			System.out.println("Digite a placa do Automóvel: ");
			String placa = scan.next().toString();
			System.out.println("Digite a cor do Automóvel: ");
			String cor = scan.next().toString();
			System.out.println("Digite quantos kilometros faz por litro o Automóvel: ");
			int kml = scan.nextInt();
			System.out.println("Digite a marca do motor do Automóvel: ");
			String motor = scan.next();
			
			//Instância da Claase Automóvel, passando como parâmetro os dados inseridos pelo usuário;
			Veiculo a = new Automovel(chassi, nome, marca, modelo, anoFab, placa, cor,  kml, motor);
			
			//Comando para inserir as informações passadas pelo usuário no método que inseri os dados no ArrayList de Veículo;
			//Control é a varíavel que faz referencia a Objeto da Classe ControlaVeiculo, justamente por isso essa varíavel pode chamar
			//O método que vai inserir os dados no ArrayList de Veiculo;
			control.inserirAutomovel((Automovel)a);			
		}
		
		//Método para fazer a inserção de dados da Classe Caminhão;
		public void inserirCaminhao() {
			scan = new Scanner(System.in);
			
			System.out.println("Digite o Chassi do Caminhão: ");
			String chassi = scan.nextLine();
			System.out.println("Digite o nome do Caminhão: ");
			String nome = scan.nextLine();
			System.out.println("Digite a marca do Caminhão: ");
			String marca = scan.nextLine();
			System.out.println("Digite o modelo do Caminhão: ");
			String modelo = scan.nextLine();
			System.out.println("Digite o ano de fabricação do Caminhão: ");
			int anoFab = scan.nextInt();
			System.out.println("Digite a placa do Caminhão: ");
			String placa = scan.next().toString();
			System.out.println("Digite a cor do Caminhão: ");
			String cor = scan.next().toString();
			System.out.println("Digite o peso do Caminhão: ");
			int peso = scan.nextInt();
			System.out.println("Digite o tipo de carga que o Caminhão transporta: ");
			String tipoCarga = scan.next();
			
			//Instância da Claase Caminhão, passando como parâmetro os dados inseridos pelo usuário;
			Veiculo c = new Caminhao(chassi, nome, marca, modelo, anoFab, placa, cor, peso, tipoCarga);
			
			//Comando para inserir as informações passadas pelo usuário no método que inseri os dados no ArrayList de Veículo;
			//Control é a varíavel que faz referência a Objeto da Classe ControlaVeiculo, justamente por isso essa varíavel pode chamar
			//O método que vai inserir os dados no ArrayList de Veiculo;
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
			System.out.println("Digite o ano de fabricação da Motocicleta: ");
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
		
		//Método que utiliza a varíavel (control) para chamar o método de pesquisar da Classe ControlaVeiculo;
		public void pesquisarPorPlaca() {
			
			//Instância da função Scanner para ler os dados inseridos pelo teclado;
			scan = new Scanner(System.in);
			
			//Mensagem para o usuário;
			System.out.println("Digite a placa do Veiculo que deseja pesquisar");
			//Leitura do dado informado pelo usuário, utilizando o mando nextLine;
			String placa = scan.nextLine();
			
			//Utilização da varíavel control para chamar o método de pesquisar e passar o parâmetro informado pelo usuário;
			control.pesquisarPorPlaca(placa);
		}
}