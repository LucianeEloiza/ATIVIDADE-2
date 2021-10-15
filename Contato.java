package QUESTÃO5;

public class Contato {
	private String nome;
	private int mensagem ;
	
	
	
	public int getMensagem() {
		return mensagem;
	}
	public void setMensagem(int mensagem) {
		this.mensagem = mensagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int enviarMensagem (int enviarMensagem ) {
		mensagem += enviarMensagem;
		return enviarMensagem ;
	
	}
	public int receberMensagem (int mensagemrecebida ) {
		mensagem +=  mensagemrecebida;
		return  mensagemrecebida;
	}
		
	
}
