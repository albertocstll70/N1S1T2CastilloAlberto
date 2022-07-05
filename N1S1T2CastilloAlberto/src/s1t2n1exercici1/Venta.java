package s1t2n1exercici1;

import java.util.ArrayList;

public class Venta {
	
	private float precioTotal;
	private ArrayList<Producto> listProducto = new ArrayList<Producto>();

	public Venta(ArrayList<Producto> listProducto) {

		this.listProducto = listProducto;
		this.precioTotal = calcularTotal();

	}

	public float calcularTotal(){
	int size = this.listProducto.size();
	float total =0;
	if(size <1) {
		VentaBuidaException  error = new VentaBuidaException("Para hacer una venta primero debes añadir productos") ;
		System.out.println(error.getMessage());
	}else {
	
	for(int i=0; i<size; i++) {
		
		
		total = total+listProducto.get(i).getPrecio();
	}
	
	
	}
		
	return total;	
		
}

	@Override
	public String toString() {
		return "Venta [precioTotal=" + precioTotal + ", listProducto=" + listProducto + "]";
	}


}
