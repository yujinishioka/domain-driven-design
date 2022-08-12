package aula12;

public class ListaAlunos {

	private Aluno[] alunos;
	int i = 0;
	
	public ListaAlunos(int qtde) {
		alunos = new Aluno[qtde];
	}

	public void insereAlunos(Aluno a) {
		if(i < alunos.length) {
			alunos[i] = a;
			System.out.println("Aluno inserido com sucesso...");
			i++;
		} else {
			System.out.println("Lista cheia, aluno nao inserido...");
		}
	}
	
	public void imprimeLista() {
		System.out.println("Lista de Alunos:");
		System.out.println("****************************");
		for(int i=0; i<alunos.length; i++) {
			if(alunos[i]!=null) {
				System.out.println(alunos[i].toString());
				System.out.println("****************************");
			} else {
				System.out.println("Vazio");
			}
		}
	}
}
