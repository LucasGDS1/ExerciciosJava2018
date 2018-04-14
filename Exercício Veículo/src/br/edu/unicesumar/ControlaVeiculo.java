package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;
import br.edu.unicesumar.Automovel;
import br.edu.unicesumar.Caminhao;
import br.edu.unicesumar.Motocicleta;
import java.util.ArrayList;

/**
 *	Classe para trabalhar os métodos que iram controlar todo o programa;
 *	
 *	Inserindo dados nas Classes Automóvel, Caminhão e Motocicleta;
 *	
 *	Adicionando os dados informados pelo usuário no ArrayList de Veículo;
 *
 *	Exibição e Pesquisa dos dados adicinados no ArrayList de Veículo;
 *
 * @author Lucas Gabriel de Souza
 */

public class ControlaVeiculo {
	
	//ArrayList para guardar umalista de veículos;
    private ArrayList<Veiculo> lista;
    
    	//Método construtor que instância o ArrayLit de Veículo;
	    public ControlaVeiculo(){
	        lista = new ArrayList<Veiculo>();
	    }
    

 	//Método de exibição dos dados que foram adicionados ao ArrayList de Veiculo;
    public void exibirTodos() {
    	
    	//Condição para verificar se a lista não está vazia;
    	if (lista != null & lista.size() > 0) {
    		
    		//Loop para percorrer o ArrayList de Veículo;
	    	for(Veiculo v : lista) {
	    		
	    		//Condição para dizer que a Classe Automóvel realmente é uma Classe que herda os atributos da Classe Veículo;
	    		if(v instanceof Automovel) {	
			    	System.out.println("--Automovel--");
			    	System.out.println(" ");
			    	System.out.println("Chassi: " + ((Automovel)v).getChassi());
			    	System.out.println("Nome: " + ((Automovel)v).getNome());
			    	System.out.println("Marca: " + ((Automovel)v).getMarca());
			    	System.out.println("Modelo: " + ((Automovel)v).getModelo());
			    	System.out.println("Ano de Fabricação: " + ((Automovel)v).getAnoFab());
			    	System.out.println("Cor: " + ((Automovel)v).getCor());
			    	System.out.println("Placa: " + ((Automovel)v).getPlaca());
			    	System.out.println("Motor: " + ((Automovel)v).getMotor());
			    	System.out.println("Kilometros por litro: " + ((Automovel)v).getKilometroLitro());
			    	System.out.println(" ");
    		
	    		//Condição para dizer que a Classe Caminhão realmente é uma Classe que herda os atibutos da Classe Veículo;
	    		} else  if(v instanceof Caminhao) {
		    			System.out.println("--Caminhao--");
		    			System.out.println(" ");
		        		System.out.println("Chassi: " + ((Caminhao)v).getChassi());
		        		System.out.println("Nome: " + ((Caminhao)v).getNome());
		        		System.out.println("Marca: " + ((Caminhao)v).getMarca());
		        		System.out.println("Modelo: " + ((Caminhao)v).getModelo());
		        		System.out.println("Ano de Fabricação: " + ((Caminhao)v).getAnoFab());
		        		System.out.println("Cor: " + ((Caminhao)v).getCor());
		        		System.out.println("Placa: " + ((Caminhao)v).getPlaca());
		        		System.out.println("Tipo de Carga: " + ((Caminhao)v).getTipoCarga());
		        		System.out.println("Tipo do Peso: " + ((Caminhao)v).getPeso());
		        		System.out.println(" ");
		        		
	        		//Condição para dizer que a Classe Motocicleta realmente é uma Classe que herda os atibutos da Classe Veículo;	
	        		} else  if(v instanceof Motocicleta) {
		        			System.out.println("--Motocicleta--");
		        			System.out.println(" ");
		            		System.out.println("Chassi: " + ((Motocicleta)v).getChassi());
		            		System.out.println("Nome: " + ((Motocicleta)v).getNome());
		            		System.out.println("Marca: " + ((Motocicleta)v).getMarca());
		            		System.out.println("Modelo: " + ((Motocicleta)v).getModelo());
		            		System.out.println("Ano de Fabricação: " + ((Motocicleta)v).getAnoFab());
		            		System.out.println("Cor: " + ((Motocicleta)v).getCor());
		            		System.out.println("Placa: " + ((Motocicleta)v).getPlaca());
		            		System.out.println("Tipo de Moto: " + ((Motocicleta)v).getTipoMoto());
		            		System.out.println("Quantas ciclindradas: " + ((Motocicleta)v).getCilindrada());
		            		System.out.println(" ");
	            		}
    		}
    	} else {
    		System.out.print("\n -- Lista Vazia -- \n");
    	}
    }
    
    //Método para inserir um Automóvel no ArrayList de Veículo;
    public void inserirAutomovel(Automovel a){
        lista.add(a);
    }
    
    //Método para inserir um Caminhão no ArrayList de Veículo;
    public void inserirCaminhao(Caminhao c){
        lista.add(c);
    }
    
 	//Método para inserir uma  Motocicleta no ArrayList de Veículo;
    public void inserirMotocicleta(Motocicleta m){
        lista.add(m);
    }
    
    //Método para pesquisar um dos três tipos de veículos no ArrayList de Veículo;
    public void pesquisarPorPlaca(String placa) {
    	
    	
    	if (lista != null & lista.size() > 0) {
    		
	    	for(Veiculo v : lista) {
	    		
	    		if(v.getPlaca().equals(placa)) {
	    			
		    		if(v instanceof Automovel) {
			    		System.out.println("--Automóvel--");
			    		System.out.println(" ");
			    		System.out.println("Chassi: " + (v).getChassi());
			    		System.out.println("Nome: " + (v).getNome());
			    		System.out.println("Marca: " + (v).getMarca());
			    		System.out.println("Modelo: " + (v).getModelo());
			    		System.out.println("Ano de Fabricação: " + (v).getAnoFab());
			    		System.out.println("Cor: " + (v).getCor());
			    		System.out.println("Placa: " + (v).getPlaca());
			    		System.out.println("Motor: " + ((Automovel)v).getMotor());
			    		System.out.println("Kilometros por Litro: " + ((Automovel)v).getKilometroLitro());
			    		System.out.println(" ");
	    		
		    		} else  if(v instanceof Caminhao) {
			    			System.out.println("--Caminhão--");
			    			System.out.println(" ");
			        		System.out.println("Chassi: " + ((Caminhao)v).getChassi());
			        		System.out.println("Nome: " + ((Caminhao)v).getNome());
			        		System.out.println("Marca: " + ((Caminhao)v).getMarca());
			        		System.out.println("Modelo: " + ((Caminhao)v).getModelo());
			        		System.out.println("Ano de Fabricação: " + ((Caminhao)v).getAnoFab());
			        		System.out.println("Cor: " + ((Caminhao)v).getCor());
			        		System.out.println("Placa: " + ((Caminhao)v).getPlaca());
			        		System.out.println("Tipo de Carga: " + ((Caminhao)v).getTipoCarga());
			        		System.out.println("Tipo do Peso: " + ((Caminhao)v).getPeso());
			        		System.out.println(" ");
	        		
		        	} else  if(v instanceof Motocicleta) {
			        			System.out.println("--Motocicleta--");
			        			System.out.println(" ");
			            		System.out.println("Chassi: " + ((Motocicleta)v).getChassi());
			            		System.out.println("Nome: " + ((Motocicleta)v).getNome());
			            		System.out.println("Marca: " + ((Motocicleta)v).getMarca());
			            		System.out.println("Modelo: " + ((Motocicleta)v).getModelo());
			            		System.out.println("Ano de Fabricação: " + ((Motocicleta)v).getAnoFab());
			            		System.out.println("Cor: " + ((Motocicleta)v).getCor());
			            		System.out.println("Placa: " + ((Motocicleta)v).getPlaca());
			            		System.out.println("Tipo de Moto: " + ((Motocicleta)v).getTipoMoto());
			            		System.out.println("Tipo do Cilindrada: " + ((Motocicleta)v).getCilindrada());
			            		System.out.println(" ");
			            		}
	    		}
    		}
    	}
    }  
}