package br.com.yuji.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import br.com.yuji.model.vo.Passos;

/**
 * 
 * @author Vinicius Yuji Nishioka
 * @RM 92895
 *
 * @see Classe que executa as operações de IO (entrada e saída) do sistema
 * com relação aos dados resultantes do passo a passo.
 *
 */

public class PassosDAO {

	/**
	 * 
	 * Método que recebe todos os passos (lista) e salva em um arquivo
	 * @param passos
	 * @throws FileNotFoundException
	 * 
	 */
	
	public void salvarPassos(List<Passos> passos) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("passos.txt");
		for (Passos p : passos) {
			pw.print(p);
		}
		
		pw.flush();
		pw.close();
	}
}
