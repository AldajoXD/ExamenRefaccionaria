

public interface InterfaceRefaccionaria {
	public void guardar(Refacciones refaccion);

	public void editar(String nombre, Refacciones refaccion);

	public Refacciones buscar(String nombre);

	public void eliminar(String nombre);

	public void mostrar();

}
