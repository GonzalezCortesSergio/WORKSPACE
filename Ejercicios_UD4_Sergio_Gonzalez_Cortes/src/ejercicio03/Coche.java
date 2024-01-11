package ejercicio03;

public class Coche extends Vehiculo{

	//Constructor
	
	public Coche(int cilindrada, int cv, int categoria) {
		super(cilindrada, cv, categoria);
	}
	
	//Métodos
	
	public double calcularImpuesto(double transporte) {
		
		return super.getCilindrada() - (super.getCilindrada() * 25 / 100);
	}
}
