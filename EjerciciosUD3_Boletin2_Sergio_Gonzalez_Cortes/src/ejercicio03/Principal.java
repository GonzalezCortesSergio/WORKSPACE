package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		String aux, marca, modelo;
		int opcion, tam = 15, totalVendido = 0, numMoviles = 0, oSMano;
		double precioUnitario, descuentoSMano;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciar array
		
		Movil [] listaMoviles = new Movil [tam];
		
		//Instanciar vendedor
		
		Vendedor v = new Vendedor (listaMoviles, numMoviles, totalVendido);
		
		
		
		System.out.println("#     #                                                                                                               \r\n"
				+ "##    # # #    # #  ####     ##### #    #    #    # # ###### #####  ######    #    # #    #    #    #  ####  #####  # \r\n"
				+ "# #   # # ##   # # #    #      #   #    #    #   #  # #      #    # #         #    # ##   #    ##  ## #    # #    # # \r\n"
				+ "#  #  # # # #  # # #    #      #   #    #    ####   # #####  #    # #####     #    # # #  #    # ## # #    # #####  # \r\n"
				+ "#   # # # #  # # # #    #      #   #    #    #  #   # #      #####  #         #    # #  # #    #    # #    # #    # # \r\n"
				+ "#    ## # #   ## # #    #      #   #    #    #   #  # #      #   #  #         #    # #   ##    #    # #    # #    # # \r\n"
				+ "#     # # #    # #  ####       #    ####     #    # # ###### #    # ######     ####  #    #    #    #  ####  #####  # ");
		
		
		do {
		
			System.out.println("""
				
				Opción 1:	Agregar movil (robá)
				Opción 2:	Be kuantos movi kedan
				Opción 3:	Sablarle a un payo (vende movi)
				""");
		
		
			
			aux = s.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					
					System.out.println("De ke marka e");
					marca = s.nextLine();
					
					System.out.println("I er modelo");
					modelo = s.nextLine();
					
					System.out.println("Que tan rebentao está");
					do {
						
						System.out.println("""
								Opción 1:	Musho (Illo lo bendemo komo de segunda mano)
								Opción 2:	Ta nuebesiko
								""");
						
						aux = s.nextLine();
						oSMano = Integer.parseInt(aux);
						
					}while (oSMano != 1 && oSMano != 2);
					System.out.println("Bale mu vien; kuanto le kiere saka a los payo");
					aux = s.nextLine();
					precioUnitario = Double.parseDouble(aux);
					
					v.agregarMovil(new Movil (marca, modelo, false, v.ponerSegundaMano(oSMano), precioUnitario ));
					
					break;
					
				case 2:
					
					v.mostrarMovilesDisponibles();
					
					break;
			}
		}while (opcion != 0);
	}

}
