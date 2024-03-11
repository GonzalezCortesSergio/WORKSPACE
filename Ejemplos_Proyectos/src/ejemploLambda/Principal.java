package ejemploLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var z = 1;
		var dos = 2;
		String mensaje = "Hello world";
		
		double [] listaDoubles = new double [5];
		List<Double> listaDoubles2 = new ArrayList<Double>();
		
		
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
		
		listaDoubles2.add(kmR.get());
		listaDoubles2.add(kmR.get());
		listaDoubles2.add(kmR.get());
		listaDoubles2.add(kmR.get());
		listaDoubles2.add(kmR.get());

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
		//Funciona pasando un parámetro del tipo indicado, y devolviendo un valor de tipo indicado
		
		Function <Double, Double> aumentar = (m) -> m * 1000;
		Function <Double, Double> aumentarMas = (cm) -> cm * 100;
		
		for (double d : listaDoubles) {
			
			System.out.println(aumentar.apply(d));
		}
		
		for (double d : listaDoubles) {
			
			System.out.println(aumentar.andThen(aumentarMas).apply(d));
			
		}
		
		
		//Definido con la interfaz BiFunction
		//El objetivo de la intefaz BiFunction puede recibir dos objetos, devolviendo uno
		
		
		
		//Definido con la intefaz Predicate
		//Devuleve un booleano
		
		Predicate <Integer> mayor = (x) -> x >= 5;
		
		
		//Operador :: para referencia de métodos
		
		Consumer <List<Double>> mostrar = (List<Double> listaDouvle) -> listaDouvle.forEach(System.out::println);
		System.out.println();
		mostrar.accept(listaDoubles2);
		
		
		
	}

	
}
