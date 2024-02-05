package ejercicio01;

public class Nota {

	
	//Atributos
	
	private String titulo;
	private String contenido;
	private int idNota;
	
	public static int contIdNota = 1;
	
	//Constructor
	
	public Nota(String titulo, String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
		this.idNota = contIdNota++;
	}

	
	//Getters and Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
	public String getContenido () {
		
		return contenido;
	}
	
	public void setContenido (String contenido) {
		
		this.contenido = contenido;
	}
	
	public int getIdNota () {
		
		return idNota;
	}
	



	//toString
	
	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", idNota=" + idNota +"]";
	}
	
	
	
	
	
}
