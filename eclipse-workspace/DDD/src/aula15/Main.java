package aula15;

public class Main {

	public static void main(String[] args) {
		ModeloTV01 tv1 = new ModeloTV01(65);
		ModeloTV02 tv2 = new ModeloTV02(72);
		
		tv1.ligarTV();
		tv2.ligarTV();
		
		System.out.println(tv1.toString());
	}
}
