package cp4;

public class CatalogoProduto {
	private Produto[] produtos;
	private int i = 0;
	
	public CatalogoProduto(int qtd) {
		produtos = new Produto[qtd];
	}
	
	public void cadastraProduto(Produto p) {
		if (i < produtos.length) {
			produtos[i] = p;
			i++;
			System.out.println("Produto inserido com sucesso...");
		} else {
			System.out.println("Lista cheia, produto nao inserido...");
		}
	}
	
	public void buscaProduto(Produto p) {
		for (int cont = 0; cont < produtos.length; cont++) {
			if (p == produtos[i]) {
				System.out.println("Busca de Produto.");
				System.out.println("Produto encontrado...");
				System.out.println(produtos[i].toString());
				break;
			}
			System.out.println("Produto nao encontrado...");
		}
	}
	
	public void imprimeCatalogo() {
		System.out.println("Lista de produtos:");
		System.out.println("********************");
		for(int i=0; i < produtos.length; i++) {
			if(produtos[i]!=null) {
				System.out.println(produtos[i].toString());
				System.out.println("********************");
			} else {
				System.out.println("Lista vazia.");
			}
		}
	}
}
