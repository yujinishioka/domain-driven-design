package aula5;

public class Honda extends Carro {
	private String motor;
	
	// Construtor padrão
	public Honda() {
		
	}
	
	// Construtor com parametro
	public Honda(String motor, String modelo, double preco) {
		super(modelo, preco);
		this.motor = motor;
	}

	// getters e setters
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
}
