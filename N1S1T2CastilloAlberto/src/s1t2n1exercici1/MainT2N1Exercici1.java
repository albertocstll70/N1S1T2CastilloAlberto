package s1t2n1exercici1;

import java.util.ArrayList;

public class MainT2N1Exercici1 {

	public static void main(String[] args) throws VentaBuidaException {

		Producto p1 = new Producto(" TV", 650);
		Producto p2 = new Producto(" Ordenador", 1560);
		Producto p3 = new Producto(" Lavadora", 870);

		ArrayList<Producto> listProducto = new ArrayList<Producto>();
		listProducto.add(p1);
		listProducto.add(p2);
		listProducto.add(p3);

		ArrayList<Producto> listProductoVacio = new ArrayList<Producto>();

		Venta compra = new Venta(listProductoVacio);

		// Venta compra = new Venta(listProducto);

		// System.out.println(compra);

		/*
		 * Escribe el código necesario para generar y capturar una excepción de tipo
		 * ArrayIndexOutOfBoundsException.
		 */

		try {
			listProducto.get(3);
		} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());

		}

	}

}
