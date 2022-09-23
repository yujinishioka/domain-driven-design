package br.com.yuji;

import br.com.yuji.model.vo.Ordenacao;
import br.com.yuji.model.bo.OrdenacaoBO;

public class MVC {

	public static void main(String[] args) {
		Ordenacao ordenacao = new OrdenacaoBO().bubbleSort(532135);
		System.out.println(ordenacao);
	}

}
