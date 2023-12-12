package repaso01;

public class Producto {

	
	//Atributos
	
	private String nombre;
	private double precioFabrica;
	private int seccion; // 1 Alimentación, 2 Electrónica, 3 Ropa
	private boolean enVenta;
	
	//Constructor
	
	public Producto (String nombre, double precioFabrica, int seccion, boolean enVenta) {
		
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
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
}
