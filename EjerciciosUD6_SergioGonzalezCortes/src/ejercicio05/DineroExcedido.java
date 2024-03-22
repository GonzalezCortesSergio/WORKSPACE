package ejercicio05;

public class DineroExcedido extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public DineroExcedido (String mensaje) {
		
		super(mensaje);
	}
}
