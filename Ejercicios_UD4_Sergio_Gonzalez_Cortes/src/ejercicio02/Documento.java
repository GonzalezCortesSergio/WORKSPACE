package ejercicio02;

public class Documento {

	//Atributos
	
	private String nombreEmpresa;
	private String direccion;
	
	//Constructor
	
	public Documento(String nombreEmpresa, String direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
	}

	
	//Getters and Setters
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa (String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + "]";
	}
	
	
	//Métodos
	
	public void imprimirDocumento () {
	
		System.out.println("Nombre de la empresa: "+ nombreEmpresa + "\nDirección: "+ direccion);
	}
	
}
