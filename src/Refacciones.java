
public class Refacciones {
	private String nombreRefaccionaria;
	private String ubicacion;
	private String tipoRefaccion;
	private float precioRefaccion;
	private int cantidad;
	private float precioCompra;

	public Refacciones() {
	}

	public Refacciones(String nombreRefaccionaria, String ubicacion, String tipoRefaccion, float precioRefaccion,
			int cantidad, float precioCompra) {
		this.nombreRefaccionaria = nombreRefaccionaria;
		this.ubicacion = ubicacion;
		this.tipoRefaccion = tipoRefaccion;
		this.precioRefaccion = precioRefaccion;
		this.cantidad = cantidad;
		this.precioCompra = precioCompra;
	}

	@Override
	public String toString() {
		return "Refacciones [nombreRefaccionaria=" + nombreRefaccionaria + ", ubicacion=" + ubicacion
				+ ", tipoRefaccion=" + tipoRefaccion + ", precioRefaccion=" + precioRefaccion + ", cantidad=" + cantidad
				+ ", precioCompra=" + precioCompra + "]\n";
	}

	public String getNombreRefaccionaria() {
		return nombreRefaccionaria;
	}

	public void setNombreRefaccionaria(String nombreRefaccionaria) {
		this.nombreRefaccionaria = nombreRefaccionaria;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoRefaccion() {
		return tipoRefaccion;
	}

	public void setTipoRefaccion(String tipoRefaccion) {
		this.tipoRefaccion = tipoRefaccion;
	}

	public float getPrecioRefaccion() {
		return precioRefaccion;
	}

	public void setPrecioRefaccion(float precioRefaccion) {
		this.precioRefaccion = precioRefaccion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

}
