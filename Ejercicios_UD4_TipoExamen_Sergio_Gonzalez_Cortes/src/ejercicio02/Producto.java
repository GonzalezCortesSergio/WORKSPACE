package ejercicio02;

public abstract class Producto implements IVentas{
	
	//Atributos
	
	private double precioBase;
	private int cantidad;
	private String nombreProducto;
	private int idProducto;
	private boolean vendido;
	
	
	//Constructor
	
	public Producto(double precioBase, int cantidad, String nombreProducto, int idProducto, boolean vendido) {
		super();
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombreProducto = nombreProducto;
		this.idProducto = idProducto;
		this.vendido = vendido;
	}


	//Getters and Setters
	
	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public int getIdProducto () {
		
		return idProducto;
	}
	
	public void setIdProducto (int idProducto) {
		
		this.idProducto = idProducto;
	}
	
	public boolean isVendido () {
		
		return vendido;
	}
	
	public void setVendido (boolean vendido) {
		
		this.vendido = vendido;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidad=" + cantidad + ", nombreProducto=" + nombreProducto
				+ ", idProducto=" + idProducto + ", vendido=" + vendido + "]";
	}
	
	
}
