package ejemploHerencia;

public class Empleado extends Trabajador{

	//Atributos
	
	private double sueldo;
	private double impuestos;
	
	//Constructor
	
	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuestos) {
		super(nombre, puesto, dni); //Esto es una llamada al constructor de la clase madre (Trabajador)
		this.sueldo = sueldo;
		this.impuestos = impuestos;
		
		
	}

	
	public Empleado (String dni, double sueldo, double impuestos) {
		
		super (dni);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}
	
	//Getters and Setters
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString()
				+"Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}
	
	public double calcularPaga() {
		double cien = 100.0;
		return sueldo - sueldo*impuestos / cien;
	}
}
