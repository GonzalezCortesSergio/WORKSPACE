package ejemploPolimorfismo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables 
		
		String nombre, color, aux;
		int tam = 3;
		double lado, radio;
		
		//Scanner
		Scanner s = new Scanner(System.in);
		
		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c = new Cuadrado ("Cuadrado 1", "Negro", 2);
		Figura f = new Cuadrado ("Figura 1 como cuadrado", "Rojo", 4);
		Figura f2 = new Circulo ("Figura 2 como círculo", "Rosita", 3);
		
		
		//Lista de figuras
		
		//Los arrays de clases abstractas se pueden instanciar
		//Aunque los objetos que se introduzcan tendrán que ser concretos
		
		Figura [] listaFiguras = new Figura [tam];
		
		//Hacemos esto solo para el ejemplo
		
		listaFiguras[0] = c;
		listaFiguras[1] = f2;
		listaFiguras[2] = f;
		
		System.out.printf("El área es %.2f\n", op.calcularAreaUnaFigura(c));
		System.out.printf("El área es %.2f\n", op.calcularAreaUnaFigura(f));
		System.out.printf("El área es %.2f\n", op.calcularAreaUnaFigura(f2));
		
		//Métodos no reescritos
		
		//Este método es heredado de figura, ya que Cuadrado es una clase hija de Figura
		c.metodoSoloDeFigura();
		f.metodoSoloDeFigura();
		f2.metodoSoloDeFigura();
		
		c.mostrarLados();
		
		System.out.println(op.sumarAreas(listaFiguras));		/*
		 * No se puede acceder a métodos que sólo pertenecen a una clase
		 * si se realiza polimorfismo; ya que la herencia no puede ser inversa.
		 * 
		 * Por otra parte si utilizamos métodos sobreescritos sí que se podrá 
		 * hacer uso; ya que la clase madre se comporta como la hija, y está
		 * utilizando un método heredado.
		 */
		
		
		
	}

}
