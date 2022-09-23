package sprint3;

public class ListaCandidato {
	private Candidato[] candidatos;
	
	public ListaCandidato(Candidato[] candidatos, int id) {
		this.candidatos = candidatos;
	}

	public Candidato[] getCandidato() {
		return candidatos;
	}

	public void setCandidato(Candidato[] candidatos) {
		this.candidatos = candidatos;
	}
	
	public void imprimeListaCandidatos() {
		for (int cont = 0; cont < candidatos.length; cont++) {
			System.out.println(candidatos[cont]);
		}
	}
}
