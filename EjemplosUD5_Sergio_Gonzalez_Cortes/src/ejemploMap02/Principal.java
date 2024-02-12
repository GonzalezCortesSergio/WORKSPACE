package ejemploMap02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map <Integer, Alumno> mapaAlumnos = new HashMap <Integer, Alumno>();
		
		Alumno a = new Alumno (2, "Sergio", 2.2);
		
		mapaAlumnos.put(6, new Alumno (1, "Ángel", 3.2));
		mapaAlumnos.put(4, a);
		
		System.out.println(mapaAlumnos);
		
		a.setNombre("Josete");
		
		System.out.println(mapaAlumnos);
		
		
		Set <Entry<Integer, Alumno>> setEntry = mapaAlumnos.entrySet();
		
		for (Entry<Integer, Alumno> entry : setEntry) {
			
			System.out.println(entry);
		}
		
		
	}

}
