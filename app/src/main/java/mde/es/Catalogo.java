package mde.es;

public class Catalogo {

	private long id;
	private String descripcion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Catalogo() {
	}

	public Catalogo(long id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

}
