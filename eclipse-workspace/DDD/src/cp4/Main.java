package cp4;

public class Main {

	public static void main(String[] args) {
		CatalogoProduto produtos = new CatalogoProduto(3);
		
		Produto p1 = new Produto(1, "Banana", 1.05f);
		Produto p2 = new Produto(2, "Camisa", 15.7f);
		Produto p3 = new Produto(3, "Monitor", 954.5f);
		
		produtos.cadastraProduto(p1);
		produtos.cadastraProduto(p2);
		produtos.cadastraProduto(p3);
		
		produtos.imprimeCatalogo();
		
		ItemComanda i1 = new ItemComanda(p1, 6);
		ItemComanda i2 = new ItemComanda(p2, 1);
	}
}
