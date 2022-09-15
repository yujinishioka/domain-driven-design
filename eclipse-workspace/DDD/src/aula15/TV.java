package aula15;

public class TV {
	private int tamanho, canal, volume;
	private boolean ligada;
	
	public TV(int t) {
		tamanho = t;
		canal = 0;
		volume = 0;
		ligada = false;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	@Override
	public String toString() {
		return "TV [tamanho=" + tamanho + ", canal=" + canal + ", volume=" + volume + ", " + (this.isLigada() ? "Ligada" : "Desligada") + "]";
	}
}
