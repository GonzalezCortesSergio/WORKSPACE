package ejercicio01;

public class Publicacion {

	//Atributos
	
	private String nombre;
	private int numPaginas;
	private boolean prestado;
	private int anioPubli;
	
	//Constructor
	
	public Publicacion(String nombre, int numPaginas, boolean prestado, int anioPubli) {
		super();
		this.nombre = nombre;
		this.numPaginas = numPaginas;
		this.prestado = prestado;
		this.anioPubli = anioPubli;
		
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public int getAnioPubli () {
		
		return anioPubli;
	}
	
	public void setAnioPubli (int anioPubli) {
		
		this.anioPubli = anioPubli;
	}


	//toString
	
	@Override
	public String toString() {
		return "Publicacion [nombre=" + nombre + ", numPaginas=" + numPaginas + ", prestado=" + prestado + ", anioPubli=" + anioPubli + "]";
	}
	
	
	
	
}
