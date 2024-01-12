package ejemplo02;

public class Principal {

	public static void main (String [] args) {
		
		Figura cuadrado = new Cuadrado(1,2,2);//NO DA ERROR
		
		System.out.println(cuadrado.calcularArea());
		
		//Figura f = new Figura (1,2,1); No es posible instanciar Figura porque es abstracto.
		
		Cuadrado c = new Cuadrado(1,2,2);
		
		Rectangulo r = new Rectangulo (1,2,1,4);
	}
}
