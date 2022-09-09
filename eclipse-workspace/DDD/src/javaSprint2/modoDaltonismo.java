package javaSprint2;

public class modoDaltonismo {
	
	private String cores;
	private String acesso;
	
	public modoDaltonismo(String cores, String acesso) {
		super();
		this.setCores(cores);
		this.setAcesso(acesso);
	}
	
	public void ligar() {
		//método que liga o modo daltonismo
		System.out.println("Modo Daltonismo Ligado!");
	}
	
	public void desligar() {
		System.out.println("Modo Daltonismo Desligado!");
	}
	
	public String getCores() {
		return cores;
	}
	public void setCores(String cores) {
		this.cores = cores;
	}
	public String getAcesso() {
		return acesso;
	}
	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
	
	

	
	
}
