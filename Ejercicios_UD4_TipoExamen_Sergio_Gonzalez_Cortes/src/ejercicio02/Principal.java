package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double porcentaje = 5, espadaDoble = 20;
		int tam = 4;

		Scanner s = new Scanner(System.in);
		
		Producto movil1 = new Movil (200, 1, "Xumino", 1, false, "Xiaomi", "Redmi 9");
		
		Producto movil2 = new Movil (400, 2, "Movi", 2, true, "NoseMovi", "Sisi");
		
		Producto espada1 = new EspadaLaser(600, 1, "Espada laser Xonxin", 3, true, "doble");
		
		Producto [] listaProductos = new Producto [tam];
		
		listaProductos[0] = movil1;
		listaProductos[1] = movil2;
		listaProductos[2] = espada1;
		
		Ventas v = new Ventas (listaProductos, 3);
		
		System.out.println(v.contarProductosPorVender());
		
		System.out.printf("%.2f\n",v.calcularTotalRecaudado(v.buscarProductosVendidos(), porcentaje, espadaDoble));
	}

}
