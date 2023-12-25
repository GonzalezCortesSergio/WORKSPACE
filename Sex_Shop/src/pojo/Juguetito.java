package pojo;

public class Juguetito {

	//Atributos
	
	private String nombre;
	private int seccion; // 1: Masculino, 2: Femenino
	private int id; 
	private double precio;
	private boolean enVenta;
	
	//Constructor
	public Juguetito(String nombre, int seccion, int id, double precio, boolean enVenta) {
		
		this.nombre = nombre;
		this.seccion = seccion;
		this.id = id;
		this.precio = precio;
		this.enVenta = enVenta;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}
	
	@Override
	public String toString() {
		return "Juguetito [nombre=" + nombre + ", seccion=" + seccion + ", id=" + id + ", precio=" + precio
				+ ", enVenta=" + enVenta + "]";
	}
}
