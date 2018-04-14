package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;

/**
 * Classe que herda os atributos da Classe Veiculo;
 * 
 * @author Lucas Gabriel de Souza
 */



//Utiliza��o da fun��o exntends, justamente para a Classe Autom�vel
//Utilizar os mesmos atributos da Classe Veiculo;
public class Automovel extends Veiculo{
	
	//Atributos da classe;
	private  int kilometroLitro;
	private  String motor;
	
	//M�todo construtor;
	public Automovel(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor, int kml, String motor) {
		super(chassi, nome, marca, modelo, anoFab, placa, cor);
		this.kilometroLitro = kml;
		this.motor = motor;
	}
	
	//M�todos GETTERS E SETTERS;
	public int getKilometroLitro() {
		return kilometroLitro;
	}
	public void setKilometroLitro(int kml) {
		this.kilometroLitro = kml;
	}
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
}
