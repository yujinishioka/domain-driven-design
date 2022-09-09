package javaSprint2;

public class botFeedbacks {
	
	private String contato;
	private String pesquisa;
	
	
	public botFeedbacks(String contato, String pesquisa) {
		super();
		this.setContato(contato);
		this.setPesquisa(pesquisa);
	}
	
	
	public void envioEmail(String contato) {
		//método que envio o email para o candidato
	}
	
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	
}
