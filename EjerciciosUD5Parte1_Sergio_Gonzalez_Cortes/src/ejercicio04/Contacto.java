package ejercicio04;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
