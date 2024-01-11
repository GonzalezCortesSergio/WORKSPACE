package ejercicio02;

public class TarjetaVisita extends Documento{

	//Atributos
	
	private String nombreTrabajador;
	private String telefono;
	private String correo;
	
	//Constructor
	
	public TarjetaVisita(String nombreEmpresa, String direccion, String nombreTrabajador, String telefono, String correo) {
		super(nombreEmpresa, direccion);
		this.nombreTrabajador = nombreTrabajador;
		this.telefono = telefono;
		this.correo = correo;
	}

	
	//Getters and Setters
	
	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	
	//toString
	
	@Override
	public String toString() {
		return super.toString() +" TarjetaVisita [nombreTrabajador=" + nombreTrabajador + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	//Métodos
	
	public void imprimirDocumento () {
		
		System.out.println("Nombre de la empresa: " + super.getNombreEmpresa() + 
				"\nDirección: "+ super.getDireccion() +
				"\nNombre del trabajador: "+ nombreTrabajador +
				"\nTeléfono de contacto: "+ telefono +
				"\nCorreo de contacto: " +correo);
	}
}
