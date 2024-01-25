package ejercicio02;

public class Trabajador implements IImpuesto{

	//Atributos
	
	private String nombre;
	private double impuesto;

	
	//Constructor
	
	public Trabajador(String nombre, double impuesto) {
		super();
		this.nombre = nombre;
		this.impuesto = impuesto;
	}


	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getImpuesto () {
		
		return impuesto;
	}
	
	public void setImpuesto(double impuesto) {
		
		this.impuesto = impuesto;
	}


	//toString
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", impuesto=" + impuesto + "]";
	}


	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return sueldo - (sueldo * impuesto / 100);
	}
	
	
	
}
