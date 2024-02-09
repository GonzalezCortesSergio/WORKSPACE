package programa;

public class Electronica extends Producto{

	public Electronica(String nombre, double precioBase) {
		super(nombre, precioBase);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calcularPVP(double porcentajeAl, double porcentajeEl) {
		// TODO Auto-generated method stub
		return getPrecioBase() + (getPrecioBase() * porcentajeEl / 100);
	}

}
