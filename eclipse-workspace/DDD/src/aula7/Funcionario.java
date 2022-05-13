package aula7;

import java.util.Date;

public class Funcionario extends Pessoa {
	// atributos
	private String cargo;
	private double salario;
	private Date dataAdmissao;
	
	public Funcionario(String nome, String cpf, Date dataNasc, String cargo, double salario, Date dataAdmissao) {
		super(nome, cpf, dataNasc);
		this.setCargo(cargo);
		this.setSalario(salario);
		this.setDataAdmissao(dataAdmissao);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}
