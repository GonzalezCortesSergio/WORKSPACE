package ejemploOrdenar;

public class Corredor implements Comparable <Corredor>{

	//Atributos
	
	private int dorsal;
	private double marca;
	private String nombre;
	
	
	//Constructor
	
	public Corredor (int dorsal, double marca, String nombre) {
		
		this.dorsal = dorsal;
		this.marca = marca;
		this.nombre = nombre;
	}
	
	//Getters and Setters
	
	public int getDorsal() {
		
		return dorsal;
	}
	
	public void setDorsal (int dorsal) {
		
		this.dorsal = dorsal;
	}
	
	public double getMarca () {
		
		return marca;
	}
	
	public void setMarca (double marca) {
		
		this.marca = marca;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Corredor [dorsal=" + dorsal + ", marca=" + marca + ", nombre=" + nombre + "]";
	}

	
	//Métodos
	
	@Override
	public int compareTo(Corredor c) {
		// TODO Auto-generated method stub
		
		if (this.dorsal < c.dorsal) {
			
			return -1;
		}
		
		else {
			
			if (this.dorsal > c.dorsal) {
				
				return 1;
			}
			
			return 0;
		}
		
	}
	
	
}
