package ejemploForMejorado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		
		int suma = 0;
		
		for (int i : numeros) {
			suma+=i;
			
			System.out.println(i); //Para ver el valor del elemento
		}
		
		System.out.println("La suma es: " + suma);
	}

}
