package br.edu.unicesumar;

import br.edu.unicesumar.Veiculo;

/**
 * Classe que herda os atributos da Classe Veiculo;
 *
 * @author Lucas Gabriel de Souza
 */

//Utiliza��o da fun��o exntends, justamente para a Classe Motocicleta
//Utilizar os mesmos atributos da Classe Ve�culo;
public class Motocicleta extends Veiculo{
	
	//Atributos da classe;
    private int cilindrada;
    private String tipoMoto;
    
    //M�todo construtor;
    public Motocicleta(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor, int cilindrada, String tipoMoto){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    //M�todos GETTERS E SETTERS;
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
