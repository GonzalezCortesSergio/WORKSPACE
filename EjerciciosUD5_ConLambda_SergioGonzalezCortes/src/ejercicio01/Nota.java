package ejercicio01;

public class Nota {

	//Atributos
	
	private String nombre;
	private int idNota;
	private String contenido;
	
	public static int contIdNota = 1;

	
	//Constructor
	
	public Nota(String nombre, String contenido) {
		super();
		this.nombre = nombre;
		this.idNota = contIdNota++;
		this.contenido = contenido;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getIdNota() {
		return idNota;
	}


	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	//toString
	
	@Override
	public String toString() {
		return "Nota [Nombre: " + nombre + ", ID: " + idNota + "]";
	}
	
	
	
	
}
