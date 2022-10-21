package br.com.scores.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.scores.interfaces.GerenciadorScores;
import br.com.scores.model.vo.Score;

public class GerenciadorScoresArquivo implements GerenciadorScores {
	
	ArrayList<Score> scores = new ArrayList<Score>();

	/**
	 * @param scores
	 */
	public GerenciadorScoresArquivo(ArrayList<Score> scores) {
		this.scores = scores;
	}

	public void gravar(Score score) throws FileNotFoundException {
		try(PrintWriter pw = new PrintWriter("Scores.txt")) {
			pw.print(scores);
			pw.flush();
			pw.close();
			System.out.println("Arquivo criado!");
			
		} catch(Exception e) {
			System.out.println("Não foi possível criar o arquivo");
		}
		
	}
	
	public void ler() throws IOException {
		try (FileReader pw = new FileReader("Scores.txt")) {
			pw.read();
			
		} catch(Exception e) {
			System.out.println("Não possível ler o arquivo");
		}
	}
	
	@Override
	public void adicionar(Score s) {
		scores.add(s);
	}
	
	@Override
	public void consultar(List<Score> scores) {
		System.out.println("# Lista de Sores: ");
		for (Score score : scores) {
			System.out.println(score.toString());
		}
	}
}