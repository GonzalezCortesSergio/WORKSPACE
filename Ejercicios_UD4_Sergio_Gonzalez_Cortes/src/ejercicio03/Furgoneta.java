package ejercicio03;

public class Furgoneta extends Vehiculo{
	
	
	//Constructor
	
	public Furgoneta(int cilindrada, int cv, int categoria) {
		super(cilindrada, cv, categoria);
	}

	//Métodos
	
	public double calcularImpuesto(double transporte, double fijo) {
		
		return fijo + (fijo * transporte /100);
	}
	
}
