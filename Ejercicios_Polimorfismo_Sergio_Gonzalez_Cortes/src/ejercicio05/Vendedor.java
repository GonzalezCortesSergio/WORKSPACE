package ejercicio05;

public class Vendedor extends Empleado{

	//Atributos
	
	private double cantidadVentas;
	private double incentivo;
	
	//Constructor
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int nEmpleado, double cantidadVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	
	//Getters and Setters
	
	public double getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(double cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
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
		return super.toString() + " Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}
	
	@Override
	public double calcularSueldo() {
		
		return super.calcularSueldo() + ((cantidadVentas * incentivo /100) );
	}
	
	public void felicitarVenta (double objetivo) {
		if (cantidadVentas >= objetivo)
			System.out.println("Felicidades; has cumplido con el objetivo de ventas");
	}
}
