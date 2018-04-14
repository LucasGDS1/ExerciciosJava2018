package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;

/**
 * Classe que herda os atributos da Classe Veiculo;
 *
 * @author Lucas Gabriel de Souza
 */

//Utiliza��o da fun��o exntends, justamente para a Classe Caminh�o
//Utilizar os mesmos atributos da Classe Veiculo;
public class Caminhao extends Veiculo{
	
	//Atributos da classe;
    private int peso;
    private String tipoCarga;
    
    //M�todo construtor;
    public Caminhao(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor, int peso, String tipoCarga){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        
    }
    
    //M�todos GETTERS E SETTERS;
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getTipoCarga(){
        return tipoCarga;
    }
    
    public void setTipoCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }
}