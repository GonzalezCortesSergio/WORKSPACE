package ejercicio02;

public class Habitacion {

	
	//Atributos 
	
	private String nCliente;
	private int nDias;
	private double precio;
	private String tipo;
	private int serviciosExtra;
	private boolean limpia;
	private boolean ocupada;
	
	//Constructor
	
	public Habitacion(String nCliente, int nDias, double precio, String tipo, int serviciosExtra, boolean limpia,
			boolean ocupada) {
		
		this.nCliente = nCliente;
		this.nDias = nDias;
		this.precio = precio;
		this.tipo = tipo;
		this.serviciosExtra = serviciosExtra;
		this.limpia = limpia;
		this.ocupada = ocupada;
		
		
	}
	
	
	//Getters and Setters

	public String getnCliente() {
		return nCliente;
	}

	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}

	public int getnDias() {
		return nDias;
	}

	public void setnDias(int nDias) {
		this.nDias = nDias;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getServiciosExtra() {
		return serviciosExtra;
	}

	public void setServiciosExtra(int serviciosExtra) {
		this.serviciosExtra = serviciosExtra;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	
	//To String
	
	@Override
	public String toString() {
		return "Habitacion [nCliente=" + nCliente + ", nDias=" + nDias + ", precio=" + precio + ", tipo=" + tipo
				+ ", serviciosExtra=" + serviciosExtra + ", limpia=" + limpia + ", ocupada=" + ocupada + "]";
	}
	
	
	
	
	
	
}


/*Comentarios:
 * 
 * ++
 * Si no se utiliza desde un principio un atributo; no hace
 * falta aplicarlo en el constructor, y ya a lo largo del programa
 * sacarle provecho. (Supongo que será gracias al uso de los Getter
 * and Setter.
 * ++
 * 
 * ++
 * El método para calcular el precio final se podrá aplicar en la clase hotel,
 * aún siendo necesaria una clase "Gestion" o similar.
 * ++
 * */
