package ejercicio04;

public class Contacto {

	//Atributos
	
	private String nombre;
	private String apellidos;
	
	//Constructor
	
	public Contacto (String nombre, String apellidos) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	//Getters and Setters
	
	public String getNombre () {
		
		return nombre;
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getApellidos () {
		
		return apellidos;
	}
	
	public void setApellidos (String apellidos) {
		
		this.apellidos = apellidos;
	}
	
	
	//toString
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
