package programa;

public abstract class Producto {

	//Atributos
	
	private String nombre;
	private	double precioBase;
	private int codProducto;
	
	public static int contCodProducto = 1;

	
	//Constructor
	
	public Producto(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.codProducto = contCodProducto++;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getCodProducto() {
		return codProducto;
	}


	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}



	//toString
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", codProducto=" + codProducto + "]";
	}
	
	
	//Métodos
	
	public abstract double calcularPVP (double porcentajeAl, double porcentajeEl);
}
