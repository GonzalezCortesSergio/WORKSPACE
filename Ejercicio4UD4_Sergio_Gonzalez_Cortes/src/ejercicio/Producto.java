package ejercicio;

public abstract class Producto {

	
	//Atributos
	
	private double precioUnitario;
	private String nombre;
	private int codIdentificacion;
	
	public static int contCodIdentificacion = 0;
	
	//Constructor
	
	public Producto (double precioUnitario, String nombre) {
		
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.codIdentificacion = contCodIdentificacion++;
	}
	
	
	//Getters and Setters

	
	public double getPrecioUnitario () {
		
		return precioUnitario;
	}
	
	public void setPrecioUnitario (double precioUnitario) {
		
		this.precioUnitario = precioUnitario;
	}
	
	public String getNombre () {
		
		return nombre;
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getCodIdentificacion () {
		
		return codIdentificacion;
	}


	//toString
	
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codIdentificacion="
				+ codIdentificacion + "]";
	}
	
	//Métodos
	
	public abstract double calcularPVP(double descuento, double impuesto, int diaAct, int mesAct, int anioAct);
	
	
}
