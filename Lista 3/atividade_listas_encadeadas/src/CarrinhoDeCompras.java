
public class CarrinhoDeCompras {
	
	int primeiro = 0;
	int ultimo = 0;
	private Produto[] Lista_produtos;

	public CarrinhoDeCompras(int max) {
		Lista_produtos = new Produto[max];
	}
	
	public boolean vazia() {
		return (this.primeiro == this.ultimo);
	}
	
	public void Inserir(Produto a1) {
		if (!vazia() && this.ultimo >= this.Lista_produtos.length) {
			System.out.println("A lsita está cheia");
		}
		else {
			this.Lista_produtos[this.ultimo] = a1;
			this.ultimo = this.ultimo + 1;
			System.out.println("Produto inserido com sucesso");
		}
	}
	
	public void Imprime() {
		System.out.println();
		System.out.println("Produtos:");
		for (Produto p: Lista_produtos) {
			System.out.println(p);
		}
	}
	
	


}
