package ejercicio06_4;

public class Alimentacion extends Producto{

	
	//Atributos
	
	private boolean aCaducar;

	
	//Constructor
	
	public Alimentacion(double precioUnitario, String nombre, boolean aCaducar) {
		super(precioUnitario, nombre);
		this.aCaducar = aCaducar;
	}

	
	//Getters and Setters
	

	public boolean isaCaducar() {
		return aCaducar;
	}


	public void setaCaducar(boolean aCaducar) {
		this.aCaducar = aCaducar;
	}

	//toString

	@Override
	public String toString() {
		return super.toString() + " Alimentacion [aCaducar=" + aCaducar + "]";
	}


	@Override
	public double calcularPVP(double porcentajeEl, double porcentajeAl) {
		// TODO Auto-generated method stub
		
		if (aCaducar) {
			
			return getPrecioUnitario() - (getPrecioUnitario() * porcentajeAl / 100);
		}
		
		return getPrecioUnitario();
	}
	
	
	
	
	
}
