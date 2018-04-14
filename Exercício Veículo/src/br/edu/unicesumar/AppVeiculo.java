package br.edu.unicesumar;

import br.edu.unicesumar.TelaVeiculo;

/**
 * Classe que contem o método de acesso do programa;
 * 
 * @author Lucas Gabriel de Souza
 */

public class AppVeiculo {
	
	//Atributo da classe que faz uma Associação com a Classe TelaVeiculo e faz referência a mesma Classe;
	private static TelaVeiculo chama;

	public static void main(String[] args) {
		
		//Instanciamento da Classe TelaVeiculo;
		chama = new TelaVeiculo();
		
		//Utilização da varíavel (chama) para chamae o método menu da Classe TelaVeiculo;
		chama.menu();
	}
}
