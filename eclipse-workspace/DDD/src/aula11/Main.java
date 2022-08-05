package aula11;

public class Main {

	public static void main(String[] args) {
		Matrizes metodo = new Matrizes();
		int[] v = metodo.tamanhoMatriz();
		int[][] m = metodo.criarMatriz(v);
		metodo.imprimirMatriz(m);
		int n = metodo.obterNumero();
		int r = metodo.verificarOcorrencia(m, n);
		System.out.printf("Ocorrencias: %d", r);
		System.out.println("\n-----------------");
	}
}
