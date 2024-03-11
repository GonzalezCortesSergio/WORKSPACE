package ejemploStream;

public class Coche {

	
	private String nombre;
	private String color;
	private double km;
	
	
	public Coche(String nombre, String color, double km) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.km = km;
	}


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


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	@Override
	public String toString() {
		return "Coche [nombre=" + nombre + ", color=" + color + ", km=" + km + "]";
	}
	
	
	
	
	
	
	
}
