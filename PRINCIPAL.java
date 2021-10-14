package QUESTÃO1;

public class PRINCIPAL {
	public static void main(String[] args) {
	
		Paciente p1 = new Paciente(0, "Luciane", "05/04/2004", "feminino", null, "Dipirona", "tipo OB");
		
		System.out.println("Nome: " +p1.getNome());
		System.out.println("Data de nascimento: " +p1.getDatanascimento());
		System.out.println("sexo: " +p1.getSexo());
		System.out.println("Alergia: " +p1.getAlergia());
		System.out.println("tipo sanguineo: " +p1.getTiposanguineo());
		

		p1.setNome("lorivaldo Oliveira");
		p1.setDatanascimento("01/10/1956");
		p1.setSexo("Masculino");
		p1.setAlergia("Não possui");
		p1.setTiposanguineo("AB");
		
		System.out.println("Nome: " +p1.getNome());
		System.out.println("Data de nascimento: " +p1.getDatanascimento());
		System.out.println("sexo: " +p1.getSexo());
		System.out.println("Alergia: " +p1.getAlergia());
		System.out.println("tipo sanguineo: " +p1.getTiposanguineo());
		
		
		
		
		
	}

}
