package ejercicio05;

public class Alumno {

	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private int id;
	
	private static int contId = 1;

	public Alumno(String nombre, String apellidos, int id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
	}

	
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + "]";
	}
	
	
	
	
}
