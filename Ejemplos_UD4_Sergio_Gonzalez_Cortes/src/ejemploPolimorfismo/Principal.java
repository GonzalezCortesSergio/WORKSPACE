package ejemploPolimorfismo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables 
		
		String nombre, color, aux;
		
		double lado, radio;
		
		//Scanner
		Scanner s = new Scanner(System.in);
		
		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c = new Cuadrado ("Cuadrado 1", "Negro", 2);
		
		Figura f = new Cuadrado ("Figura 1 como cuadrado", "Rojo", 4);
		
		Figura f2 = new Circulo ("Figura 2 como círculo", "Rosita", 3);
		
		System.out.printf("El área es %.2f\n", op.calcularAreaUnaFigura(c));
		System.out.printf("El área es %.2f\n", op.calcularAreaUnaFigura(f));
		System.out.printf("El área es %.2f\n", op.calcularAreaUnaFigura(f2));
		
		//Métodos no reescritos
		
		//Este método es heredado de figura, ya que Cuadrado es una clase hija de Figura
		c.metodoSoloDeFigura();
		f.metodoSoloDeFigura();
		f2.metodoSoloDeFigura();
		
		c.mostrarLados();
		/*
		 * No se puede acceder a métodos que sólo pertenecen a una clase
		 * si se realiza polimorfismo; ya que la herencia no puede ser inversa.
		 * 
		 * Por otra parte si utilizamos métodos sobreescritos sí que se podrá 
		 * hacer uso; ya que la clase madre se comporta como la hija, y está
		 * utilizando un método heredado.
		 */
		
	}

}
