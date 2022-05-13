package aula5;

import java.util.Scanner;

public class WhileDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, f;
		
		do {
			System.out.println("i: ");
			i = input.nextInt();
			System.out.println("f: ");
			f = input.nextInt();
			
			if (i < f) {
				System.out.println("I tem que ser maior do que F!");
				System.out.println("Tente novamente.");
			}
		} while(i < f);
		
		while(i >= f) {
			System.out.println("i: " + i);
			i--;
		}
		
		input.close();
	}
}
