package br.edu.unicesumar;

import br.edu.unicesumar.TelaVeiculo;

/**
 * Classe que contem o m�todo de acesso do programa;
 * 
 * @author Lucas Gabriel de Souza
 */

public class AppVeiculo {
	
	//Atributo da classe que faz uma Associa��o com a Classe TelaVeiculo e faz refer�ncia a mesma Classe;
	private static TelaVeiculo chama;

	public static void main(String[] args) {
		
		//Instanciamento da Classe TelaVeiculo;
		chama = new TelaVeiculo();
		
		//Utiliza��o da var�avel (chama) para chamae o m�todo menu da Classe TelaVeiculo;
		chama.menu();
	}
}
