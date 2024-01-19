package ejemploInterfaces;

public interface IDepredador {

	void localizar (Animal presa);
	
	void cazar (Animal presa);
/*
 * No es necesario incluir "public" a los métodos de las interfaces
 * porque por defecto ya lo son.
 * 
 * Los atributos son de tipo final (constantes), aunque en general
 * no veremos atributos dentro de las interfaces.
 */
}
