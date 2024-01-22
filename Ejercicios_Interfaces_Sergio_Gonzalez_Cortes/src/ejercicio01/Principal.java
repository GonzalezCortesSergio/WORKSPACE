package ejercicio01;


public class Principal implements IRevision{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	public int cuentaPrestados(Publicacion[] listaPublicaciones) {
		
		int cuenta = 0;
		
		for (int i = 0; i < listaPublicaciones.length; i++) {
			
			if (listaPublicaciones[i] != null && listaPublicaciones[i].isPrestado()) {
				cuenta++;
			}
		}
		
		return cuenta;
	}
	
	public Publicacion[] publicacionesAnterioresA(Publicacion[]listaPublicaciones, int anio) {
		
		Publicacion[] publicacionesAnteriores = new Publicacion [listaPublicaciones.length];
		
		for (int i = 0; i < listaPublicaciones.length; i++) {
			
			if (listaPublicaciones[i].getAnioPubli() <= anio) {
				
				publicacionesAnteriores[i] = listaPublicaciones[i];
			}
			i++;
		}
		
		return publicacionesAnteriores;
	}
}
