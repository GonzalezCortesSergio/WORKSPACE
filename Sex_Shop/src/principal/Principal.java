package principal;

import java.util.Scanner;

import crud.Tiendecita;
import pojo.Juguetito;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombre, aux;
		int seccion, id = 1, tam = 20, opc;
		double precio;
		
		
		//Instanciar Scanner
		
		Scanner s = new Scanner (System.in);
		
		//Instanciar array
		
		Juguetito [] listaJuguetitos = new Juguetito [tam];
		
		//Instanciar tienda 
		
		Tiendecita t = new Tiendecita (listaJuguetitos, 0);
		
		//Inicio del programa
		
		System.out.println("kkkkkkkkkOO000KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0OOkk\r\n"
				+ "kkkkkO00KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0k\r\n"
				+ "kOO0KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKO\r\n"
				+ "0KKKKKKKKKKKKKKKKKKKK0OkkkkkkOO0KKKKKKKKKKKKKKKK0O\r\n"
				+ "KKKKKKKKKKKKKKKKKKKOxoolllllllodxkO0KKKKK0000OOkkk\r\n"
				+ "KKKKKKKKKKKKKKKKK0kolllolllllllllloodxkkkkkkkkkkkk\r\n"
				+ "KKKKKKKKKKKKKKKKKkololllllllllololodxdooooodddddxx\r\n"
				+ "KKKKKKKKKKKKKKKKKxlooooolllollooldkOk0kolllllllloo\r\n"
				+ "KKKKKKKKKKKKKKKKKOodOK0OkkkdololoOOolkKdlolllllllo\r\n"
				+ "KKKKKKKKKOkdoooooolloxkO00OOOxookOdloO0ollllllllll\r\n"
				+ "KKKKKK0ko:;,,,,,,;;:lllok00xx0OOOdllk0xlolllllllll\r\n"
				+ "KKKKKOo:,;;cl;,,,,,,;cllooOOoxX0olox0xolllllllllll\r\n"
				+ "KKKKOo;,;cdxxdc;,,,,,;:ok00xlx0kxxO0xloollllllllll\r\n"
				+ "KK0Oo;,;ckkookxoooooooodddoox00kkkkOOdolllllllllll\r\n"
				+ "olc:;,,,;:lx0kllllccc:::cloxkxolooook0xlolllllllll\r\n"
				+ ",,,,,,,,,;,;dOdoollloooooll::okkkkOxok0xllolllllll\r\n"
				+ ",,,,,,,,,,,,:odolccc::::cllodxxdoldOOxOKOdllllllll\r\n"
				+ ",,,,,,,,;,,,,,:loooooooooolc:;:lllloxkkkkdllolllll\r\n"
				+ ",,,,,,,,;;,,,,,,,,,,;,,,,,,,,,;:loolllllllllllllll\r\n"
				+ ",,,,,,,,,,,,,,,,,,,,,;,,,,,,,,,;:lollollllllllloll\r\n"
				+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,;,,;,:oooololllllllllll\r\n"
				+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,;,,,;oxxdoloollllllllll\r\n"
				+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,;cdxkkkxoolllllllllll\r\n"
				+ ",,,,,,,,,,,,,,,,,,,,,,,,,,;:ldxkkkkkkxdoollollllll\r\n"
				+ ",,,,,,,,,,,,,,,,,,,,,,,,;;:okkkkkkkkkkkxdooollooll");
		
		System.out.println("######                                    \r\n"
				+ "#     # #      #####   ##   #    #  ####  \r\n"
				+ "#     # #        #    #  #  ##   # #    # \r\n"
				+ "######  #        #   #    # # #  # #    # \r\n"
				+ "#       #        #   ###### #  # # #    # \r\n"
				+ "#       #        #   #    # #   ## #    # \r\n"
				+ "#       ######   #   #    # #    #  ####  \r\n"
				+ "                                          \r\n"
				+ "#     #                      \r\n"
				+ "##   ## ###### #      #    # \r\n"
				+ "# # # # #      #      ##   # \r\n"
				+ "#  #  # #####  #      # #  # \r\n"
				+ "#     # #      #      #  # # \r\n"
				+ "#     # #      #      #   ## \r\n"
				+ "#     # ###### ###### #    # ");
		
		
		do {
			
			System.out.println("""
					Opción 1:	Añadir juguete
					Opción 2:	Ver juguetes en venta
					Opción 3:	Ver juguetes descatalogados
					Opción 4:	Descatalogar juguetes
					Opción 5:	Volver a poner en venta
					Opción 0:	Salir
					""");
			
			aux = s.nextLine();
			
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
			
				case 1:	
					
					System.out.println("Nombre del juguete");
					
					nombre = s.nextLine();
					
					System.out.println("""
							SECCIÓN
						Opción 1:	Masculino
						Opción 2:	Femenino
							
							""");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					System.out.println("Precio del producto");
					aux = s.nextLine();
					precio = Double.parseDouble(aux);
					
					t.agregarJuguete(new Juguetito (nombre, seccion, id, precio, true));
					
					id++;
					
					break;
					
				case 2:
					
					t.mostrarJuguetesEnVenta();
					
					break;
					
				case 3:
					
					t.mostrarDescatalogados(t.buscarJuguetesDescatalogados());
					
					break;
					
				case 4:
					
					System.out.println("Introduzca el id del juguete que quiere "
							+ "descatalogar");
					aux = s.nextLine();
					
					id = Integer.parseInt(aux);
					
					t.descatalogarJuguete(id);
					
					System.out.println("Se ha descatalogado correctamente");
					
					break;
					
				case 5:
					
					System.out.println("Introduzca el id del juguete que quiere "
							+ "poner en venta");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					t.volverEnVenta(id);
					
					System.out.println("Se ha vuelto a poner en venta "
							+ "correctamente");
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
			
		}while (opc != 0);
		
		
	System.out.println("Gracias; que tenga un buen día");
	}

}
