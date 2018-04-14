package br.edu.unicesumar;

/**
 * Classe Veículo que conterá os atributos herdados pelas Classes Automóvel, Caminhão e Motocicleta;
 *
 * @author Lucas Gabriel de Souza
 */


public class Veiculo {

	//Atributos da classe;
    protected  String chassi;
    protected  String nome;
    protected  String marca;
    protected  String modelo;
    protected  int anoFab;
    protected  String placa;
    protected  String cor;
    
    //Método construtor;
    public Veiculo(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor){
        super();
        this.chassi = chassi;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.placa = placa;
        this.cor = cor;
    }
    
    //Métodos GETTERS E SETTERS;
    public String getChassi(){
        return chassi;
    }
    
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }


    public String getMarca() {
        return marca;
    }

  
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}