package sprint3;

import java.util.Date;

public class Candidato {
	private String nome, cpf, email;
	private Date dataNascimento;
	private int id;
	
	public Candidato(String nome, String cpf, String email, Date dataNascimento, int id) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "[id: " + this.getId() + " | nome: " + this.getNome() + " | e-mail: " + this.getEmail() + " | CPF: " + this.getCpf() + " | Data de Nascimento: " + this.getDataNascimento() + "]";
	}
	
	public void imprimeCandidato(Candidato c) {
		System.out.println(c.toString());
	}
}
