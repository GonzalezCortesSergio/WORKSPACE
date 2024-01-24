package ejercicio06;

public class CCuentaJoven extends CCuenta{

	public CCuentaJoven(String nombre, double dineroCuenta) {
		super(nombre, dineroCuenta);
		// TODO Auto-generated constructor stub
	}

	
	//Métodos
	
	@Override
	public void sacarDinero(double cantidad, double puntosAdicionales) {
		// TODO Auto-generated method stub
		
		if (getDineroCuenta() >= cantidad) {
			
			setDineroCuenta(getDineroCuenta() - cantidad);
			
			System.out.printf("Se ha sacado el dinero correctamente. "
					+ "Ahora dispones de %.2f€\n", getDineroCuenta());
		}
		
		else {
			
			System.out.println("No es posible sacar más dinero del que dispones");
		}
	}

	@Override
	public void meterDinero(double cantidad, double puntosAdicionales) {
		// TODO Auto-generated method stub
		double retribucion = 1;
		setDineroCuenta(getDineroCuenta() + cantidad + retribucion);
		
		System.out.printf("Se ha introducido el dinero correctamente. "
				+ "Ahora dispones de %.2f€\n", getDineroCuenta());
	}

	
	
	
}
