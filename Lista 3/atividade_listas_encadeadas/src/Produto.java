import java.text.DecimalFormat;

public class Produto {
	
	private int qnt_adquirida;
	private double valor_total_produto;
	private String nome;
	private String descricao;
	
	public Produto(int qnt_adquirida, double valor_total_produto, String nome, String descricao) {
		super();
		this.qnt_adquirida = qnt_adquirida;
		this.valor_total_produto = valor_total_produto;
		this.nome = nome;
		this.descricao = descricao;
	}
	public int getQnt_adquirida() {
		return qnt_adquirida;
	}
	public void setQnt_adquirida(int qnt_adquirida) {
		this.qnt_adquirida = qnt_adquirida;
	}
	public double getValor_total_produto() {
		return valor_total_produto;
	}
	public void setValor_total_produto(double valor_total_produto) {
		this.valor_total_produto = valor_total_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return nome + ": Quantidade = " + qnt_adquirida + ", Valor final do produto = R$" + new DecimalFormat("#,##0.00").format(valor_total_produto) + ", Descrição = " + descricao + ".";
	}
	
	

}
