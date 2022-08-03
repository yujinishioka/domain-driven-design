package aula10;

import java.util.Scanner;

public class RevisaoArray {

	public int tamanhoVetor() {
		System.out.println("-- Tamanho do Vetor --");
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho do Vetor: ");
		int t = input.nextInt();
		return t;
	}

    public int[] criarVetor(int t) {
        System.out.println("-- Criando o Vetor --");
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[t];
        for(int i=0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: \n", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    public void imprimirVetor(int[] v) {
        System.out.println("-- Imprimindo... --");
        for(int i=0; i < v.length; i++) {
            System.out.printf("vetor [%d]: %d\n", i, v[i]);
        }
    }

    public static void main(String[] args) {
        RevisaoArray obj = new RevisaoArray();
        int t = obj.tamanhoVetor();
        int[] v = obj.criarVetor(t);
        obj.imprimirVetor(v);
    }
}
