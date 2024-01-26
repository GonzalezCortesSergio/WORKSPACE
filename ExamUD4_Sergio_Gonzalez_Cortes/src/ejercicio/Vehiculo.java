package ejercicio;

public class Vehiculo implements IAlquiler{

	
	//Atributos
	
	private String matricula;
	private double tamanio; //Metros
	private int anioFabricacion;
	private int idVehiculo;
	
	//Constructor
	
	public Vehiculo(String matricula, double tamanio, int anioFabricacion, int idVehiculo) {
		super();
		this.matricula = matricula;
		this.tamanio = tamanio;
		this.anioFabricacion = anioFabricacion;
		this.idVehiculo = idVehiculo;
	}

	
	//Getters and Setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
	public int getIdVehiculo () {
		
		return idVehiculo;
	}
	
	public void setIdVehiculo (int idVehiculo) {
		
		this.idVehiculo = idVehiculo;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tamanio=" + tamanio + ", anioFabricacion=" + anioFabricacion
				+ ", idVehiculo=" + idVehiculo + "]";
	}
	
	
	//Métodos
	
	@Override
	public double calcularPrecio(double beneficioBatmovil, double euroPotenciaPatin) {
		double cien = 100;
		
		return (tamanio * anioFabricacion) / cien; //Es necesario dividir entre cien para pasarlo de céntimos a euros
	}
	
	
	
}
