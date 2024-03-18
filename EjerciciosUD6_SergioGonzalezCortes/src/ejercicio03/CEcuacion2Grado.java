package ejercicio03;

public class CEcuacion2Grado {

	
	//Métodos 
	
	public double calcularDiscriminante (double a, double b, double c) throws EcuacionDegenerada, RaicesComplejas {
		
		if (a == 0 && b == 0) 
			throw new EcuacionDegenerada();
		
		double discriminante;
		discriminante = Math.pow(b, 2) -4 * a * c;
		
		if (discriminante < 0) 
			throw new RaicesComplejas();
		
		return discriminante;
	}
	
	public double calcularPositivo (double a, double b, double c) throws EcuacionDegenerada, RaicesComplejas {
		
		
		return Math.abs((-b + (Math.sqrt(calcularDiscriminante(a, b, c)))) / 2*a);
		
		
	}
	
	public double calcularNegativo (double a, double b, double c) throws EcuacionDegenerada, RaicesComplejas {
		
		
		return (-b - (Math.sqrt(calcularDiscriminante(a, b, c)))) / 2*a;
		
		
	}
}
