package QUEST�O4;

public class principal4 {

	public static void main(String[] args) {
		
		Produto arroz = new Produto ("Arroz", 5.00, 10);
		
		System.out.println ("nome do produto: " +arroz.getNome()+ " pre�o: "+arroz.getPre�o()+ " R$");
		arroz.comprarProduto(1);
		
		System.out.println ("quantidade de produtos no estoque � de " +arroz.getQuantidadeEstoque());
		
		
        arroz.comprarProduto(1);
		System.out.println ("quantidade de produtos no estoque � de " +arroz.getQuantidadeEstoque());
		
		
		
		arroz.comprarProduto(9);
		System.out.println ("quantidade de produtos no estoque � de " +arroz.getQuantidadeEstoque());
	}

}
