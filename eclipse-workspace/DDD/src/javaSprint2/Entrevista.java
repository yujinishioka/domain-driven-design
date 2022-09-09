package javaSprint2;

public class Entrevista {
	
	private String diaEntrevista;
	private String horario;
	
	public Entrevista(String diaEntrevista, String horario) {
		super();
		this.setDiaEntrevista(diaEntrevista);
		this.setHorario(horario);
	}
	
	public void envioEntrevista() {
		//método que manda para o candidato a entrevista marcada
	}
	
	public String getDiaEntrevista() {
		return diaEntrevista;
	}
	public void setDiaEntrevista(String diaEntrevista) {
		this.diaEntrevista = diaEntrevista;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
