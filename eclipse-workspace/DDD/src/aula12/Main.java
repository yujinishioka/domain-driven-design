package aula12;

public class Main {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos(3);
		
		Aluno a1 = new Aluno(1, "A");
		Aluno a2 = new Aluno(2, "B");
		
		lista.insereAlunos(a1);
		lista.insereAlunos(a2);
		
		lista.imprimeLista();
	}
}
