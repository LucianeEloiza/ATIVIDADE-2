package QUESTÃO4;

public class Produto {
	private String nome;
	private double preço;
	private int quantidadeEstoque;
	
	public Produto(String nome, double preço, int quantidadeEstoque) {
		this.nome = nome;
		this.preço = preço;
		this.quantidadeEstoque = quantidadeEstoque;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public int comprarProduto ( int produtoComprado ) {
		quantidadeEstoque -= produtoComprado;
		return quantidadeEstoque;
	}
}
