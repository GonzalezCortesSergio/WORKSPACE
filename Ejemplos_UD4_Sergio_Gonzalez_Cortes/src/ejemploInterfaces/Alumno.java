package ejemploInterfaces;

public class Alumno extends Persona implements IPresa{
		
	//Atributos
	
	private double notaMedia;

	
	//Constructor
	
	public Alumno(String nombre, int edad, double notaMedia) {
		super(nombre, edad);
		this.notaMedia = notaMedia;
	}


	
	//Getters and Setters
	
	public double getNotaMedia() {
		return notaMedia;
	}


	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}



	//toString
	
	@Override
	public String toString() {
		return "Alumno [notaMedia=" + notaMedia + "]";
	}



	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("ILLO QUE VIENE EL LUISMI");
	}
	
	
	

}
