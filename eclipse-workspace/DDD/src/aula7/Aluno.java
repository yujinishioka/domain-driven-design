package aula7;

import java.util.Date;

public class Aluno extends Pessoa{
	// atributos
	private String matricula, curso;
	private double mensalidade;
	
	public Aluno(String nome, String cpf, Date dataNasc, String matricula, String curso, double mensalidade) {
		super(nome, cpf, dataNasc);
		this.setMatricula(matricula);
		this.setCurso(curso);
		this.setMensalidade(mensalidade);
	}
	
	public double tirarCopias(int qtde) {
		double preco = 0.1;
		
		if(qtde >= 20) {
			preco = 0.05;
		}
		
		return preco * qtde;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", mensalidade=" + mensalidade
				+ ", getMatricula()=" + getMatricula() + ", getCurso()=" + getCurso() + ", getMensalidade()="
				+ getMensalidade() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getDataNasc()="
				+ getDataNasc() + "]";
	}
}
