package ejercicio;

public class Venta {

	//Atributos
	
	private LineaVenta [] listaLineaVenta;
	
	//Constructor
	
	public Venta (LineaVenta[] listaLineaVenta) {
		
		this.listaLineaVenta = listaLineaVenta;
	}
	
	//Métodos
	
	public double calcularTotalAPagar (double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		
		double suma = 0;
		
		for (int i = 0; i < listaLineaVenta.length; i++) {
			
			if (listaLineaVenta[i] != null) {
				
				suma+= listaLineaVenta[i].calcularSubTotal(descuento, impuesto, diaAct, mesAct, anioAct);
			}
		}
		
		return suma;
	}
	
	
	public void mostrarVenta (double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		
		for (int i = 0; i < listaLineaVenta.length; i++) {
			
			if (listaLineaVenta[i] != null) {
				
				listaLineaVenta[i].mostrarLineaVenta(descuento, impuesto, diaAct, mesAct, anioAct);
				
				if (listaLineaVenta[i].getProducto() instanceof Alimentacion) {
					
					((Alimentacion)listaLineaVenta[i].getProducto()).avisarCaducidad(diaAct, mesAct, anioAct);
				}
			}
		}
		
		System.out.println();
		System.out.printf("TOTAL A PAGAR: %.2f€", calcularTotalAPagar(descuento, impuesto, diaAct, mesAct, anioAct));
	}
}
