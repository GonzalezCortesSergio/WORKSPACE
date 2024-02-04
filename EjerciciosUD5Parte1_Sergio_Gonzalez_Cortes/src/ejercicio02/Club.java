package ejercicio02;

import java.util.ArrayList;

public class Club {

	//Atributos
	
	private ArrayList<Socio> listaSocios;
	
	//Constructor
	
	public Club (ArrayList<Socio> listaSocios) {
		
		this.listaSocios = listaSocios;
	}
	
	//Getters and Setters
	
	public ArrayList<Socio> getListaSocios () {
		
		return listaSocios;
	}
	
	public void setListaSocios (ArrayList<Socio> listaSocios) {
		
		this.listaSocios = listaSocios;
	}
	
	
	//Métodos
	
	public void listarSocios () {
		
		for (Socio socio : listaSocios) {
			
			System.out.println(socio);
		}
		
	}
	
	public int buscarPorCodSocio (int codSocio) {
		
		int index = -1;
		
		for (int i = 0; i < listaSocios.size(); i++) {
			
			if (listaSocios.get(i).getCodSocio() == codSocio) {
				
				index = i;
			}
				
		}
		
		return index;
		
	}
	
	
	public void eliminarSocio (int codSocio) {
		
		listaSocios.remove(buscarPorCodSocio(codSocio));
	}
}
