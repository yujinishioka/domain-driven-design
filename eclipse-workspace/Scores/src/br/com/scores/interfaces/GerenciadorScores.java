package br.com.scores.interfaces;

import java.util.List;

import br.com.scores.model.vo.Score;

public interface GerenciadorScores {
	
	public void adicionar(Score s);
	public void consultar(List<Score> scores);
}