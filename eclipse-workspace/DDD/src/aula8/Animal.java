package aula8;

public abstract class Animal {
	
	private String nome;
	
	public abstract void fazerBarulho();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
