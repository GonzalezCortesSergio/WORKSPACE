package ejercicio06;

public class CCuentaEmpresa extends CCuenta{

	
	//Constructor
	
	public CCuentaEmpresa(String nombre, double dineroCuenta) {
		super(nombre, dineroCuenta);
		// TODO Auto-generated constructor stub
	}

	
	//Métodos
	
	@Override
	public void sacarDinero(double cantidad, double puntosAdicionales) {
		// TODO Auto-generated method stub
		double cobroAdicional = 1;
		if (getDineroCuenta() >= cantidad) {
			
			setDineroCuenta(getDineroCuenta() - cantidad - cobroAdicional );
			
			System.out.printf("Se ha extraído el dinero correctamente. "
					+ "Ahora dispones de %.2f€\n", getDineroCuenta());
		}
		
		else {
			
			System.out.println("No es posible extraer más dinero del que se dispone");
		}
	}

	@Override
	public void meterDinero(double cantidad, double puntosAdicionales) {
		// TODO Auto-generated method stub
		
		setDineroCuenta(getDineroCuenta() + cantidad);
		
		System.out.printf("Se ha introducido el dinero correctamente. "
				+ "Ahora dispones de %.2f€\n", getDineroCuenta());
	}

	
}
