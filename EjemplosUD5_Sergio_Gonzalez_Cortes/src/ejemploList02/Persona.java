package ejemploList02;

public class Persona {

	
	//Atributos
	
	private String nombre;
	private int edad;
	private String dni;
	private int idPersona;
	
	public static int contIdPersona = 1;
	
	
	//Constructor
	public Persona (String nombre, int edad, String dni) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.idPersona = contIdPersona++;
	}
	
	//Getters and Setters
	
	public String getNombre () {
		
		return nombre;
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getEdad () {
		
		return edad;
	}
	
	public void setEdad (int edad) {
		
		this.edad = edad;
	}
	
	public String getDni () {
		
		return dni;
	}
	
	public void setDni (String dni) {
		
		this.dni = dni;
	}
	
	public double getIdPersona () {
		
		return idPersona;
	}
	
	//toString
	
	@Override
	public String toString () {
		
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", idPersona=" + idPersona + "]";
	}
}
