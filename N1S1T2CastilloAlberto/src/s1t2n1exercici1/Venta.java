package s1t2n1exercici1;

import java.util.ArrayList;

public class Venta {

	private float precioTotal;
	private ArrayList<Producto> listProducto = new ArrayList<Producto>();

	public Venta(ArrayList<Producto> listProducto) {

		this.listProducto = listProducto;
		this.precioTotal = calcularTotal();

	}

	public float calcularTotal() {

		int size = this.listProducto.size();
		float total = 0;

		if (size > 0) {

			for (int i = 0; i < size; i++) {

				total = total + listProducto.get(i).getPrecio();
			}

			return total;
		} else {
			try {

				throw new VentaBuidaException();
			} catch (VentaBuidaException e) {

				System.err.println(e.getMessage());

			}

			return 0;

		}

	}

	@Override
	public String toString() {
		return "Venta [precioTotal=" + precioTotal + ", listProducto=" + listProducto + "]";
	}

}
