package ejercicio01;

public class Ordenador {

	//Atributo
	
	private double capDiscDuro;
	private double frecProcesador;
	private double precioBase;
	private String marca;
	
	//Constructor
	
	public Ordenador(double capDiscDuro, double frecProcesador, double precioBase, String marca) {
		super();
		this.capDiscDuro = capDiscDuro;
		this.frecProcesador = frecProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	//Getters and Setters
	
	public double getCapDiscDuro() {
		return capDiscDuro;
	}

	public void setCapDiscDuro(double capDiscDuro) {
		this.capDiscDuro = capDiscDuro;
	}

	public double getFrecProcesador() {
		return frecProcesador;
	}

	public void setFrecProcesador(double frecProcesador) {
		this.frecProcesador = frecProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Ordenador [capDiscDuro=" + capDiscDuro + ", frecProcesador=" + frecProcesador + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}
	
	//Métodos
	
	public double calcularPrecioVenta(double porcentajeGanancia) {
		
		return precioBase + (precioBase * porcentajeGanancia / 100);
	}
}
