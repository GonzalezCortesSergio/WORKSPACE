package program;

public enum TipoPiedra {

	CALIZA ("Blanco", 1200),
	MARMOL ("Rojo", 1423.55),
	PIZARRA ("Negro", 1325),
	CUARZITA ("Verde", 1466.22);
	
	private final String color;
	private final double peso;
	
	private TipoPiedra (String color, double peso) {
		
		this.color = color;
		this.peso = peso;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public double getPeso() {
		
		return peso;
	}
}
