package ejercicio04;

public class Electronica extends Producto{

	//Atributos
	
	private boolean garantia;
	private double precioGarantia;

	
	//Constructor
	public Electronica(String nombre, double precioUnitario, int id, boolean garantia, double precioGarantia) {
		super(nombre, precioUnitario, id);
		this.garantia = garantia;
		this.precioGarantia = precioGarantia;
	}


	//Getters and Setters
	
	public boolean getGarantia() {
		return garantia;
	}


	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}


	
	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Electronica [garantia=" + garantia + ", precioGarantia=" + precioGarantia +"]";
	}
	
	//Métodos
	
	@Override
	public double calcularPrecio(int diaActual, int mesActual, int anioActual, double porcentajeAl, double porcentajeEl) {
		
		if (garantia) {
			return super.getPrecioUnitario() + (super.getPrecioUnitario() * porcentajeEl / 100) + precioGarantia;
		}
		
		else {
			
			return super.getPrecioUnitario() + (super.getPrecioUnitario() * porcentajeEl / 100);
		}
	}
}
