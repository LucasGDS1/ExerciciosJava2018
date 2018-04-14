package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;

/**
 * Classe que herda os atributos da Classe Veiculo;
 *
 * @author Lucas Gabriel de Souza
 */

//Utilização da função exntends, justamente para a Classe Motocicleta
//Utilizar os mesmos atributos da Classe Veículo;
public class Motocicleta extends Veiculo{
	
	//Atributos da classe;
    private int cilindrada;
    private String tipoMoto;
    
    //Método construtor;
    public Motocicleta(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor, int cilindrada, String tipoMoto){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    //Métodos GETTERS E SETTERS;
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}
}
