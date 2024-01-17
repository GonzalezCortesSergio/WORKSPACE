package ejercicio04;

public abstract class Producto {

	//Atributos
	
	private String nombre;
	private double precioUnitario;
	private int id;
	
	
	//Constructor
	
	public Producto(String nombre, double precioUnitario, int id) {
		super();
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.id = id;
	}


	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	//toString
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", id=" + id + "]";
	}
	
	
	//Métodos
	
	public abstract double calcularPrecio(int diaActual, int mesActual, int anioActual, double porcentajeAl, double porcentajeEl);
	
}
