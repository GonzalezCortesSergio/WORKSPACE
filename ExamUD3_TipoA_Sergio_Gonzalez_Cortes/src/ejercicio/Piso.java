package ejercicio;

public class Piso {

	//Atributos
	
	private String direccion;
	private int id;
	private int metrosCuadrados;
	private int estado; //1. Nuevo, 2. Seminuevo, 3. A reformar
	private double precioVenta;
	
	
	//Constructor
	
	public Piso(String direccion, int id, int metrosCuadrados, int estado, double precioVenta) {
		
		this.direccion = direccion;
		this.id = id;
		this.metrosCuadrados = metrosCuadrados;
		this.estado = estado;
		this.precioVenta = precioVenta;
	}


	
	//Getters and Setters
	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}


	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}



	//toString
	
	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", id=" + id + ", metrosCuadrados=" + metrosCuadrados + ", estado=" + estado
				+ ", precioVenta=" + precioVenta + "]";
	}
	
	
	
	
	
}
