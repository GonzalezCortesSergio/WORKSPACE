package ejercicio;

import java.util.Comparator;

public class OrdenaPorNombre implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		// TODO Auto-generated method stub
		return p1.getNombre().compareToIgnoreCase(p2.getNombre());
	}

	
	
}
