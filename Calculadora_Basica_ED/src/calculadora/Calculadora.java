package calculadora;

/**
 * 
 * Clase que implementa una calculadora básica
 * de números reales.
 * 
 * @author Sergio González Cortés
 * 
 */
public class Calculadora {

	/** 
	 * Método que suma dos números de tipo double
	 * @since 1.0
	 * @see "Libro gordo de Petete"
	 * @see <a href = "http://google.es"> Ver aquí </a>
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return Suma de ambos números
	 */
	
	public double sumar (double a, double b) {
		
		return a+b;
	}
	
	
	/**
	 * Método que divide dos números de tipo double
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return División de ambos números
	 */
	public double dividir (double a, double b) {
		
		return a / b;
		
	}
	
	/**
	 * Método que resta dos números de tipo double
	 * 
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return Resta de ambos números
	 */
	public double restar (double a, double b) {
		
		return a - b;
	}
	
	/**
	 * Método que muestra todos los cálculos realizados
	 * @param a Primer operando
	 * @param b Segundo operando
	 */
	public void mostrarCalculos (double a, double b) {
		
		System.out.println(restar(a, b));
		
		System.out.println(sumar(a, b));
		
		System.out.println(dividir (a, b));
	}
	
	/**
	 * Método que calcula dos numeros enteros
	 * @deprecated el uso de deprecated sirve para mostrar que un método se va a eliminar o simplemente se va a dejar de mantener
	 * @param a
	 * @param b
	 * @return
	 */
	public int sumarCosa (int a, int b) {
		
		return a + b;
	}
}
