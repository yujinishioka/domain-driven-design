package aula6;

public class Teste {

	public static void main(String[] args) {
		Honda carro1 = new Honda("2.0 Flex", "Honda Fit", 60000);
		System.out.println("Primeiro carro");
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Motor: " + carro1.getMotor());
		System.out.println("Preco: R$" + carro1.getPreco());
	}
}