package ejercicio05;

public class Vendedor extends Empleado{

	//Atributos
	
	private int cantidadVentas;
	private double incentivo;
	
	//Constructor
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int nEmpleado, int cantidadVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	
	//Getters and Setters
	
	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
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
		
		return super.getSueldoBase() + ((super.getSueldoBase() * incentivo /100) * cantidadVentas);
	}
	
	public void felicitarVenta () {
		
		System.out.println("Felicidades; has cumplido con el objetivo de ventas");
	}
}
