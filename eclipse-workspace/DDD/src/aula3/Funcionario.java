package aula3;

public class Funcionario {
	// atributos
	private int idFuncionario;
	private String nome;
	private String departamento;
	private double salario;
	private String admissao;
	private String rg;
	
	// metodos: getters e setters
	public int getIdFuncionario() {
		return idFuncionario;
	}
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double aumentarSalario(double aumento) {
		salario = salario + aumento;
		return salario;
	}
}
