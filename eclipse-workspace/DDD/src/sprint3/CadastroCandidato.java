package sprint3;

public class CadastroCandidato {
	private Candidato[] candidatos;
	private int i = 0;
	
	public CadastroCandidato(int qtd) {
		candidatos = new Candidato[qtd];
	}
	
	public void cadastrarCandidato(Candidato c) {
		if(i < candidatos.length) {
			candidatos[i] = c;
			i++;
			System.out.println("Candidato adicionado com sucesso.");
		} else {
			System.out.println("Lista cheia, candidato não cadastrado.");
		}
	}
}
