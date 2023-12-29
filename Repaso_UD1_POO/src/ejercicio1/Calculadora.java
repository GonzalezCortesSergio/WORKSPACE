package ejercicio1;

public class Calculadora {

	//Métodos
	
	public double calcularPrecioAutomovil (double costeFabricacion, double ganancia, double impuestos) {
		
		return costeFabricacion + (costeFabricacion * (ganancia + impuestos) / 100);
	}
}
