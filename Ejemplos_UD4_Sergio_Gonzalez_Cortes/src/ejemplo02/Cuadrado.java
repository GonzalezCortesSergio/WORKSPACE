package ejemplo02;

public class Cuadrado extends Figura{

	private double lado;
	
	public Cuadrado(double x, double y, double lado) {
		
		super (x,y);
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		//IMPLEMENTACION DEL METODO
		return lado*lado;
	}
}
