package aula12;

import java.util.Scanner;

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
		return "Aluno [Matricula: " + getMatricula() + "; Nome: " + getNome() + "]";
	}

	public void cadastrar(int quantidade) {
		String nome, buffer;
		int matricula;
		int num = 0;
			
		Aluno[] alunos = new Aluno[quantidade];
		Scanner input = new Scanner(System.in);
			
		for(int i = 0; i < quantidade; i++) {
			num++;
			
			System.out.println("Digite o nome do aluno " + num + " : ");
			this.nome = input.nextLine();
			buffer = input.next();
			
			System.out.println("Digite a matricula do aluno " + num + " : ");
			this.matricula = input.nextInt();
			
			alunos[i] = new Aluno(this.matricula, this.nome);
		}
		input.close();
	}
}
