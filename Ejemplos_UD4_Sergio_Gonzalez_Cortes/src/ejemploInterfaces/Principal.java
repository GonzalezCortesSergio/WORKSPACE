package ejemploInterfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal a = new Animal ("Picozapato", 2);
		
		a.localizar(a);
		a.cazar(a);
		
		Persona p = new Persona ("Luismi", 34);
		
		p.localizar(a);
		a.huir();
		p.cazar(a);
		
		Alumno al = new Alumno ("Pepe Pérez", 18, 4.56);
		
		al.huir();
	}

}
