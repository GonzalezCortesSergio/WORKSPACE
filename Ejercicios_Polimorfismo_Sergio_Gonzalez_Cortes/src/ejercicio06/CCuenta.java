package ejercicio06;

public abstract class CCuenta {

	//Atributos
	
	private String nombreUsuario;
	private double dineroCuenta;
	
	
	//Constructor
	
	public CCuenta(String nombreUsuario, double dineroCuenta) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.dineroCuenta = dineroCuenta;
	}

	
	//Getters and Setters
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public double getDineroCuenta() {
		return dineroCuenta;
	}


	public void setDineroCuenta(double dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}
	
	public String toString () {
		
		return "CCuenta [nombreUsuario= " + nombreUsuario + ", dineroCuenta= " + dineroCuenta + "]";
	}
	
	//Métodos
	
	public abstract void sacarDinero(double cantidad, double puntosAdicionales);
	
	public abstract void meterDinero(double cantidad, double puntosAdicionales);
}
