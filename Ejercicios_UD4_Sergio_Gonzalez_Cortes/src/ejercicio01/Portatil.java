package ejercicio01;

public class Portatil extends Ordenador{

	//Atributos
	
	private boolean seguroPantalla;
	private double precioSeguro;
	
	//Constructor
	
	public Portatil(double capDiscDuro, double frecProcesador, double precioBase, String marca, boolean seguroPantalla,
			double precioSeguro) {
		super(capDiscDuro, frecProcesador, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguro = precioSeguro;
	}

	
	//Getters and Setters
	
	public boolean isSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(boolean seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}


	
	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Portatil [seguroPantalla=" + seguroPantalla + ", precioSeguro=" + precioSeguro + "]";
	}
	
	
	//Métodos
	
	public double calcularPrecioVenta(double porcentajeGanancia) {
		
		if (seguroPantalla) {
			
			return super.calcularPrecioVenta(porcentajeGanancia) + precioSeguro;
		}
		
		else {
			
			return super.calcularPrecioVenta(porcentajeGanancia);
		}
	}
}
