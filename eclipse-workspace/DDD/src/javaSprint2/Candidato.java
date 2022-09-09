package javaSprint2;

import java.util.Date;

public class Candidato {
	
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	public Candidato(String nome, String cpf, Date dataNascimento) {
		super();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);	
	}
	
	public void candidatar() {
		//método para o candidato de candidatar as vagas
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
