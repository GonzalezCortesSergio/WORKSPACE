package ejercicio05Polimorfismo;

public class Vendedor extends Empleado{

	//Atributos
	
	private double cantVentas;
	private double incentivo;
	
	
	//Constructor
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, double cantVentas, double incentivo) {
		super(nombre, apellidos, sueldoBase);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	
	//Getters and Setters

	public double getCantVentas() {
		return cantVentas;
	}


	public void setCantVentas(double cantVentas) {
		this.cantVentas = cantVentas;
	}


	public double getIncentivo() {
		return incentivo;
	}


	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}
	
	
	//Métodos
	
	@Override
	public double calcularSueldo() {
		
		return super.calcularSueldo() + (cantVentas * incentivo);
		
	}
	
	
}
