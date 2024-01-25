package ejercicio02;

public class EspadaLaser extends Producto{

	//Atributo
	
	private String tipoEspada;

	
	//Constructor
	
	public EspadaLaser(double precioBase, int cantidad, String nombreProducto, int idProducto, boolean vendido, String tipoEspada) {
		super(precioBase, cantidad, nombreProducto, idProducto, vendido);
		this.tipoEspada = tipoEspada;
	}


	
	//Getters and Setters
	
	public String getTipoEspada() {
		return tipoEspada;
	}


	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + " EspadaLaser [tipoEspada=" + tipoEspada + "]";
	}
	
	
	//Métodos
	
	@Override
	
	public double calcularPVP (double porcentaje, double espadaDoble) {
		
		double cien = 100;
		
		if (tipoEspada.equalsIgnoreCase("Doble"))
			return super.getPrecioBase() + (super.getPrecioBase() * porcentaje / cien) + espadaDoble;
		
		else
			return super.getPrecioBase() + (super.getPrecioBase() * porcentaje / cien);
	}
	
	public void mensajeCompra () {
		
		System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
	}
}
