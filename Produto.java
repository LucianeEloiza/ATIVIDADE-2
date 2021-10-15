package QUEST�O4;

public class Produto {
	private String nome;
	private double pre�o;
	private int quantidadeEstoque;
	
	public Produto(String nome, double pre�o, int quantidadeEstoque) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidadeEstoque = quantidadeEstoque;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
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
