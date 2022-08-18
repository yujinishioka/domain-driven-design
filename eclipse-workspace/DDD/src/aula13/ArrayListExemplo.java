package aula13;

import java.util.ArrayList;

public class ArrayListExemplo {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("BMW");
		carros.add("Volvo");
		carros.add("Mercedes");
		carros.add("Ferrari");
		
		for(int i=0; i<carros.size(); i++) {
			System.out.println((i + 1) + " Carro: " + carros.get(i));
		}
		System.out.println("");
		
		carros.set(0, "Jaguar");
		System.out.println(carros);
		System.out.println("Quantidade: " + carros.size());
		System.out.println("");
		
		carros.clear();
		carros.add("Corsa");
		carros.add("Ford");
		carros.add("Toyota");
		
		for (String carro : carros) {
			System.out.println("Carro: " + carro);
		}
	}
}
