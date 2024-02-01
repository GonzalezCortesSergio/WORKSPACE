package ejemploList;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> listado = new ArrayList<String>();
		
		listado.add("Primero");
		listado.add("Segundo");
		listado.add("Tercero");
		listado.add("Cuarto");
		
		listado.contains("Cuarto");
		
		System.out.println(listado);
		
		System.out.println(listado.size());
		
		listado.remove(getIndex(listado));
		
		System.out.println(listado);
		
	}
	
	public static int getIndex (List<String> listado) {
		int ia = 0;
		for (int i = 0; i < listado.size(); i++) {
			
			if (listado.toArray()[i].equals("Cuarto"))
				ia = i;
			
			
		}
		return ia;
		
	}

}
