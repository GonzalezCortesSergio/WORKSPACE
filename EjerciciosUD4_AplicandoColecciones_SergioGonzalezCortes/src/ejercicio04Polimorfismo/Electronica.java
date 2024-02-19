package ejercicio04Polimorfismo;

public class Electronica extends Producto{

	//Atributos
	
	private boolean tieneGarantia;

	
	//Constructor
	
	public Electronica(double precioUnitario, String nombre, boolean tieneGarantia) {
		super(precioUnitario, nombre);
		this.tieneGarantia = tieneGarantia;
	}


	//Getters and Setters
	
	public boolean isTieneGarantia() {
		return tieneGarantia;
	}


	public void setTieneGarantia(boolean tieneGarantia) {
		this.tieneGarantia = tieneGarantia;
	}


	//toString
	
	@Override
	public String toString() {
		return "Electronica [tieneGarantia=" + tieneGarantia + "]";
	}


	//Métodos
	
	@Override
	public double calcularPVP(double descuentoAl, double impuestoEl, double garantia) {
		// TODO Auto-generated method stub
		
		double pvp = getPrecioUnitario() + (getPrecioUnitario() * impuestoEl);
		
		if (tieneGarantia) {
			
			return pvp + garantia;
			
		}
		
		else {
			
			return pvp;
		}
	}
	
	
	
}
