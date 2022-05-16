package libreria;

public abstract class Producto {

	private long codigo;
	private String descripcion;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Producto() {
	};

	public Producto(long codigo, String nombre) {
		this.descripcion = nombre;
		this.codigo = codigo;
	}

}