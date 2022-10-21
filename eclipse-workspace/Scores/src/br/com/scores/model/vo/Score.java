package br.com.scores.model.vo;

public class Score {
	
	private String jogador;
	private int pontos;
	
	public Score(String jogador, int pontos) {
		this.jogador = jogador;
		this.pontos = pontos;
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	@Override
	public String toString() {
		return 	"- "
			.concat(String.valueOf(this.getPontos()))
			.concat(" ")
			.concat(String.valueOf(this.getJogador()));
	}
}