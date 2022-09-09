package javaSprint2;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private String etapas;
	private int vagas;
	private boolean contratacao;
	
	
	//construtor
	public Empresa() {
	}
	
	public Empresa(String nome, String cnpj, String etapas, int vagas) {
	this.setNome(nome);
	this.setCnpj(cnpj);
	this.setEtapas(etapas);
	this.setVagas(vagas);
	}
	
	public void validaCnpj(String cnpj) {
		//método que valida o Cnpj
	}
	
	public void contrato(boolean contratacao) {
		//método que confirma o contrato se ele é verdadeiro ou falso
	}
	
	public void vagasAberta(int vagas) {
		//método que consulta as vagas abertas
	}
	
	public void selecaoEtapas () {
		//método que cadastra as etapas
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEtapas() {
		return etapas;
	}

	public void setEtapas(String etapas) {
		this.etapas = etapas;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
}

	