package ejemplo01;

public class Principal {

	
	public static void main (String [] args) {
		
		int num = 10;
		int den = 0;
		double res = 0;
		
				
		try {
			res = num/den;
			
			System.out.printf("La división es: %.2f\n", res);

		}catch (ArithmeticException ae) {
			
			System.err.println("Illo, no se puede dividir entre " + den);
			
			
		}
	}
}
