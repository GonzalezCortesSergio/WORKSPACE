package ejercicio06;

public class Trabajador implements Comparable<Trabajador>{

	//Atributos
	
	private String nombre;
	private String dni;
	private double horasTrabajadas;
	
	
	//Constructor
	
	public Trabajador(String nombre, String dni, double horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		
	}


	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	//toString
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas + "]";
	}
	
	
	//Métodos
	
	public double calcularSueldo (double sueldoHoras) {
		
		return sueldoHoras * horasTrabajadas;
	}


	@Override
	public int compareTo(Trabajador t) {
		// TODO Auto-generated method stub
		
		if (this.getNombre().equalsIgnoreCase(t.getNombre())) {
			
			return Double.compare(this.getHorasTrabajadas(), t.getHorasTrabajadas());
		}
		
		return this.getNombre().compareToIgnoreCase(t.getNombre());
	}
	
	
}
