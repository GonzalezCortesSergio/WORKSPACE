package ejercicio04;

public class Calculo {

	
	//Métodos
	
	public int suma (int a, int b) throws SumaMenorADiez {
		
		int suma = a + b;
		
		if (suma > 10) 
			throw new SumaMenorADiez();
		
		return suma;
	}
}
