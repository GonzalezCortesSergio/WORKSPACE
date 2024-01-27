package ejemplo01;

public class Producto {

	//Atributos
	
	private String nombreProducto;
	private int seccion;
	private double precioFabrica;
	private int idProducto;
	private boolean enVenta;
	
	//Constructor
	
	public Producto(String nombreProducto, int seccion, double precioFabrica, int idProducto, boolean enVenta) {
		super();
		this.nombreProducto = nombreProducto;
		this.seccion = seccion;
		this.precioFabrica = precioFabrica;
		this.idProducto = idProducto;
		this.enVenta = enVenta;
	}

	
	//Getters and Setters
	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", seccion=" + seccion + ", precioFabrica="
				+ precioFabrica + ", idProducto=" + idProducto + ", enVenta=" + enVenta + "]";
	}
	
	
	//Métodos
	
	public double calcularPVP (double transporte) {
		
		double cien = 100;
		
		return precioFabrica + (precioFabrica * transporte / cien);
	}
	
}
