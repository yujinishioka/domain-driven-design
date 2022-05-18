package aula8;

public class Teste {
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		Gato gato1 = new Gato();
		
		cachorro1.setNome("Rex");
		System.out.println("Nome do cachorro: " + cachorro1.getNome());
		cachorro1.fazerBarulho();
		System.out.println("");
		
		gato1.setNome("Melissa");
		System.out.println("Nome do gato: " + gato1.getNome());
		gato1.fazerBarulho();
	}
}
