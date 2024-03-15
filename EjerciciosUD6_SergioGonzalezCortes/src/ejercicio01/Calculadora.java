package ejercicio01;

public class Calculadora {

	
	//Métodos
	
	public int sumar (int numero1, int numero2) {
		
		return numero1 + numero2;
	}
	
	public int restar (int numero1, int numero2) {
		
		return numero1 - numero2;
	}
	
	public int multiplicar (int numero1, int numero2) {
		
		return numero1 * numero2;
	}
	
	public double dividir (int numero1, int numero2) {
			
		return (double)numero1 / (double)numero2;
	}
	
	public double calcularRaizCuadrada (int numero) {
		
		return Math.sqrt((double)numero);
	}
}
