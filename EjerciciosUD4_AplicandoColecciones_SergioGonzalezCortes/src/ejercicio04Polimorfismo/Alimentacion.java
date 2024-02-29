package ejercicio04Polimorfismo;

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

	
	//Métodos
	
	@Override
	public String toString() {
		return super.toString() + " Alimentacion [aCaducar=" + aCaducar + "]";
	}


	@Override
	public double calcularPVP(double descuentoAl, double impuestoEl, double garantia) {
		// TODO Auto-generated method stub
		
		if (aCaducar) {
			
			return getPrecioUnitario() - (getPrecioUnitario() * descuentoAl / 100);
		
		}
		
		else {
			
			return getPrecioUnitario();
		
		}
		
	}
	
	public void avisarCaducidad () {
		
		if (aCaducar) {
			
			System.out.println("Cushame, ten cuidao que ce va a caduca");
		}
	}
	
	
	
}
