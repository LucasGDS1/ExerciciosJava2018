package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;
import br.edu.unicesumar.Automovel;
import br.edu.unicesumar.Caminhao;
import br.edu.unicesumar.Motocicleta;
import java.util.ArrayList;

/**
 *	Classe para trabalhar os m�todos que iram controlar todo o programa;
 *	
 *	Inserindo dados nas Classes Autom�vel, Caminh�o e Motocicleta;
 *	
 *	Adicionando os dados informados pelo usu�rio no ArrayList de Ve�culo;
 *
 *	Exibi��o e Pesquisa dos dados adicinados no ArrayList de Ve�culo;
 *
 * @author Lucas Gabriel de Souza
 */

public class ControlaVeiculo {
	
	//ArrayList para guardar umalista de ve�culos;
    private ArrayList<Veiculo> lista;
    
    	//M�todo construtor que inst�ncia o ArrayLit de Ve�culo;
	    public ControlaVeiculo(){
	        lista = new ArrayList<Veiculo>();
	    }
    

 	//M�todo de exibi��o dos dados que foram adicionados ao ArrayList de Veiculo;
    public void exibirTodos() {
    	
    	//Condi��o para verificar se a lista n�o est� vazia;
    	if (lista != null & lista.size() > 0) {
    		
    		//Loop para percorrer o ArrayList de Ve�culo;
	    	for(Veiculo v : lista) {
	    		
	    		//Condi��o para dizer que a Classe Autom�vel realmente � uma Classe que herda os atributos da Classe Ve�culo;
	    		if(v instanceof Automovel) {	
			    	System.out.println("--Automovel--");
			    	System.out.println(" ");
			    	System.out.println("Chassi: " + ((Automovel)v).getChassi());
			    	System.out.println("Nome: " + ((Automovel)v).getNome());
			    	System.out.println("Marca: " + ((Automovel)v).getMarca());
			    	System.out.println("Modelo: " + ((Automovel)v).getModelo());
			    	System.out.println("Ano de Fabrica��o: " + ((Automovel)v).getAnoFab());
			    	System.out.println("Cor: " + ((Automovel)v).getCor());
			    	System.out.println("Placa: " + ((Automovel)v).getPlaca());
			    	System.out.println("Motor: " + ((Automovel)v).getMotor());
			    	System.out.println("Kilometros por litro: " + ((Automovel)v).getKilometroLitro());
			    	System.out.println(" ");
    		
	    		//Condi��o para dizer que a Classe Caminh�o realmente � uma Classe que herda os atibutos da Classe Ve�culo;
	    		} else  if(v instanceof Caminhao) {
		    			System.out.println("--Caminhao--");
		    			System.out.println(" ");
		        		System.out.println("Chassi: " + ((Caminhao)v).getChassi());
		        		System.out.println("Nome: " + ((Caminhao)v).getNome());
		        		System.out.println("Marca: " + ((Caminhao)v).getMarca());
		        		System.out.println("Modelo: " + ((Caminhao)v).getModelo());
		        		System.out.println("Ano de Fabrica��o: " + ((Caminhao)v).getAnoFab());
		        		System.out.println("Cor: " + ((Caminhao)v).getCor());
		        		System.out.println("Placa: " + ((Caminhao)v).getPlaca());
		        		System.out.println("Tipo de Carga: " + ((Caminhao)v).getTipoCarga());
		        		System.out.println("Tipo do Peso: " + ((Caminhao)v).getPeso());
		        		System.out.println(" ");
		        		
	        		//Condi��o para dizer que a Classe Motocicleta realmente � uma Classe que herda os atibutos da Classe Ve�culo;	
	        		} else  if(v instanceof Motocicleta) {
		        			System.out.println("--Motocicleta--");
		        			System.out.println(" ");
		            		System.out.println("Chassi: " + ((Motocicleta)v).getChassi());
		            		System.out.println("Nome: " + ((Motocicleta)v).getNome());
		            		System.out.println("Marca: " + ((Motocicleta)v).getMarca());
		            		System.out.println("Modelo: " + ((Motocicleta)v).getModelo());
		            		System.out.println("Ano de Fabrica��o: " + ((Motocicleta)v).getAnoFab());
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
    
    //M�todo para inserir um Autom�vel no ArrayList de Ve�culo;
    public void inserirAutomovel(Automovel a){
        lista.add(a);
    }
    
    //M�todo para inserir um Caminh�o no ArrayList de Ve�culo;
    public void inserirCaminhao(Caminhao c){
        lista.add(c);
    }
    
 	//M�todo para inserir uma  Motocicleta no ArrayList de Ve�culo;
    public void inserirMotocicleta(Motocicleta m){
        lista.add(m);
    }
    
    //M�todo para pesquisar um dos tr�s tipos de ve�culos no ArrayList de Ve�culo;
    public void pesquisarPorPlaca(String placa) {
    	
    	
    	if (lista != null & lista.size() > 0) {
    		
	    	for(Veiculo v : lista) {
	    		
	    		if(v.getPlaca().equals(placa)) {
	    			
		    		if(v instanceof Automovel) {
			    		System.out.println("--Autom�vel--");
			    		System.out.println(" ");
			    		System.out.println("Chassi: " + (v).getChassi());
			    		System.out.println("Nome: " + (v).getNome());
			    		System.out.println("Marca: " + (v).getMarca());
			    		System.out.println("Modelo: " + (v).getModelo());
			    		System.out.println("Ano de Fabrica��o: " + (v).getAnoFab());
			    		System.out.println("Cor: " + (v).getCor());
			    		System.out.println("Placa: " + (v).getPlaca());
			    		System.out.println("Motor: " + ((Automovel)v).getMotor());
			    		System.out.println("Kilometros por Litro: " + ((Automovel)v).getKilometroLitro());
			    		System.out.println(" ");
	    		
		    		} else  if(v instanceof Caminhao) {
			    			System.out.println("--Caminh�o--");
			    			System.out.println(" ");
			        		System.out.println("Chassi: " + ((Caminhao)v).getChassi());
			        		System.out.println("Nome: " + ((Caminhao)v).getNome());
			        		System.out.println("Marca: " + ((Caminhao)v).getMarca());
			        		System.out.println("Modelo: " + ((Caminhao)v).getModelo());
			        		System.out.println("Ano de Fabrica��o: " + ((Caminhao)v).getAnoFab());
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
			            		System.out.println("Ano de Fabrica��o: " + ((Motocicleta)v).getAnoFab());
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