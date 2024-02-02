package ejercicio01;

public class Nota {

	
	//Atributos
	
	private String nombre;
	private String contenido;
	
	//Constructor
	
	public Nota(String nombre, String contenido) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public String getContenido () {
		
		return contenido;
	}
	
	public void setContenido (String contenido) {
		
		this.contenido = contenido;
	}


	//toString
	
	@Override
	public String toString() {
		return "Nota [nombre=" + nombre +"]";
	}
	
	
	
}
