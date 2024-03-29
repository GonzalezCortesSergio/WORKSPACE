package ejercicio03;

public class Cancion {

	
	//Atributos
	
	private String nombre;
	private String autor;
	private double duracion;
	private String genero;
	
	
	//Constructor
	
	public Cancion(String nombre, String autor, double duracion, String genero) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
		this.genero = genero;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	//toString
	
	@Override
	public String toString() {
		return "Cancion [Nombre de la canción: " + nombre + ", Autor: " + autor + ", Duración: " + duracion + ", Género musical: " + genero + "]";
	}
	
	
	
}
