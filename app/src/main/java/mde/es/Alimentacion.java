package mde.es;

public class Alimentacion extends Producto implements AlimentacionInterfaz {

	private boolean refrigerado;

	@Override
	public boolean isRefrigerado() {
		return refrigerado;
	}

	@Override
	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	public Alimentacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alimentacion(long id, String descripcion, double precio, boolean refrigerado) {
		super(id, descripcion, precio);
		this.refrigerado = refrigerado;
	}
	
	
}
