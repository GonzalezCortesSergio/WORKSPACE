package ejercicio;

public class Batmovil extends Vehiculo{

	//Atributos
	
	private int numRuedas;

	
	//Constructor
	public Batmovil(String matricula, double tamanio, int anioFabricacion, int idVehiculo, int numRuedas) {
		super(matricula, tamanio, anioFabricacion, idVehiculo);
		this.numRuedas = numRuedas;
	}


	
	//Getters and Setters
	
	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}



	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Batmovil [numRuedas=" + numRuedas + "]";
	}
	
	
	//Métodos
	
	
	@Override
	public double calcularPrecio(double beneficioBatmovil, double euroPotenciaPatin) {
		
		return super.calcularPrecio(beneficioBatmovil, euroPotenciaPatin) + (numRuedas * beneficioBatmovil);
	}
	
	public void avisarMaximo(int numRuedasMin) {
		
		if (numRuedas >= numRuedasMin)
			System.out.println("Desplegado al máximo");
	}
}
