package ejercicio01;

public interface IRevision {

	int cuentaPrestados(Publicacion [] listaPublicaciones); //Devuelve el número de publicaciones están prestadas
	int publicacionesAnterioresA(Publicacion[] listaPublicaciones, int anio); /*Devuelve las publicaciones que tienen 
	una fecha anterior al año recibido por parámetro*/
	
}
