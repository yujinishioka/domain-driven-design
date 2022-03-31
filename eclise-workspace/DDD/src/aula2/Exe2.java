// Recebe um valor em Fahrenheit
// Retorna temperatura em Celsius
// tempC = (tempF - 32)/1.8
package aula2;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double tempF, tempC;
		
		System.out.println("-- CONVERSAO DE TEMPERATURA --");
		System.out.println("Digite a Temperatura em Fahrenheit: ");
		tempF = input.nextFloat();

		tempC = (tempF - 32)/1.8;
		
		System.out.println("Temperatura em Celsius: " + tempC);

	}

}
