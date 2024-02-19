package ejercicio04Polimorfismo;

public abstract class Producto {

	
	//Atributos
	
	private double precioUnitario;
	private String nombre;
	private int codIdentificacion;
	
	//Contador para el ID
	
	public static int contCodIdentificacion = 1;

	
	//Constructor
	
	public Producto(double precioUnitario, String nombre) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.codIdentificacion = contCodIdentificacion++;
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


	public int getCodIdentificacion() {
		return codIdentificacion;
	}


	//toString
	
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codIdentificacion="
				+ codIdentificacion + "]";
	}

	//Métodos
	
	public abstract double calcularPVP (double descuentoAl, double impuestoEl, double garantia);
	
	
	
	
}
