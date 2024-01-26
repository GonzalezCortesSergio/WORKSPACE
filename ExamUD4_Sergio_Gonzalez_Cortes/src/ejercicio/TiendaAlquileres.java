package ejercicio;

public class TiendaAlquileres {

	//Atributos
	
	private Vehiculo[] listaVehiculos;
	private int numVehiculos;
	
	//Constructor
	
	public TiendaAlquileres(Vehiculo[] listaVehiculos, int numVehiculos) {
		super();
		this.listaVehiculos = listaVehiculos;
		this.numVehiculos = numVehiculos;
	}

	
	//Getters and Setters
	
	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public int getNumVehiculos() {
		return numVehiculos;
	}

	public void setNumVehiculos(int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}
	
	
	//Métodos
	
	
	public void mostrarListado(int numRuedasMin) {
		
		for (int i = 0; i < numVehiculos; i++) {
			
			System.out.println(listaVehiculos[i]);
			if (listaVehiculos[i] instanceof Batmovil) {
				
				((Batmovil) listaVehiculos[i]).avisarMaximo(numRuedasMin);
			}
			
			System.out.println();
		}
	}
	
	public Vehiculo buscarPorId(int idVehiculo) {
		
		int i = 0;
		boolean encontrado = false;
		
		while (i < numVehiculos && !encontrado) {
			
			if (listaVehiculos[i].getIdVehiculo() == idVehiculo)
				encontrado = true;
			
			else
				i++;
		}
		
		if (encontrado)
			return listaVehiculos[i];
		
		else
			return null;
	}
	
	public Vehiculo [] buscarBatmoviles () {
		
		Vehiculo [] listaBatmoviles = new Vehiculo [numVehiculos];
		
		for (int i = 0; i < listaBatmoviles.length; i++) {
			
			if (listaVehiculos[i] instanceof Batmovil) {
				listaBatmoviles[i] = listaVehiculos[i];
			}
		}
		
		return listaBatmoviles;
	}
	
	public double calcularAlquilerVehiculo (Vehiculo v, double beneficioBatmovil, double euroPotenciaPatin) {
		
		return v.calcularPrecio(beneficioBatmovil, euroPotenciaPatin);
	}
	
	public double calcularTotalRecaudado (double beneficioBatmovil, double euroPotenciaPatin) {
		
		double suma = 0;
		
		for (int i = 0; i < numVehiculos; i++) {
			
			suma+= calcularAlquilerVehiculo (listaVehiculos[i], beneficioBatmovil, euroPotenciaPatin);
		}
		
		return suma;
	}
	
	public double calcularTotalRecaudadoBatmoviles (Vehiculo [] listaBatmoviles, double beneficioBatmovil, double euroPotenciaPatin) {
		
		double suma = 0;
		
		for (int i = 0; i < listaBatmoviles.length; i++) {
			if (listaBatmoviles[i] != null) {
				
				suma+= calcularAlquilerVehiculo(listaBatmoviles[i], beneficioBatmovil, euroPotenciaPatin);
			}
		}
		
		return suma;
	}
	
	public double calcularAlquilerVariosDias (Vehiculo v, double beneficioBatmovil, double euroPotenciaPatin, int dias) {
		
		return calcularAlquilerVehiculo(v, beneficioBatmovil, euroPotenciaPatin) * dias;
	}
}
