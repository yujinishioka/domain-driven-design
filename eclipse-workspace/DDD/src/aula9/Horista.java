package aula9;

public class Horista extends Empregado {
	
	private double precoHora, horasTrabalhadas;
	
	public Horista(double precoHora, double horasTrabalhadas) {
		super();
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double vencimento() {
		return horasTrabalhadas * precoHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
}
