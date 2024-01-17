package ejercicio04;

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


	//Getters and Setters
	
	public Producto getP() {
		return p;
	}


	public void setP(Producto p) {
		this.p = p;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	//toString
	
	@Override
	public String toString() {
		return "LineaVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	
	//Métodos

	public double realizarVenta(int diaActual, int mesActual, int anioActual, double porcentajeAl, double porcentajeEl) {
		
		return p.calcularPrecio(diaActual, mesActual, anioActual, porcentajeAl, porcentajeEl) * cantidad;
	}

}
