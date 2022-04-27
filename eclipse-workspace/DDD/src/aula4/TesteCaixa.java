package aula4;

import java.util.Scanner;

public class TesteCaixa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Caixa cx1 = new Caixa();
		System.out.println("Volume cx1: " + cx1.calcularVolume());
		cx1.setAltura(20);
		cx1.setLargura(20);
		cx1.setProfundidade(20);
		System.out.println("Novo volume cx1: " + cx1.calcularVolume());
		System.out.println("Altura: " + cx1.getAltura());
		System.out.println("");
		
		Caixa cx2 = new Caixa();
		System.out.println("Volume cx2: " + cx2.calcularVolume());
		System.out.println("");
		
		Caixa cx3 = new Caixa(15, 24, 52);
		double volumeCx3 = cx3.calcularVolume();
		System.out.println("Volume cx3: " + volumeCx3);
		System.out.println("");
		
		// Information from input
		System.out.println("Altura: ");
		double a = input.nextDouble();
		System.out.println("Largura: ");
		double l = input.nextDouble();
		System.out.println("Profundidade: ");
		double p = input.nextDouble();
		Caixa cx4 = new Caixa(a, l, p);
		System.out.println("Volume cx4: " + cx4.calcularVolume());
		
		input.close();
	}
}
