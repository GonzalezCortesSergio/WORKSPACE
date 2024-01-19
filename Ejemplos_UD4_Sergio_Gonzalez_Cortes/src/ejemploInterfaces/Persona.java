package ejemploInterfaces;

public class Persona implements IDepredador{
	
	//Atributos
	
	private String nombre;
	private int edad;
	
	//Constructor
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
	//Constructor
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	//toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}



	//Métodos
	
	@Override
	public void localizar(Animal presa) {
		// TODO Auto-generated method stub
		
		System.out.println("Illo un "+ presa.getNombre());
		
	}



	@Override
	public void cazar(Animal presa) {
		// TODO Auto-generated method stub
		
		System.out.println("Ostia que me he cargao un "+ presa.getNombre());
	}
	
	

}
