package ejercicio;

public class Electronica extends Producto{

	public Electronica(double precioUnitario, String nombre) {
		super(precioUnitario, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPVP(double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		// TODO Auto-generated method stub
		return getPrecioUnitario() + (getPrecioUnitario() * impuesto / 100);
	}
	
	

}
