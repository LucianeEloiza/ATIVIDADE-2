package QUEST�O5;


public class principal5 {

	public static void main(String[] args) {
		
		Contato C1 = new Contato ();
		C1.setNome("Marcos");
		
		C1.enviarMensagem(1);
		
		
		System.out.println ("Quantidade de mensagem n�o lida: " + C1.getMensagem()+ " o contato: "+C1.getNome());
		
		C1.receberMensagem(5);
		
		System.out.println ("Quantidade de mensagem n�o lida: " +C1.getMensagem()+ " o contato: "+C1.getNome());
		
		System.out.println ("Quantidade de mensagem n�o lida do contato: " +C1.receberMensagem(5));
		
		
	}

}
