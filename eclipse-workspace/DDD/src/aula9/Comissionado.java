package aula9;

public class Comissionado extends Empregado {
	
	private double totalVendas, txComissao;

	public Comissionado(double totalVendas, double txComissao) {
		super();
		this.totalVendas = totalVendas;
		this.txComissao = txComissao;
	}

	@Override
	public double vencimento() {
		return this.getTotalVendas() * (this.getTxComissao()/100);
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getTxComissao() {
		return txComissao;
	}

	public void setTxComissao(double txComissao) {
		this.txComissao = txComissao;
	}
}
