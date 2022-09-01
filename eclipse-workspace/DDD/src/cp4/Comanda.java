package cp4;

public class Comanda {
	private ItemComanda[] itemComanda;
	private int i, total = 0;

	public Comanda(ItemComanda[] itemComanda) {
		super();
		this.itemComanda = itemComanda;
	}
	
	public void criaComanda() {
		itemComanda = new ItemComanda[20];
	}
	
	public void registraItem(ItemComanda item) {
		itemComanda[i] = item;
		i++;
		System.out.println("Item adicionado a comanda...");
	}
	
	public float calculaTotal() {
		for (int cont = 0; cont < itemComanda.length; cont++) {
			total += itemComanda[cont].calculaPreco(itemComanda[cont].getProduto(), itemComanda[cont].getQtd());
		}
		return total;
	}
	
	public void imprimeComanda() {
		for (int cont = 0; cont < itemComanda.length; cont++) {
			System.out.println(itemComanda[cont]);
		}
	}
}
