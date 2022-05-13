package aula7;

import java.util.Date;

public class Professor extends Pessoa {
	// atributos
	private String disciplina;
	private double salario;
	
	public Professor (String nome, String cpf, Date dataNasc, String disciplina) {
		super(nome, cpf, dataNasc);
		this.setSalario(1000);
		this.setDisciplina(disciplina);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
