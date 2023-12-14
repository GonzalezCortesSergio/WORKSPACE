package ejercicio03;

public class Cutre_Robot {

	
	//Atributos
	
	private String estado;
	private int velocidad;
	private double tempExt;
	
	//Constructor
	
	public Cutre_Robot(String estado, int velocidad) {
		
		this.estado = estado;
		this.velocidad = velocidad;
	}

	
	//Getters and Setters
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getTempExt() {
		return tempExt;
	}

	public void setTempExt(double tempExt) {
		this.tempExt = tempExt;
	}
	
	//Métodos
	
	public boolean volverACasa () {
		
		if (tempExt >= 660) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean cambiarParado(int opc) {
		
		if (opc == 1) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean cambiarExplorando (int opc) {
		
		if (opc == 2) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	
}
