
public class Main {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto(3, 7.5, "Coca-Cola", "Bebida gaseficada");
		Produto produto2 = new Produto(10, 3.0, "Biscoito Oreo", "Biscoito Recheado");
		Produto produto3 = new Produto(1, 7.0, "Arroz", "Grãos");
		Produto produto4 = new Produto(1, 6.5, "Feijão", "Grãos");
		Produto produto5 = new Produto(2, 10.0, "Maionese", "Molho");
		Produto produto6 = new Produto(2, 10.0, "Ketchup", "Molho");
		Produto produto7 = new Produto(5, 30.0, "Leite", "Bebida Lactea");
		Produto produto8 = new Produto(1, 4.0, "Sabão em pó", "Lavanda");
		Produto produto9 = new Produto(1, 3500.0, "Notebook", "Computador portátil");
		Produto produto10 = new Produto(7, 20.0, "Pasta de dente", "Pasta de higiene bucal");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(10);
		
		carrinho.Inserir(produto1);
		carrinho.Inserir(produto2);
		carrinho.Inserir(produto3);
		carrinho.Inserir(produto4);
		carrinho.Inserir(produto5);
		carrinho.Inserir(produto6);
		carrinho.Inserir(produto7);
		carrinho.Inserir(produto8);
		carrinho.Inserir(produto9);
		carrinho.Inserir(produto10);
		
		carrinho.Imprime();
		
		
	}

}
