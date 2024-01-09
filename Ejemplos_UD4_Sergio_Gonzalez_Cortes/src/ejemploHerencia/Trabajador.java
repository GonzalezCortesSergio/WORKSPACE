package ejemploHerencia;

public class Trabajador {

	//Atributos
	
	private String nombre;
	private String puesto;
	private String dni;
	
	//Constructor
	
	public Trabajador(String nombre, String puesto, String dni) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.dni = dni;
	}
	
	public Trabajador (String dni) {
		
		this.dni = dni;
	}

	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
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
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", dni=" + dni + "]";
	}
	
	//Esto lo explicamos un día
	public double calcularPaga() {
		
		return 0.0;
	}
	
	//Esto sa ecsplicao otro día así que espabila o te comen xhaval
	
	public double calcularPagaV2() {
		
		double fijo = 1000;
		return fijo;
	}
}
