package ejercicio01;

public class NaNException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NaNException () {
		
		super ("No se ha podido realizar la operación");
	}

}
