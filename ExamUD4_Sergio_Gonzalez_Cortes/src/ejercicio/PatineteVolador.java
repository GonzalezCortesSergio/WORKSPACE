package ejercicio;

public class PatineteVolador extends Vehiculo{

	//Atributos
	
	private double potencia;

	
	//Constructor
	
	public PatineteVolador(String matricula, double tamanio, int anioFabricacion, int idVehiculo, double potencia) {
		super(matricula, tamanio, anioFabricacion, idVehiculo);
		this.potencia = potencia;
	}


	//Getters and Setters
	
	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + " PatineteVolador [potencia=" + potencia + "]";
	}
	
	//Métodos
	
	 @Override
	 public double calcularPrecio(double beneficioBatmovil, double euroPotenciaPatin) {
		 
		 return super.calcularPrecio(beneficioBatmovil, euroPotenciaPatin) + (euroPotenciaPatin * potencia);
	 }
}
