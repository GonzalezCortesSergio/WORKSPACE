package ejercicio03;

public class Alumno {

	//Atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String curso;
	private String codAlumno;
	private double nota;
	
	
	//Constructor
	
	public Alumno(String nombre, String apellidos, int edad, String curso, String codAlumno, double nota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.curso = curso;
		this.codAlumno = codAlumno;
		this.nota = nota;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos () {
		
		return apellidos;
	}
	
	public void setApellidos (String apellidos) {
		
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getCodAlumno() {
		return codAlumno;
	}


	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}
	
	public double getNota () {
		
		return nota;
	}
	
	public void setNota (double nota) {
		
		this.nota = nota;
	}



	//toString
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", curso=" + curso + ", codAlumno=" + codAlumno + ", nota=" + nota + "]";
	}
	
	
	
}
