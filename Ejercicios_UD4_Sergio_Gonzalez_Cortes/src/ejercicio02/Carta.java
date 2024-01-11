package ejercicio02;

public class Carta extends Documento{

	//Atributos
	
	private String fecha;

	
	//Constructor
	
	public Carta(String nombreEmpresa, String direccion, String fecha) {
		super(nombreEmpresa, direccion);
		this.fecha = fecha;
	}


	//Getters and Setters
	
	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	//Métodos
	
	public void imprimirDocumento () {
			
			System.out.println("Nombre de la empresa: " + super.getNombreEmpresa() + 
					"\nDirección: "+ super.getDireccion() +
					"Fecha: " + fecha);
	}
}
