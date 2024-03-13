package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String autor, nombre, genero, aux;
		double duracion;
		int opc;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Lista de canciones con varias instancias
		
		List<Cancion> listaCanciones = new ArrayList<Cancion>();
		
		listaCanciones.add(new Cancion ("Drown", "Bring Me The Horizon", 3.40, "Post Hardcore"));
		listaCanciones.add(new Cancion ("Die For You", "The Weeknd", 3.40, "Pop"));
		listaCanciones.add(new Cancion ("No", "Subhumans", 3.40, "Punk"));
		listaCanciones.add(new Cancion ("Doomed", "Bring Me The Horizon", 3.40, "Post Hardcore"));
		listaCanciones.add(new Cancion ("DiE4u", "Bring Me The Horizon", 3.40, "Post Hardcore"));
		listaCanciones.add(new Cancion ("La traviata - Brindisi", "Luciano Pavarotti", 3.40, "Música clásica"));
		listaCanciones.add(new Cancion ("Dale comba", "Canelita", 3.40, "Framenkito"));
		listaCanciones.add(new Cancion ("A quien le voy a contar mis penas", "Canelita", 3.40, "Framenkito"));
		listaCanciones.add(new Cancion ("Death Breath", "Bring Me The Horizon", 3.40, "Hardcore Punk"));
		listaCanciones.add(new Cancion ("If I'm James Dean You're Audrey Hepburn", "Sleeping With Sirens", 3.40, "Post Hardcore"));
		listaCanciones.add(new Cancion ("ICARUS", "Tonny Ann", 3.40, "Música clásica"));
		
		
		//Instancia de Playlist agregando la lista de canciones
		
		Playlist p = new Playlist(listaCanciones);
		
		
		//Apartado "visual" del programa
		
		do {
			
			System.out.println("""
					
					--------------------------------------------------------
					Opción 1:	Agregar canción
					Opción 2:	Borrar canción
					Opción 3:	Ver todas las canciones
					Opción 4:	Ver canciones por nombre
					Opción 5:	Ver canciones por autor
					Opción 6:	Ver canciones por duración
					Opción 7:	Ver canciones por género musical
					Opción 8:	Ver duración en total playlist
					Opción 9:	Hacer playlist aleatoria
					Opción 0:	Salir
					--------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre de la canción");
					nombre = s.nextLine();
					
					System.out.println("Autor de la canción");
					autor = s.nextLine();
					
					System.out.println("Duración");
					aux = s.nextLine();
					duracion = Double.parseDouble(aux);
					
					System.out.println("Género");
					genero = s.nextLine();
					
					p.agregarCancion(new Cancion (nombre, autor, duracion, genero));
					
					break;
					
				case 2:
					
					System.out.println("Nombre y autor de la canción");
					nombre = s.nextLine();
					autor = s.nextLine();
					
					try {
						
						p.borrarCancion(p.buscarPorNombreYAutor(nombre, autor));
					}
					catch (NullPointerException npe) {
						
						System.out.println("******************************");
						System.out.println("No se ha encontrado la canción");
						System.out.println("******************************");
					}
					
					break;
					
				case 3:
					
					p.mostrarTodo();
					
					break;
					
				case 4:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					p.mostrarPorParametros(p.buscarPorNombre(nombre));
					
					break;
					
				case 5:
					
					System.out.println("Autor");
					autor = s.nextLine();
					
					p.mostrarPorParametros(p.buscarPorAutor(autor));
					
					break;
					
				case 6:
					
					System.out.println("Duración");
					aux = s.nextLine();
					duracion = Double.parseDouble(aux);
					
					p.mostrarPorParametros(p.buscarPorDuracion(duracion));
					
					break;
					
				case 7:
					
					System.out.println("Género");
					genero = s.nextLine();
					
					p.mostrarPorParametros(p.buscarPorGenero(genero));
					
					break;
					
				case 8:
					
					System.out.printf("La playlist tiene una duración de %.2f minutos\n", p.duracionTotalPlaylist());
			
					break;
					
				case 9:
					
					System.out.println("Qué duracion quiere que tenga la playlist");
					aux = s.nextLine();
					duracion = Double.parseDouble(aux);
					p.mostrarPorParametros(p.hacerPlaylistDuracion(duracion));
					
					
					break;
					
				case 0:
					
					System.out.println("***********");
					System.out.println("Saliendo...");
					System.out.println("***********");
					
					break;
					
				default:
					
					System.out.println("*****************");
					System.out.println("Opción equivocada");
					System.out.println("*****************");
					
					break;
			}
			
			
		}while (opc != 0);
		
	
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");







	}

}
