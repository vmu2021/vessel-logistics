package mde.es;

public class Producto {

	private long id;
	private String descripcion;
	private double precio;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto() {
	}
	public Producto(long id, String descripcion, double precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	
}
