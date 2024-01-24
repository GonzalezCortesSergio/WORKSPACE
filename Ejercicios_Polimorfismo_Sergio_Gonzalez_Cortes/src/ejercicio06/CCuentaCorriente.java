package ejercicio06;

public class CCuentaCorriente extends CCuenta{

	
	//Atributos
	
	private double puntos;

	
	//Constructor
	
	public CCuentaCorriente(String nombre, double dineroCuenta, double puntos) {
		super(nombre, dineroCuenta);
		this.puntos = puntos;
	}


	//Getters and Setters
	
	public double getPuntos() {
		return puntos;
	}


	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + " CCuentaCorriente [puntos=" + puntos + "]";
	}

	
	//Métodos
	
	@Override
	public void sacarDinero(double cantidad, double puntosAdicionales) {
		// TODO Auto-generated method stub
		
		if (getDineroCuenta() >= cantidad) {
			
			setDineroCuenta(getDineroCuenta() - cantidad);
		
			System.out.printf("Se ha sacado el dinero correctamente, ahora dispones "
					+ "de %.2f€\n", getDineroCuenta());
		}
		else {
			System.out.println("No puedes extraer más dinero del que dispones");
		}
		
		setPuntos(puntos + puntosAdicionales);
		
		System.out.printf("Usted dispone actualmente de %.2f puntos\n", getPuntos());
	}


	@Override
	public void meterDinero(double cantidad, double puntosAdicionales) {
		// TODO Auto-generated method stub
		setDineroCuenta(getDineroCuenta() + cantidad);
		
		System.out.printf("Se ha introducido el dinero correctamente, "
				+ "ahora dispones de %.2f€\n", getDineroCuenta());
		
		setPuntos(puntos + puntosAdicionales);
		
		System.out.printf("Usted dispone de %.2f puntos\n", getPuntos());
	}
	
	
	
	public void mantenimientoCuenta (double porcentaje) {
		
		setDineroCuenta(getDineroCuenta() - (getDineroCuenta() * porcentaje / 100));
		
		System.out.println("Por mantenimiento se han ha extraído un porcentaje de su dinero");
		
	}
	
	public void verDinero() {
		
		System.out.printf("%.2f\n", getDineroCuenta());
	}
}
