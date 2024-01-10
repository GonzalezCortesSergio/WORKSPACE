package ejercicio02;

public class TarjetaVisita extends Documento{

	//Atributos
	
	private String nombre;
	private String telefono;
	private String correo;
	
	//Constructor
	
	public TarjetaVisita(String nombreEmpresa, String direccion, String nombre, String telefono, String correo) {
		super(nombreEmpresa, direccion);
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return super.toString() +" TarjetaVisita [nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
}
