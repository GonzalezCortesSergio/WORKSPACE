package ejercicio02;

import java.util.List;

public class CRUDSocio {

	
	//Atributos
	
	private List<Socio> listaSocios;
	
	
	//Constructor
	
		public CRUDSocio (List<Socio> listaSocios) {
			
			this.listaSocios = listaSocios;
		}
		
		//Getters and Setters
		
		public List<Socio> getListaSocios () {
			
			return listaSocios;
		}
		
		public void setListaSocios (List<Socio> listaSocios) {
			
			this.listaSocios = listaSocios;
		}
		
		
		//Métodos
		
		public void listarSocios () {
			
			for (Socio socio : listaSocios) {
				
				System.out.println(socio);
			}
		}
		
		public void agregarSocio (Socio s) {
			
			listaSocios.add(s);
		}
		
		public Socio buscarPorDni (String dni) {
			
			boolean encontrado = false;
			Socio s = null;
			
			for (int i = 0; i < listaSocios.size() && !encontrado ; i++) {
				
				if (listaSocios.get(i).getDni().equals(dni)) {
					
					s = listaSocios.get(i);
					
					encontrado = true;
				}
			}
			
			return s;
		}
		
		public void cambiarSocio (Socio s, String nombre, String apellidos, boolean veterano) {
			
			s.setNombre(nombre);
			s.setApellidos(apellidos);
			s.setVeterano(veterano);
			
		}
		
		public void eliminarSocio (Socio s) {
			
			listaSocios.remove(s);
		}
		
}
