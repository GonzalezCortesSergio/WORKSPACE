package repaso01;

public class Producto {

	
	//Atributos
	
	private String nombre;
	private double precioFabrica;
	private int seccion; // 1 Alimentación, 2 Electrónica, 3 Ropa
	private boolean enVenta;
	private String id;
	
	
	//Constructor
	
	public Producto (String nombre, double precioFabrica, int seccion, boolean enVenta, String id) {
		
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
		this.id = id;
	}
	

	
	//Getters and Setters
	
	public String getNombre () {
		
		return nombre;
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	
	public double getPrecioFabrica () {
		
		return precioFabrica;
	}
	
	public void setPrecioFabrica (double precioFabrica) {
		
		this.precioFabrica = precioFabrica;
	}
	
	public int getSeccion () {
		
		return seccion;
	}
	
	public void setSeccion (int seccion) {
		
		this.seccion = seccion;
	}
	
	public boolean isEnVenta () {
		
		return enVenta;
	}
	
	public void setEnVenta (boolean enVenta) {
		
		this.enVenta = enVenta;
	}
	
	public String getId () {
		
		return id;
	}
	
	public void setId (String id) {
		
		this.id = id;
	}



	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", enVenta="
				+ enVenta + ", id=" + id +"]";
	}
	
	
	
	
}
