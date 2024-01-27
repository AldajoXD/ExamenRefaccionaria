import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImplementacionRefacciones implements InterfaceRefaccionaria {
	List<Refacciones> lista = new ArrayList<Refacciones>();

	@Override
	public void guardar(Refacciones refaccion) {
		// TODO Auto-generated method stub
		boolean iguales = false;
		for (Refacciones r : lista) {
			if (r.getNombreRefaccionaria().equals(refaccion.getNombreRefaccionaria())) {
				iguales = true;
			}
		}
		if (iguales == true) {
			System.out.println("La refaccionaria ya existe");
		} else {
			lista.add(refaccion);
			System.out.println("Se guardo correctamente la refaccionaria");
		}
	}

	@Override
	public Refacciones buscar(String nombre) {
		// TODO Auto-generated method stub
		boolean encontrado = false;
		List<Refacciones> listaRefacciones = new ArrayList<Refacciones>();
		Refacciones refaccion = null;

		for (Refacciones r : lista) {
			if (r.getNombreRefaccionaria().equals(nombre)) {
				encontrado = true;
				listaRefacciones.add(r);
				refaccion = r;
			}
		}
		if (encontrado) {
			System.out.println("Se encontro la refaccionaria con nombre " + refaccion.getNombreRefaccionaria()
					+ " se encuentra ubicada en " + refaccion.getUbicacion());
		} else {
			System.out.println("No se encuentra o no esta registrada la refaccionaria");
		}
		return refaccion;

	}

	@Override
	public void eliminar(String nombre) {
		Iterator<Refacciones> iter = lista.iterator();
		boolean encontrado = false;
		while (iter.hasNext()) {
			Refacciones r = iter.next();
			if (r.getNombreRefaccionaria().equals(nombre)) {
				iter.remove();
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Se eliminó correctamente");
		} else {
			System.out.println("No se puede eliminar ya que no existe la refaccionaria");
		}
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("LISTA DE REGISTRO");
		for (Refacciones rs : lista) {
			if (!lista.isEmpty()) {

				System.out.println("Nombre: " + rs.getNombreRefaccionaria() + " Ubicacion: " + rs.getUbicacion());
			} else {
				System.out.println("No hay ningun registro por el momento, regrese pronto");
			}
		}

	}

	public void mostrarIndice() {
		for (int i = 0; i < lista.size(); i++) {
			Refacciones r = lista.get(i);
			System.out.println("[" + i + "]" + r.getNombreRefaccionaria());
		}
	}

	@Override
	public void editar(String nombre, Refacciones refaccion) {
		// TODO Auto-generated method stub
		boolean encontrado = false;
		for (Refacciones r : lista) {
			if (r.getNombreRefaccionaria().equals(nombre)) {
				encontrado = true;
			}
		}

		if (encontrado) {
			refaccion.setNombreRefaccionaria(nombre);
			System.out.println("Se edito correctamente el nombre de la refaccionaria");
		}
	}

	public void compra(String nombre) {
		boolean encontrado = false;
		System.out.println("La ganacia es ===> ( cantidad de refacciones X el precio de compra )\n");
		for (Refacciones r : lista) {
			if (r.getNombreRefaccionaria().equals(nombre)) {
				encontrado = true;
				float ganancia = r.getCantidad() * r.getPrecioCompra();
				System.out
						.println("La ganacia de la refaccionaria " + r.getNombreRefaccionaria() + " es de " + ganancia);
			}

		}
		if (!encontrado) {
			System.out.println("No se encuentra esta refaccionaria");
		}
	}

}
