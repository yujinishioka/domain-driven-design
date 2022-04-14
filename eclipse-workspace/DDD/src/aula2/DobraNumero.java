package aula2;

import java.util.Scanner;

public class DobraNumero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float numero, res;
		
		System.out.println("-- DOBRA NUMERO --");
		System.out.println("Digite um numero: ");
		numero = input.nextFloat();

		res = numero*2;
		
		System.out.println("Resultado: " + res);
		
	}

}
