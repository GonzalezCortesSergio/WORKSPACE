package ejercicio03;

public class EcuacionDegenerada extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EcuacionDegenerada () {
		
		super ("a y b son iguales, por lo que la ecuación es degenerada");
	}

}
