package herencia;

public class App {
	
	public static void main (String [] args) {
		
		Personaje p = new SuperHeroe();
		
		//p.volar();
		
		SuperHeroe s = new SuperHeroe();
		
		
		
		s.volar();
		
		PuedeVolar p1 = new SuperHeroe();
		PuedeVolar p2 = new NubeGoku();
		
		ponerAVolarObjetosVoladores(new PuedeVolar[] {p1, p2});
	}
	
	public static void ponerAVolarObjetosVoladores (
			PuedeVolar[] objetosVoladores
			) {
		for (int i = 0; i < objetosVoladores.length; i++) {
			objetosVoladores[i].volar();
		}
	}
	

}
