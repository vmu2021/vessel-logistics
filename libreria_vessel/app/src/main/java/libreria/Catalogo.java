package libreria;

import java.util.Collection;

public class Catalogo {

	private long codigo;
	private String nombreCatalogo;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return nombreCatalogo;
	}

	public void setDescripcion(String descripcion) {
		this.nombreCatalogo = descripcion;
	}

	public Catalogo() {
	}

	public Catalogo(long codigo, String descripcion, Collection<Producto> catalogo) {
		this.codigo = codigo;
		this.nombreCatalogo = descripcion;
	}

}