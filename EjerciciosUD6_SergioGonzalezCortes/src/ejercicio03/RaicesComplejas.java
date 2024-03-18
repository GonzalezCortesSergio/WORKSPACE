package ejercicio03;

public class RaicesComplejas extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RaicesComplejas () {
		
		super("El discriminante es menor que 0, por lo que su raíz es compleja");
	}

}
