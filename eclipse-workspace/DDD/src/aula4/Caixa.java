package aula4;

public class Caixa {
	// attributes
	private double largura, altura, profundidade;

	// getters e setters
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	// constructors
	public Caixa() {
		System.out.println("Construção da Caixa");
		largura = 10;
		altura = 10;
		profundidade = 10;
	}
	
	public Caixa(double a, double l, double p) {
		altura = a;
		largura = l;
		profundidade = p;
	}

	public double calcularVolume() {
		System.out.println("Calcula o volume da caixa");
		double result = altura * largura * profundidade;
		return result;
	}
}
