package cp4;

public class ItemComanda {
	private Produto produto;
	private int qtd;
	
	public ItemComanda(Produto produto, int qtd) {
		super();
		this.produto = produto;
		this.qtd = qtd;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public float calculaPreco(Produto produto, int qtd) {
		return (produto.getPreco() * this.getQtd());
	}
	
	public String toStringItem(ItemComanda item) {
		return "[Produto: " + item.produto.toString() + "quantidade: " + item.getQtd() + " ]";
	}

	public void imprimeItemComanda(ItemComanda item) {
		System.out.println(item.toStringItem(item));
	}
}
