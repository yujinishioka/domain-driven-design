package br.com.scores.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.scores.model.dao.GerenciadorScoresArquivo;
import br.com.scores.model.vo.Score;

public class FrontScores {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		ArrayList<Score> scores = new ArrayList<>();
		
		GerenciadorScoresArquivo gsa = new GerenciadorScoresArquivo(scores);
		
		while(i != 3) {
			
			System.out.println("--------------------------");
			System.out.println("# MENU PRINCIPAL");
			System.out.println("(1) Adicionar Score");
			System.out.println("(2) Listar Scores");
			System.out.println("(3) Sair");
			System.out.println("# Escolha uma opção: ");
			System.out.println("--------------------------");
			
			i = input.nextInt();
			
			if (i == 1) {
				System.out.println("Jogador: ");
				String jogador = input.next();
				
				System.out.println("Pontos: ");
				int pontos = input.nextInt();
				
				Score s = new Score(jogador, pontos);
				
				gsa.adicionar(s);
				System.out.println("Score Adicionado!");
				
				new GerenciadorScoresArquivo(scores).gravar(s);
				
			} else if(i == 2) {
				gsa.consultar(scores);
				
				new GerenciadorScoresArquivo(scores).ler();
				
			} else if(i == 3) {
				System.out.println("Sair selecionado.");
				
			} else {
				System.out.println("Opção inválida");
			}
		}
		
		input.close();
	}
}