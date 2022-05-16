package libreria;

public class Menaje extends Producto implements MenajeInterfaz {

	boolean reciclable;

	@Override
	public boolean isReciclable() {
		return false;
	}

	@Override
	public void setReciclable(boolean reciclable) {

	}

	public Menaje() {
	}

	public Menaje(long codigo, String nombre, boolean reciclable) {
		super(codigo, nombre);
		this.reciclable = reciclable;
	}
	
	@Override
	public String toString() {
		return "[" +  getCodigo() + "] " + "Menaje" + " - " + getDescripcion() + " - reciclable: " + isReciclable();
	}
}
