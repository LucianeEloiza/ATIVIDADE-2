package QUEST�O3;

public class principal3 {

	public static void main(String[] args) {
		
		Avi�o A1 = new Avi�o ();
		
		A1.setAltitude(10);
		A1.setVelocidade(900);
		
		System.out.println ("A altitude atual do Avi�o � de " +A1.getAltitude() + " KM" + " e a velocidade atual � de " +A1.getVelocidade()+ " KM/h");
		
		A1.reduzirAltitude(1);
		A1.reduzirVelocidade(100);
		
		System.out.println ("A altitude atual do Avi�o ap�s a redu��o � de " +A1.getAltitude()+ " KM"+" e a sua velocidade atual ap�s a redu��o � de " +A1.getVelocidade()+ "KM/h");
	}

}
