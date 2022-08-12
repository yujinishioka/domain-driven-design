package aula10;

import java.util.Scanner;

public class RevisaoArray {

	public int tamanhoVetor() {
		System.out.println("-- Tamanho do Vetor --");
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho do Vetor: ");
		int t = input.nextInt();
		input.close();
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
        input.close();
        return vetor;
    }

    public void imprimirVetor(int[] v) {
        System.out.println("-- Imprimindo... --");
        for(int i=0; i < v.length; i++) {
            System.out.printf("vetor [%d]: %d\n", i, v[i]);
        }
    }

    public int obterNumero() {
        System.out.println("-- Obter número --");
        Scanner input = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = input.nextInt();
        input.close();
        return n;
    }

    public int obterOcorrencias(int[] v, int n) {
        System.out.println("-- Verificar ocorrencias... --");
        int c = 0;

        for(int i=0; i < v.length; i++) {
            if(v[i] == n) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        RevisaoArray obj = new RevisaoArray();
        int t = obj.tamanhoVetor();
        int[] v = obj.criarVetor(t);
        obj.imprimirVetor(v);
        int n = obj.obterNumero();
        int c = obj.obterOcorrencias(v, n);
        System.out.printf("Ocorrencias de %d: %d\n", n, c);
    }
}
