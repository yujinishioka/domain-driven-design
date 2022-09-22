package br.com.yuji.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import br.com.yuji.model.vo.Ordenacao;

public class OrdenacaoDAO {
	public void salvar(Ordenacao ordenacao) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("ordenacao.txt");
		pw.print(ordenacao);
		
		pw.flush();
		pw.close();
	}
}
