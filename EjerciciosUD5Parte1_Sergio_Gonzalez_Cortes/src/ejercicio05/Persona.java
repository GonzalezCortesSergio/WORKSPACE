package ejercicio05;

public class Persona implements Comparable<Persona>{

	
	//Atributos
	
	private String nombre;
	private int edad;
	
	
	//Constructor
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}



	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		
		return this.getNombre().toLowerCase().compareTo(p.getNombre().toLowerCase());
		
	}
	
	
	
}
