package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, String> mapaString = new HashMap<String, String>();
		
		Set <String> setClaves = mapaString.keySet();
		Collection <String> coleccionValores = mapaString.values();
		
		mapaString.put("Uno", "One");
		mapaString.put("Dos", "Two");
		mapaString.put("Tres", "Three");
		mapaString.put("Uno", "Ummmm");
		mapaString.put("First", "One");
		
		
		
		System.out.println(mapaString);
		System.out.println(setClaves);
		
		System.out.println(coleccionValores);
	}

}
