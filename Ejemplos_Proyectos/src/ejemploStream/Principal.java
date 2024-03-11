package ejemploStream;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Coche> listaCoches = new ArrayList<Coche>();
		double suma = 0;
		long num = 0;
		
		listaCoches.add(new Coche ("Elecak", "Rojo", 125000));
		listaCoches.add(new Coche ("Eleck", "Rojo", 5000));
		listaCoches.add(new Coche ("Elcak", "Verde", 1250));
		listaCoches.add(new Coche ("Elecak", "Verde", 15000));
		listaCoches.add(new Coche ("ecak", "Azul", 120));
		
		suma = listaCoches.stream()
				.filter(color -> color.getColor().equalsIgnoreCase("Rojo"))
				.mapToDouble(km -> km.getKm())
				.sum();
		
		System.out.println(suma);
		
		num = listaCoches.stream().count();
		
		
		System.out.println(num);

		
		listaCoches.stream().forEach(System.out::println);

	}

}
