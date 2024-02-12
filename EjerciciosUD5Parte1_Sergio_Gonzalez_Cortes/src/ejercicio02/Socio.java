package ejercicio02;

public class Socio {

	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	private boolean veterano;
	

	
	//Constructor
	
	public Socio(String nombre, String apellidos, String dni, boolean veterano) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.veterano = veterano;
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


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public boolean isVeterano() {
		
		return veterano;
	}
	
	public void setVeterano (boolean veterano) {
		
		this.veterano = veterano;
	}




	//toString
	
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", veterano=" + veterano + "]";
	}
	
	
}
