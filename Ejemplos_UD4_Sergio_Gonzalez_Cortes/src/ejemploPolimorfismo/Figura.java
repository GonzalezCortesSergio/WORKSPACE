package ejemploPolimorfismo;

public abstract class Figura {

	//Atributos
	
	private String nombre;
	private String color;
	
	//Constructor
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	//toString
	
	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	//Métodos
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	public void metodoSoloDeFigura() {
		
		System.out.println("Solo estoy en la clase Figura, sin sobre"
				+ "escribir en las hijas");
	}
}
