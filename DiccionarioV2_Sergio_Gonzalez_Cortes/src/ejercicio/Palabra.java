package ejercicio;

public class Palabra implements Comparable<Palabra>{

	
	//Atributos
	
	private int id;
	private String nombre;
	
	public static int contId = 1;

	
	//Constructor
	
	public Palabra(String nombre) {
		super();
		this.id = contId++;
		this.nombre = nombre;
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


	//toString
	
	@Override
	public String toString() {
		return "Palabra [ID=" + id + ", Nombre=" + nombre + "]";
	}


	@Override
	public int compareTo(Palabra p) {
		// TODO Auto-generated method stub
		return -this.getNombre().compareToIgnoreCase(p.getNombre());
	}
	
	
	
	
}
