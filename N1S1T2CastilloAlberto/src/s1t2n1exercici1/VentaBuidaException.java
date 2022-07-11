package s1t2n1exercici1;


public class VentaBuidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public VentaBuidaException() {

		super("Para hacer una venta primero debes añadir productos");

	}
}