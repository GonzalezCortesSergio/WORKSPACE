package ejercicio02;

public class Socio {

	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int codSocio;
	
	
	public static int contCodSocio = 1; //Atributo estático que permitirá que se introduzca el id solo

	
	//Constructor
	
	public Socio(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.codSocio = contCodSocio++;
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


	public int getCodSocio() {
		return codSocio;
	}


	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}


	//toString
	
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", codSocio=" + codSocio + "]";
	}
	
	
}
