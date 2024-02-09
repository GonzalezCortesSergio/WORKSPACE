package programa;

public class Alimentacion extends Producto{

	//Atributos
	
	private boolean aPuntoDeCad;
	
	
	
	public Alimentacion(String nombre, double precioBase, boolean aPuntoDeCad) {
		super(nombre, precioBase);
		// TODO Auto-generated constructor stub
		
		this.aPuntoDeCad = aPuntoDeCad;
	}

	
	
	
	public boolean isaPuntoDeCad() {
		return aPuntoDeCad;
	}




	public void setaPuntoDeCad(boolean aPuntoDeCad) {
		this.aPuntoDeCad = aPuntoDeCad;
	}



	
	

	@Override
	public String toString() {
		return super.toString() + " Alimentacion [aPuntoDeCad=" + aPuntoDeCad + "]";
	}




	@Override
	public double calcularPVP(double porcentajeAl, double porcentajeEl) {
		// TODO Auto-generated method stub
		
		if (aPuntoDeCad) {
			
			return getPrecioBase() - (getPrecioBase() * porcentajeAl / 100);
		}
		
		else {
		
			return getPrecioBase();
		}
		
	}

}
