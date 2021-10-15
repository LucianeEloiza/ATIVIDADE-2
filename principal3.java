package QUESTÃO3;

public class principal3 {

	public static void main(String[] args) {
		
		Avião A1 = new Avião ();
		
		A1.setAltitude(10);
		A1.setVelocidade(900);
		
		System.out.println ("A altitude atual do Avião é de " +A1.getAltitude() + " KM" + " e a velocidade atual é de " +A1.getVelocidade()+ " KM/h");
		
		A1.reduzirAltitude(1);
		A1.reduzirVelocidade(100);
		
		System.out.println ("A altitude atual do Avião após a redução é de " +A1.getAltitude()+ " KM"+" e a sua velocidade atual após a redução é de " +A1.getVelocidade()+ "KM/h");
	}

}
