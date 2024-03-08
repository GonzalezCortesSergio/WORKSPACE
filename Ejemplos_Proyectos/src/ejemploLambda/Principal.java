package ejemploLambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var z = 1;
		var dos = 2;
		String mensaje = "Hello world";
		
		double [] listaDoubles = new double [5];
		
		
		//Cuando sólo hay una variable no es necesario el paréntesis
		IBienvenida bienvenida = x -> System.out.println(x);
		
		bienvenida.mostrarBienvenida(mensaje);
		
		SumaVariables suma = (y, x) -> y + x;
		
		System.out.println(suma.sumarVariables(z, dos));
		
		
		//Definido con la interfaz Supplier (proveedor)
		//Esta interfaz ofrece objetos de distinto tipo
		
		Supplier <Double> kmR = () -> Math.random();
		
		for (int i = 0; i < listaDoubles.length; i++) {
			
			listaDoubles[i] = kmR.get();
		}
		
		for (double d : listaDoubles) {
			System.out.println(d);
		}
		

		//Definido con la interfaz Consumer (consumidor)
		//Esta interfaz recibe objetos de distinto tipo,
		//o sea, puede utilizarse muy bien para imprimir
		
		Consumer <Double> mostrarDouble = (m) -> System.out.println(m);
		
		for (double d : listaDoubles) {
			
			mostrarDouble.accept(d);
		}
		
		
		//Definido con la interfaz Function 
		
		Function <Double, Double> aumentar = (m) -> m * 1000;
		Function <Double, Double> aumentarMas = (cm) -> cm * 100;
		
		for (double d : listaDoubles) {
			
			System.out.println(aumentar.apply(d));
		}
		
		for (double d : listaDoubles) {
			
			System.out.println(aumentar.andThen(aumentarMas).apply(d));
			
		}
		
		
	}

	
}
