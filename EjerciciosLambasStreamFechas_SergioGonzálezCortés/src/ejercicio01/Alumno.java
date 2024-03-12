package ejercicio01;

public class Alumno {

	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private String nombreCurso;
	private double notaMedia;
	private int edad;
	
	
	//Constructor
	
	public Alumno(String nombre, String apellidos, String nombreCurso, double notaMedia, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCurso = nombreCurso;
		this.notaMedia = notaMedia;
		this.edad = edad;
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


	public String getNombreCurso() {
		return nombreCurso;
	}


	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	public double getNotaMedia() {
		return notaMedia;
	}


	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	//toString
	
	@Override
	public String toString() {
		return "Alumno [Nombre del alumno: " + nombre + ", Apellidos: " + apellidos + ", Curso: " + nombreCurso + ", Nota media del alumno: "
				+ notaMedia + ", Edad del alumno: " + edad + "]";
	}
	
	
	
	
	
}
