package ejemploPolimorfismo;

public class Cuadrado extends Figura{

	
	//Atributos
	
	private double lado;

	
	//Constructor
	
	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	
	//Getters and Setters

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	//toString
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	
	//Métodos
	
	@Override
	public double calcularArea() {
		
		return lado*lado;
	}
	
	@Override
	public double calcularPerimetro() {
		
		return lado * 4;
	}
	
	public void mostrarLados() {
		
		System.out.println("Solo estoy en la clase Cuadrado "
				+ "porque los demás no tienen lados, en concreto"
				+ " tengo 4 lados");
	}
}
