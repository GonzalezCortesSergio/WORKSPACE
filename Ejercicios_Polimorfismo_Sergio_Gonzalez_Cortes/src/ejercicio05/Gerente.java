package ejercicio05;

public class Gerente extends Empleado{

	//Atributos
	
	private double impuestos;

	
	//Constructor
	
	public Gerente(String nombre, String apellidos, double sueldoBase, int nEmpleado, double impuestos) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.impuestos = impuestos;
	}


	
	//Getters and Setters
	
	public double getImpuestos() {
		return impuestos;
	}


	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Gerente [impuestos=" + impuestos + "]";
	}
	
	//Métodos
	
	@Override
	public double calcularSueldo() {
		
		return super.getSueldoBase() - (super.getSueldoBase() * impuestos / 100);
	}
}
