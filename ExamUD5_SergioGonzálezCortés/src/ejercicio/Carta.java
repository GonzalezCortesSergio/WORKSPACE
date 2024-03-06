package ejercicio;

public class Carta implements Comparable<Carta>{

	
	//Atributos
	
	private String nombre;
	private String palo;
	private int numCarta;
	
	//Constructor
	
	public Carta(String nombre, String palo, int numCarta) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.numCarta = numCarta;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumCarta() {
		return numCarta;
	}

	public void setNumCarta(int numCarta) {
		this.numCarta = numCarta;
	}


	//toString
	
	@Override
	public String toString() {
		return "Carta [Nombre= " + nombre + ", Palo=" + palo + ", Número =" + numCarta + ", Puntuación = " + obtenerPuntuacion() + "]";
	}
	
	//Métodos
	
	public int obtenerPuntuacion () {
		
		int puntuacion = 0;
		
		int numCarta = getNumCarta();
		
		switch (numCarta) {
		
			case 1:
				
				return puntuacion = 11;
				
				
			case 3:
				
				return puntuacion = 10;
				
				
			case 10:
				
				return puntuacion = 2;
				
				
			case 11:
				
				return puntuacion = 3;
				
			case 12:
				
				return puntuacion = 4;
				
			default:
				
				return puntuacion;
		}
		
		
	}


	@Override
	public int compareTo(Carta c) {
		// TODO Auto-generated method stub
		return this.getPalo().compareToIgnoreCase(c.getPalo());
	}
	
	
	
}
