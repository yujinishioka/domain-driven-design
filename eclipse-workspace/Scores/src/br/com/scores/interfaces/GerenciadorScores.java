package br.com.scores.interfaces;

import java.util.ArrayList;
import java.util.List;

import br.com.scores.model.vo.Score;

public interface GerenciadorScores {
	
	public default void adicionar() {}
	
	public default List<Score> consultar(Score s) {
		List<Score> list = new ArrayList<Score>();
		list.add(s);
		return list;
	}
}
