package aula9;

public class Teste {

	public static void main(String[] args) {
		
		Assalariado a1 = new Assalariado("Fernando", "Luiz", "111.222.333-44", 8000);
		System.out.println("Funcionario:" + a1.getNome()); 
		System.out.println("Sálario: R$" + a1.vencimento());
		System.out.println("");
		
		Comissionado c1 = new Comissionado(50000, 10);
		c1.setNome("Felipe");
		System.out.println("Funcionario:" + c1.getNome()); 
		System.out.println("Sálario: R$" + c1.vencimento());
		System.out.println("");
		
		Horista h1 = new Horista(80, 80);
		h1.setNome("Paula");
		System.out.println("Funcionario:" + h1.getNome()); 
		System.out.println("Sálario: R$" + h1.vencimento());
		System.out.println("");
	}
}
