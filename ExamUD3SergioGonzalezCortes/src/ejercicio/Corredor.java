package ejercicio;

public class Corredor {

	
	//Atributos 
	
	private String nombre;
	private String apellidos;
	private int dorsal;
	private int categoria;
	private double tiempo;
	
	
	//Constructor
	
	public Corredor(String nombre, String apellidos, int dorsal, int categoria, double tiempo) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dorsal = dorsal;
		this.categoria = categoria;
		this.tiempo = tiempo;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public double getTiempo() {
		return tiempo;
	}


	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}



	
	//toString
	
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellidos=" + apellidos + ", dorsal=" + dorsal + ", categoria="
				+ categoria + ", tiempo=" + tiempo + "]";
	}
	
	
	
	
	
}
