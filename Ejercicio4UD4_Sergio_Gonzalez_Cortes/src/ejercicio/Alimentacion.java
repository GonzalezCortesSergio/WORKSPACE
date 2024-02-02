package ejercicio;

public class Alimentacion extends Producto{

	//Atributos
	
	private int diaCad;
	private int mesCad;
	private int anioCad;
	
	
	//Constructor
	
	public Alimentacion(double precioUnitario, String nombre, int diaCad, int mesCad, int anioCad) {
		super(precioUnitario, nombre);
		this.diaCad = diaCad;
		this.mesCad = mesCad;
		this.anioCad = anioCad;
	}


	public int getDiaCad() {
		return diaCad;
	}


	public void setDiaCad(int diaCad) {
		this.diaCad = diaCad;
	}


	public int getMesCad() {
		return mesCad;
	}


	public void setMesCad(int mesCad) {
		this.mesCad = mesCad;
	}


	public int getAnioCad() {
		return anioCad;
	}


	public void setAnioCad(int anioCad) {
		this.anioCad = anioCad;
	}


	
	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Alimentacion [diaCad=" + diaCad + ", mesCad=" + mesCad + ", anioCad=" + anioCad + "]";
	}
	
	//Métodos
	
	@Override
	public double calcularPVP(double descuento, double impuesto, int diaAct, int mesAct, int anioAct) {
		
		if (diaAct >= (diaCad - 2) && mesAct == mesCad && anioAct == anioCad) {
			
			return getPrecioUnitario() - (getPrecioUnitario() * descuento / 100);
		}
		
		else {
			
			return getPrecioUnitario();
		}
	}
	
	public void avisarCaducidad (int diaAct, int mesAct, int anioAct) {
		
		if (diaAct >= (diaCad - 2) && mesAct >= mesCad && anioAct >= anioCad) {
			
			System.out.println("Cuidadín que es posible que vaya a caducar el producto " + super.getNombre() + " o ya esté caducado");
			System.out.println();
		}
	}
	
	
	
	
}
