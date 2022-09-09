package javaSprint2;

public class SistemaVagas {
	
	private String empresa;
	private String setores;
	private String nivelCargo;
	private String vaga;
	private String candidaturas;
	
	
	public SistemaVagas(String empresa, String setores, String nivelCargo, String vaga, String candidaturas) {
		super();
		this.setEmpresa(empresa);
		this.setSetores(setores);
		this.setNivelCargo(nivelCargo);
		this.setVaga(vaga);
		this.setCandidaturas(candidaturas);
	}
	
	public void cadastroVagas() {
		//método que as empresas podem cadastrar suas vagas
	}
	
	public void confCandidaturas() {
		//método que confirma a candidatura do candidato
	}
	
	public void editarVaga () {
		//método que pode editar a vaga descrita
	}
	
	public void excluirVaga() {
		//método que exclui a vaga da plataforma
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getSetores() {
		return setores;
	}
	public void setSetores(String setores) {
		this.setores = setores;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	public String getCandidaturas() {
		return candidaturas;
	}
	public void setCandidaturas(String candidaturas) {
		this.candidaturas = candidaturas;
	}
	
	
}
