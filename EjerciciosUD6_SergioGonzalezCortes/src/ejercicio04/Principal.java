package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Varibables
		
		int a = 7, b = 10;
		
		Calculo c = new Calculo();
		
		try {
			
			System.out.println("El resultado de la suma es " + c.suma(a, b));
		}catch (SumaMenorADiez smd) {
			
			System.out.println(smd.getMessage());
		}
	}

}
