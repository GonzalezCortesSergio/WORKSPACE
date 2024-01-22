package ejercicio02;

public class Trabajador implements IImpuesto{

	//Atributos
	
	private String nombre;

	
	//Constructor
	
	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}


	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//toString
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + "]";
	}


	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return sueldo;
	}
	
	
	
}
