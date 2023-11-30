package ejercicio03;

public class Vendedor {

	//Atributos
	
	private Movil [] listaMoviles;
	private int numMoviles;
	private int totalVendido;
	
	
	//Constructor
	
	public Vendedor(Movil[] listaMoviles, int numMoviles, int totalVendido) {
		super();
		this.listaMoviles = listaMoviles;
		this.numMoviles = numMoviles;
		this.totalVendido = totalVendido;
	}


	
	//Getters and Setters
	
	public Movil[] getListaMoviles() {
		return listaMoviles;
	}


	public void setListaMoviles(Movil[] listaMoviles) {
		this.listaMoviles = listaMoviles;
	}


	public int getNumMoviles() {
		return numMoviles;
	}


	public void setNumMoviles(int numMoviles) {
		this.numMoviles = numMoviles;
	}


	public int getTotalVendido() {
		return totalVendido;
	}


	public void setTotalVendido(int totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	
	//Métodos
	
	public void agregarMovil (Movil m) {
		
		listaMoviles [numMoviles] = m;
		
		numMoviles++;
	}
	
	
	
	public void mostrarMovilesDisponibles () {
		
		
		for (int i = 0; i < numMoviles; i++) {
			
			if (!listaMoviles[i].isVendido()) {
				
				System.out.println(listaMoviles[i]);
			}
		}
	}
	
	public Movil findByNameModel (String marca, String modelo ) {
		
		int i = 0;
		boolean encontrado = false;
		
		while (i < numMoviles && !encontrado) {
			
			Movil deLista = listaMoviles [i];
			
			if (deLista.getMarca().equalsIgnoreCase(marca) && 
					deLista.getModelo().equalsIgnoreCase(modelo)) {
				
				encontrado = true;
			}
			
			else {
				
				i++;
			}
			
		}
		
		if (encontrado) {
			
			return listaMoviles[i];
		}
		
		else {
			
			return null;
		}
	}
	
	public boolean ponerSegundaMano (int oSegundaMano) {
		
		if (oSegundaMano == 2) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public double calcularPrecioFinal (double descuento, String marca, String modelo) {
		
		if (findByNameModel(marca, modelo).isNuevo()) {
			
			return findByNameModel(marca, modelo).getPrecioUnitario();
		}
		
		else {
			
			return findByNameModel(marca, modelo).getPrecioUnitario()+
					(findByNameModel(marca, modelo).getPrecioUnitario()*descuento/ 100);
		}
	}
	
	
	
	
	
	
}
