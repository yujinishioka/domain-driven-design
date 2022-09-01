package cp4;

public class Produto {
	private int cod;
	private String desc;
	private float preco;
	
	public Produto(int cod, String desc, float preco) {
		this.cod = cod;
		this.desc = desc;
		this.preco = preco;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "[codigo: " + this.getCod() + "; Descricao: " + this.getDesc() + "; Preco: " + this.getPreco() + " ]";
	}
	
	public void imprimeProduto(Produto p) {
		System.out.println(p.toString());
	}
}
