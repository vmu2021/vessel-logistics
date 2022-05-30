package mde.es;

public class Menaje extends Producto implements MenajeInterfaz {

	private boolean reciclable;

	@Override
	public boolean isReciclable() {
		return reciclable;
	}

	@Override
	public void setReciclable(boolean reciclable) {
		this.reciclable = reciclable;
	}

	public Menaje() {
	}

	public Menaje(long id, String descripcion, double precio, boolean reciclable) {
		super(id, descripcion, precio);
		this.reciclable = reciclable;
	}

	
	
	
}
