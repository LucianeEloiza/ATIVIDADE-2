package QUESTÃO2;

public class principal2 {

	public static void main(String[] args) {
		post Post = new post ("Na vida o plantio é opcional, porém, a colheita é obrigatória. "
				+ "Por isso tome cuidado com o que você planta porque o que você plantar, "
				+ "você vai colher.", "https://driveandlisten.herokuapp.com/");
		
		
	Post.curtir(3);
	System.out.println ("o número de curtidas são " +Post.getNumerocurtidas());
	

	Post.compartilhar(2);
	System.out.println ("o número de compartilhamento são " +Post.getNumerocompartilhamentos());
	
		
		
		

	}

	

	}


	

