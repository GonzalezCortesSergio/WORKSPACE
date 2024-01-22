package ejercicio02;

public class Producto implements IImpuesto{

	//Atributos
	
	private String nombre;
	private int seccion;
	
	//Constructor
	
	public Producto(String nombre, int seccion) {
		super();
		this.nombre = nombre;
		this.seccion = seccion;
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


	
	//toString
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + "]";
	}
	
	@Override
	public double calculoIva (double precio, int iva) {
		
		return precio + (precio * iva / 100);
	}
	
	@Override
	public double calculoIrpf (double sueldo) {
		
		return 0;
	}
}
