package ejercicio06_4;

public abstract class Producto {

	
	//Atributos
	
	private double precioUnitario;
	private String nombre;
	private int id;
	
	private static int contId = 1;

	
	//Constructor
	
	public Producto(double precioUnitario, String nombre) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.id = contId++;
	}


	
	//Getters and Setters
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Producto [Precio Unitario: " + precioUnitario + ", Nombre del producto: " + nombre + ", ID: " + id + "]";
	}
	
	
	//Métodos
	
	public abstract double calcularPVP(double porcentajeEl, double porcentajeAl);
	
	
}
