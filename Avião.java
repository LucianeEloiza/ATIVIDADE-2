package QUESTÃO3;

public class Avião {
	private int velocidade;
	private int altitude;
	
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	public int reduzirAltitude ( int reduzirAltitude) {
		altitude -= reduzirAltitude;
		return altitude;
		
	}
	public int reduzirVelocidade ( int reduzirVelocidade) {
		velocidade -= reduzirVelocidade;
		return altitude;
	
	}
}
