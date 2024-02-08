package ejemploSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Set<String> lista = new HashSet<String>();
		String dniBorrar = "21423332L";
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista);
		
		lista.remove("Tres");
		
		System.out.println(lista.contains("Uno"));
		
		for (String string : lista) {
			System.out.println(string.hashCode());
		}
		
		
		
		//Con lista de persoonas
		
		Set<Persona> listaPersonas = new HashSet<Persona>();
				
		listaPersonas.add(new Persona ("Sergio", 18, "41606806J"));
		listaPersonas.add(new Persona ("Miguel", 21, "52213665P"));
		listaPersonas.add(new Persona ("Francisco", 23, "21423332L"));
		
		Iterator<Persona> it = listaPersonas.iterator();
		
		System.out.println(listaPersonas);
		
		while (it.hasNext()) {
			
			if (it.next().getDni().equals(dniBorrar)) {
				
				it.remove();
			}
		}
		
		System.out.println(listaPersonas);
		
		
		
	}

	
	

}
