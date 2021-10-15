package QUESTÃO2;

public class post {

	private String texto;
	private String link;
	private int numerocurtidas;
	private int numerocompartilhamentos;
	
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getNumerocurtidas() {
		return numerocurtidas;
	}

	public void setNumerocurtidas(int numerocurtidas) {
		this.numerocurtidas = numerocurtidas;
	}

	public int getNumerocompartilhamentos() {
		return numerocompartilhamentos;
	}

	public void setNumerocompartilhamentos(int numerocompartilhamentos) {
		this.numerocompartilhamentos = numerocompartilhamentos;
	}

	public post(String texto, String link) {
		this.texto = texto;
		this.link = link;
	}
	
	public int curtir(int curtidas ) {
		numerocurtidas =  1 +  curtidas ;
		return numerocurtidas;
		
		
		
	}
	public int compartilhar(int compartilhamentos  ) {
		 numerocompartilhamentos = 1 + compartilhamentos;
		 return numerocompartilhamentos;
		
	}
	
}
