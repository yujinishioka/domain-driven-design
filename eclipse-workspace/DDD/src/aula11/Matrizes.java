package aula11;

import java.util.Scanner;

public class Matrizes {
	
	public int[] tamanhoMatriz() {
		System.out.println("-- Tamanho da Matriz --");
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[2];
		System.out.println("Linhas: ");
		vetor[0] = input.nextInt();
		System.out.println("Colunas: ");
		vetor[1] = input.nextInt();
		input.close();
		return vetor;
	}
	
	public int[][] criarMatriz(int[] vetor) {
		System.out.println("-- Montando Matriz... --");
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[vetor[0]][vetor[1]];
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d] \n", i, j);
				matriz[i][j] = input.nextInt();
			}
		}
		input.close();
		return matriz;
	}
	
	public void imprimirMatriz(int[][] matriz) {
		System.out.println("-- Matriz --");
		
		for(int i=0; i < matriz.length; i++) {
			System.out.println("\n");
			for(int j=0; j < matriz[i].length; j++) {
				System.out.printf(" %d", matriz[i][j]);
			}
		}
		System.out.println("\n--------------\n");
	}
	
	public int obterNumero() {
		System.out.println("-- Obter Numero --");
		Scanner input = new Scanner(System.in);
		System.out.println("Numero: \n");
		int n = input.nextInt();
		input.close();
		return n;
	}
	
	public int verificarOcorrencia(int[][] m, int n) {
		System.out.println("-- Verificando --");
		int cont = 0;
		
		for(int i=0; i < m.length; i++) {
			for(int j=0; j < m[i].length; j++) {
				if(n == m[i][j]) {
					cont++;
				}
			}
		}
		return cont;
	}
}
