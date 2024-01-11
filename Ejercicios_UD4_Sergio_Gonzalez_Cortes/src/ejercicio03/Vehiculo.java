package ejercicio03;

public abstract class Vehiculo {

	//Atributos
	
	private int cilindrada;
	private int cv;
	private int categoria; //1: 0 emisiones, 2: ECO, 3: B, 4: C
	
	
	//Constructor
	
	public Vehiculo(int cilindrada, int cv, int categoria) {
		super();
		this.cilindrada = cilindrada;
		this.cv = cv;
		this.categoria = categoria;
	}


	
	//Getters and Setters
	
	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public int getCv() {
		return cv;
	}


	public void setCv(int cv) {
		this.cv = cv;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	
	//Métodos

	abstract double calcularImpuesto(double transporte);
}
