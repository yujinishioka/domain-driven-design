package br.com.yuji.model.bo;

import br.com.yuji.model.vo.Ordenacao;
import br.com.yuji.model.dao.OrdenacaoDAO;
import br.com.yuji.model.vo.Passos;

/**
 * 
 * @author Vinicius Yuji Nishioka
 * @see Classe que contem o método de ordenação Bubble Sort
 *
 */

public class OrdenacaoBO {
	
	/**
	 * Método responsável em realizar a ordenação através do algoritmo Bubble Sort
	 * @param int numero
	 * @return Ordenacao
	 */
	public Ordenacao bubbleSort(int numero) {		
		try {
			/** Transformar o número em String para realizar as trocas considerando
			 * caracter por caracter
			 * Gerando um Array de char pra facilitar a manipulação dos dados
			 */
			char[] digitos = String.valueOf(numero).toCharArray();
			
			// variável auxiliar para armazenar o número antes de realizar a troca
			char aux;
			
			char[] antes;
			
			int qtdeTrocas = 0;
			
			// Vetor(lista) que irá conter todo o processo de ordenação
			List<Passos> passos = new ArrayList<Passos>();
			
			/**
			 * Variável de controle que determina se houve troca. Será utilizada
			 * para interromper o processo quando não houver números a serem ordenados.
			 */
			boolean continua = true;

			for(int i = 0; i < digitos.length; i++) {
				if(!continua) {
					break;
				}
				
				passos.add(new Passos(null, null, "Inicio da verificacao do numero".
						concat(String.valueOf(i)).concat("\n----------------------\n")));
				
				continua = false;
				
				for(int j = 0; j < digitos.length - 1; j++) {
					if(digitos[j] > digitos[j+1]) {
						antes = new String(digitos).toCharArray();
						aux = digitos[j];
						digitos[j] = digitos[j+1];
						digitos[j+1] = aux;
						
						qtdeTrocas++;
						
						passos.add(new Passos(new String(antes),new String(digitos), "Trocou-se o digito"
								.concat(String.valueOf(digitos[j+1]))
								.concat(" pelo ".concat(String.valueOf(digitos[i])))));
						
						continua = true;
					} else {
						passos.add(new Passos(new String(digitos), new String(digitos), "Não houve troca."
								.concat(String.valueOf(digitos[j+1]))
								.concat(" já é menor ou igual que ")
								.concat(String.valueOf(digitos[j]))));
					}
				}
			}
			
			Ordenacao ordenacao = new Ordenacao(numero, new String(digitos), qtdeTrocas);
			new OrdenacaoDAO().salvar(ordenacao);
			new PassosDAO().salvarPassos(passos);
			
			return ordenacao;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
