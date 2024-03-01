package ejercicio;

public class Palabra {

	
	//Atributos
	
	private int id;
	private String nombre;
	private String significado;
	
	public static int contId = 1;
	
	//Constructor

	public Palabra(String nombre, String significado) {
		super();
		this.id = contId++;
		this.nombre = nombre;
		this.significado = significado;
	}

	
	//Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	
	//toString

	@Override
	public String toString() {
		return "Palabra [ID= " + id + ", Nombre= " + nombre + "]";
	}
	
	
	
	
	
}
