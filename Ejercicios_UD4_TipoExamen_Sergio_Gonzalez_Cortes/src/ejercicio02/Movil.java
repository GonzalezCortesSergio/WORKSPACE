package ejercicio02;

public class Movil extends Producto{

	//Atributos
	
	private String marca;
	private String modelo;
	
	
	//Constructor
	
	public Movil(double precioBase, int cantidad, String nombreProducto, int idProducto, boolean vendido, String marca, String modelo) {
		super(precioBase, cantidad, nombreProducto, idProducto, vendido);
		this.marca = marca;
		this.modelo = modelo;
	}


	
	//Getters and Setters
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	//toString
	
	@Override
	public String toString() {
		return super.toString() +  " Movil [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	//Método
	
	@Override
	
	public double calcularPVP(double porcentaje, double espadaDoble) {
		
		double cien = 100;
		
		return getPrecioBase() + (getPrecioBase() * porcentaje / cien);
	}
}
