package libreria;

public class Alimentacion extends Producto implements AlimentacionInterfaz {

	private boolean refrigerado;

	@Override
	public boolean isRefrigerado() {
		return false;
	}

	@Override
	public void setRefrigerado(boolean refrigerado) {

	}

	public Alimentacion() {
	}

	public Alimentacion(long codigo, String nombre, boolean refrigerado) {
		super(codigo, nombre);
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "[" +  getCodigo() + "] " + "Alimento" + " - " + getDescripcion() + " - refrigerado: " + isRefrigerado();
	}
	
	

}
