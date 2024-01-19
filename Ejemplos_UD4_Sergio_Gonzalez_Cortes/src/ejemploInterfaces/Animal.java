package ejemploInterfaces;

public class Animal implements IDepredador, IPresa{

	
	//Atributos
	
	private String nombre;
	private int patas;
	
	//Constructor
	
	public Animal(String nombre, int patas) {
		super();
		this.nombre = nombre;
		this.patas = patas;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", patas=" + patas + "]";
	}
	
	//Métodos
	
	@Override
	public void localizar(Animal presa) {
		
		System.out.println("Ha lozalizado un "+ presa.getNombre());
	}
	
	@Override
	public void cazar (Animal presa) {
		
		System.out.println("Sa comio un "+ presa.getNombre());
	}


	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("Ruidos guturales de pánico");
	}
	
}
