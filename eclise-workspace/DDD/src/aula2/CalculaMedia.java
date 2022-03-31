package aula2;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		// criacao do objeto Scanner
		Scanner input = new Scanner(System.in);
		
		// declaracao de variaveis
		float nota1, nota2, nota3, media;
		String nome;
		
		System.out.println("-- CALCULA MEDIA --");
		
		// entrada de dados
		System.out.println("Nome do Aluno: ");
		nome = input.nextLine();
		System.out.println("Nota 1: ");
		nota1 = input.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = input.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = input.nextFloat();
		
		// processamento
		media = (nota1+nota2+nota3)/3;
		
		// saida de dados
		System.out.println("Aluno: " + nome);
		System.out.println("Média: " + media);

	}

}
