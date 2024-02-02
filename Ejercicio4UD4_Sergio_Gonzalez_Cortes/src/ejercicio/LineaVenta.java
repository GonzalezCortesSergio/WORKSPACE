package ejercicio;

public class LineaVenta {

	
	//Atributos
	
	private Producto p;
	private int cantidad;
	
	
	//Constructor
	
	public LineaVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}
	
	public Producto getProducto () {
		
		return p;
	}
	
	
	
	
	//Métodos
	
	public double calcularPrecioProducto (double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		
		return p.calcularPVP(descuento, impuesto, diaAct, mesAct, anioAct);
	}
	
	public double calcularSubTotal (double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		
		return calcularPrecioProducto (descuento, impuesto, diaAct, mesAct, anioAct) * cantidad; 
	}
	
	
	
	public void mostrarLineaVenta (double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		
		System.out.printf("%s	Cantidad: %d	Precio venta: %.2f€	Importe: %.2f€\n", 
				p, cantidad, calcularPrecioProducto(descuento, impuesto, diaAct, mesAct, anioAct), 
				calcularSubTotal(descuento, impuesto, diaAct, mesAct, anioAct));
	}
	
	
}
