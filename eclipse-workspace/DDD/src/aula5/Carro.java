package aula5;

public class Carro {
	// atributos
	private String cor, modelo;
	private double preco;
	
	// Construtor
	public Carro() {
		
	}

	// Construtor com 2 parametros
	public Carro(String modelo, double preco) {
		this.cor = "Preto";
		this.modelo = modelo;
		this.preco = preco;
	}
	
	// Construtor com todos os parametros
	public Carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	// getters e setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
