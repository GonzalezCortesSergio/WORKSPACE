package ejercicio03;

public class Motocicleta extends Vehiculo{

	
	//Constructor
	
	public Motocicleta(int cilindrada, int cv, int categoria) {
		super(cilindrada, cv, categoria);
	}

	//Métodos
	
	public double calcularImpuesto(double transporte) {
		
		return super.getCilindrada() - (super.getCilindrada() * 60 / 100);
	}
	
	 
}
