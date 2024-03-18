package ejercicio06_4;

public class Electronica extends Producto{

	
	//Constructor
	
	public Electronica(double precioUnitario, String nombre) {
		super(precioUnitario, nombre);
		// TODO Auto-generated constructor stub
	}

	
	//Métodos
	@Override
	public double calcularPVP(double porcentajeEl, double porcentajeAl) {
		// TODO Auto-generated method stub
		return getPrecioUnitario() + (getPrecioUnitario() * porcentajeEl / 100);;
	}
	
	

	
	
}
