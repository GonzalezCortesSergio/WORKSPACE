package ejemploSet;

import java.util.Objects;

public class Persona {

	//Atributos
	
	private String nombre;
	private int edad;
	private String dni;
	
	//Constructor
	
	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	//toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni, edad, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
