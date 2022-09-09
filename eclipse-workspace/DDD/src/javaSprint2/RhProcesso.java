package javaSprint2;

public class RhProcesso {
	
	private String mensagensEtapas;
	private String contatoCandidato;
	
	public RhProcesso(String mensagensEtapas, String contatoCandidato) {
		super();
		this.setMensagensEtapas(mensagensEtapas);
		this.setContatoCandidato(contatoCandidato);
	}
	
	public void acompanhamento(String mensagensEtapa, String contatoCandidato) {
		//método que vai usar os contatos do candidato para enviar informações para ele
	}
	
	public String getMensagensEtapas() {
		return mensagensEtapas;
	}
	public void setMensagensEtapas(String mensagensEtapas) {
		this.mensagensEtapas = mensagensEtapas;
	}
	public String getContatoCandidato() {
		return contatoCandidato;
	}
	public void setContatoCandidato(String contatoCandidato) {
		this.contatoCandidato = contatoCandidato;
	}
	
	
}
