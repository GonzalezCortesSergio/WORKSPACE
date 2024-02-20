package ejercicio05Polimorfismo;

public class Gerente extends Empleado{

	
	private double impuestos;
	
	public Gerente(String nombre, String apellidos, double sueldoBase, double impuestos) {
		super(nombre, apellidos, sueldoBase);
		// TODO Auto-generated constructor stub
		
		this.impuestos = impuestos;
	}

	
	
	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString() + " Gerente [impuestos=" + impuestos + "]";
	}

	
	//Métodos
	
	@Override
	public double calcularSueldo() {
		
		return super.calcularSueldo() - (super.calcularSueldo() * impuestos / 100);
	}
	
	
	
	
}
