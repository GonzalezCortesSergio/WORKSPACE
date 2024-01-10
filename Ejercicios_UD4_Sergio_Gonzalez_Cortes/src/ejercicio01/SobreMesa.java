package ejercicio01;

public class SobreMesa extends Ordenador{

	//Atributos
	
	private double precioMontaje;
	
	//Constructor
	
	public SobreMesa(double capDiscDuro, double frecProcesador, double precioBase, String marca, double precioMontaje) {
		super(capDiscDuro, frecProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	

	//Getters and Setters
	
	public double getPrecioMontaje() {
		return precioMontaje;
	}


	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}



	//toString
	
	@Override
	public String toString() {
		return super.toString() + " SobreMesa [precioMontaje=" + precioMontaje + "]";
	}
	
	
	//Métodos
	
	public double calcularPrecioVenta (double porcentajeGanancia) {
		
		return super.calcularPrecioVenta(porcentajeGanancia) + precioMontaje;
	}
	
}
