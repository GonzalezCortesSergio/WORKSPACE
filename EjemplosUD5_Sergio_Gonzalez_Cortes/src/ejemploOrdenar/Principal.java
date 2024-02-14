package ejemploOrdenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcionUser, pos = 0;
		String aux;
		
		Scanner s = new Scanner(System.in);
		
		List <Corredor> listaCorredores = new ArrayList<Corredor>();
		
		listaCorredores.add(new Corredor (4, 1.43, "Jese Owens"));
		listaCorredores.add(new Corredor (8, 1.11, "Ángel Naranjo"));
		listaCorredores.add(new Corredor (3, 2.23, "Abel Antón"));
		listaCorredores.add(new Corredor (1, 1.12, "Luis Miguel López"));
		listaCorredores.add(new Corredor (6, 1.14, "Miguel Campos"));
		listaCorredores.add(new Corredor (5, 1.13, "Rafa Villar"));
		listaCorredores.add(new Corredor (7, 2.11, "Emil Zatopek"));
		
		
		for (Corredor corredor : listaCorredores) {
			System.out.println(corredor);
		}

		do {
			
			System.out.println("""
					Opción 1:	Ordenar de menor a mayor
					Opción 2:	Ordenar de mayor a menor
					Opción 0:	Salir
					""");
			aux = s.nextLine();
			opcionUser = Integer.parseInt(aux);
			
			switch (opcionUser) {
			
				case 1:
					
					System.out.println();
					System.out.println("\tGANADORES");
					Collections.sort(listaCorredores, new ComparaPorMarca());
			}
			
		}while (opcionUser != 0);
	}

}
