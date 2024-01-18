package ejercicio06;

public abstract class CCuenta {

	//Atributos
	
	private String nombre;
	private double dineroCuenta;
	
	
	//Constructor
	
	public CCuenta(String nombre, double dineroCuenta) {
		super();
		this.nombre = nombre;
		this.dineroCuenta = dineroCuenta;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getDineroCuenta() {
		return dineroCuenta;
	}


	public void setDineroCuenta(double dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}
	
	//Métodos
	
	public abstract double sacarDinero();
	
	public abstract double meterDinero();
}
