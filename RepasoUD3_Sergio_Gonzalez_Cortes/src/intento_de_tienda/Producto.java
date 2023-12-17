package intento_de_tienda;

public class Producto {

	
	//Atributos
	
	private String nombre;
	private String id;
	private double precioUnitario;
	private boolean enVenta;
	
	
	
	//Constructor
	
	public Producto(String nombre, String id, double precioUnitario, boolean enVenta) {
		
		this.nombre = nombre;
		this.id = id;
		this.precioUnitario = precioUnitario;
		this.enVenta = enVenta;
	}



	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public double getPrecioUnitario() {
		return precioUnitario;
	}



	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
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
		return "Producto [nombre=" + nombre + ", id=" + id + ", precioUnitario=" + precioUnitario + ", enVenta="
				+ enVenta + "]";
	}
	

	
	
}

