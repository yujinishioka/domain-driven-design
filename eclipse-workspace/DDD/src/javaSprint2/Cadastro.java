package javaSprint2;

public class Cadastro{
	public String getLinkPortifolio() {
		return linkPortifolio;
	}
	
	private String nome;
	private String email;
	private String senha;
	private String dataNascimento;
	private String linkPortifolio;
	
	public Cadastro(String nome, String email, String senha, String dataNascimento, String linkPortifolio) {
		super();
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
		this.setDataNascimento(dataNascimento);
		this.setLinkPortifolio(linkPortifolio);
	}
	
	public void validaEmail () {
	}
	
	public void validaData() {
	}
	
	public void cadastraCurriculo() {
		//método que o candidato podera linkar o seu curriculo
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setLinkPortifolio(String linkPortifolio) {
		this.linkPortifolio = linkPortifolio;
	}
	
}
