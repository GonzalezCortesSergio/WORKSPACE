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
	
	public int dividir (int numero1, int numero2) {
			
		return numero1 /numero2;
	}
	
	public double calcularRaizCuadrada (int numero) throws NaNException{
		
		if (Double.isNaN(Math.sqrt(numero))) {
			
			throw new NaNException();
		}
		return Math.sqrt((double)numero);
	}
}
