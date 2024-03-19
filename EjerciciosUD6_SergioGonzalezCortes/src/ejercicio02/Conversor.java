package ejercicio02;

public class Conversor {

	//Métodos
	
	public double convertirAFahrenheit (double gradosCelsius) throws TempValueException{
	
		if (gradosCelsius <= -273) {
			throw new TempValueException("No pueden haber temperaturas inferiores a -273ºC");
		}
		
		return (gradosCelsius * 9.0/5.0) + 32;
	
	}
	
	public double convertirACelsius (double gradosFahrenheit) throws TempValueException {
		
		double gradosCelsius;
		
		gradosCelsius = (gradosFahrenheit - 32) * 5.0/9.0;
		
		if (gradosCelsius <= -273) {
			throw new TempValueException("No pueden haber temperaturas inferiores a -273ºC");
		}
		
		return gradosCelsius;
	}
}
