package javaSprint2;

public class TesteOnline {
	
	
	private String perguntas;
	private String respostas;
	private String gabarito;
	
	public TesteOnline(String perguntas, String respostas, String gabarito) {
		super();
		this.setPerguntas(perguntas);
		this.setRespostas(respostas);
		this.setGabarito(gabarito);
	}
	public void recebeResposta() {	
	}
	public void envioGabarito(String gabarito) {	
	}
	
	
	public String getPerguntas() {
		return perguntas;
	}
	public void setPerguntas(String perguntas) {
		this.perguntas = perguntas;
	}
	public String getRespostas() {
		return respostas;
	}
	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}
	public String getGabarito() {
		return gabarito;
	}
	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}
	
	

}
