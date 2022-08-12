package aula12;

public class Aluno {
	
	private int matricula;
	private String nome;
	
	public Aluno(int m, String n) {
		setMatricula(m);
		setNome(n);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "[Matricula: " + getMatricula() + "; Nome: " + getNome() + "]";
	}
}
