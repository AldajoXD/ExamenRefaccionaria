import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRefacciones {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreRefaccionaria;
		String ubicacion;
		String tipoRefaccion;
		float precioRefaccion;
		int cantidad;
		float precioCompra;
		float ganancias;

		Scanner lectura = null;

		List<Refacciones> listaRefacciones = new ArrayList<Refacciones>();

		int menuP, menuEdicion, indice;

		Refacciones refaccion = null;
		ImplementacionRefacciones imp = new ImplementacionRefacciones();

		do {
			System.out.println("================ MENU REFACCIONARIAS ================");
			System.out.println("====> (1) GUARDAR REFACCIONARIA");
			System.out.println("====> (2) EDITAR REFACCIONARIA POR NOMBRE");
			System.out.println("====> (3) ELIMINAR REFACCIONARIA POR NOMBRE");
			System.out.println("====> (4) BUSCAR REFACCIONARIA POR NOMBRE");
			System.out.println("====> (5) MOSTRAR REFACCIONARIAS");
			System.out.println("====> (6) GANACIA DE LA REFACCIONARIA POR NOMBRE");
			System.out.println("====> (7) SALIR DEL PROGRAMA");
			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				System.out.println("Ingrese el nombre de la refaccionaria");
				lectura = new Scanner(System.in);
				nombreRefaccionaria = lectura.nextLine();

				System.out.println("Ingrese la ubicacion de la refaccionaria");
				lectura = new Scanner(System.in);
				ubicacion = lectura.nextLine();

				System.out.println("Ingrese el tipo de refaccion");
				lectura = new Scanner(System.in);
				tipoRefaccion = lectura.nextLine();

				System.out.println("Ingrese el precio de la refaccion");
				lectura = new Scanner(System.in);
				precioRefaccion = lectura.nextFloat();

				System.out.println("Ingrese la cantidad");
				lectura = new Scanner(System.in);
				cantidad = lectura.nextInt();

				System.out.println("Ingrese el precio de compra");
				lectura = new Scanner(System.in);
				precioCompra = lectura.nextFloat();

				refaccion = new Refacciones(nombreRefaccionaria, ubicacion, tipoRefaccion, precioRefaccion, cantidad,
						precioCompra);

				imp.guardar(refaccion);

				break;
			case 2:
				imp.mostrarIndice();
				System.out.println("Ingrese el nombre de la refaccionaria a buscar");
				lectura = new Scanner(System.in);
				nombreRefaccionaria = lectura.nextLine();

				refaccion = (Refacciones) imp.buscar(nombreRefaccionaria);
				if (refaccion != null) {
					System.out.println("Ingrese el nuevo nombre de la refaccionaria");
					lectura = new Scanner(System.in);
					nombreRefaccionaria = lectura.nextLine();
					refaccion.setNombreRefaccionaria(nombreRefaccionaria);

					imp.editar(nombreRefaccionaria, refaccion);
				} else {
					System.out.println("Por ende no puedes editar. Ingresa un nombre de refaccionaria existente");
				}
				break;
			case 3:
				imp.mostrarIndice();
				System.out.println("Ingrese el nombre de la refaccionaria a Eliminar");
				lectura = new Scanner(System.in);
				nombreRefaccionaria = lectura.nextLine();

				imp.eliminar(nombreRefaccionaria);
				break;
			case 4:
				imp.mostrarIndice();
				System.out.println("Ingrese el nombre de la refaccionaria a Buscar");
				lectura = new Scanner(System.in);
				nombreRefaccionaria = lectura.nextLine();
				imp.buscar(nombreRefaccionaria);

				break;
			case 5:
				imp.mostrar();
				break;
			case 6:
				imp.mostrarIndice();
				System.out.println("Ingrese el nombre de la refaccionaria para visualizar las ganancias");
				lectura = new Scanner(System.in);
				nombreRefaccionaria = lectura.nextLine();
				imp.compra(nombreRefaccionaria);
				break;

			case 7:
				System.out.println("Saliendo.....");
				lectura.close();
				break;

			default:
				System.out.println("Elige una opcion del 1 al 7");
				break;
			}

		} while (menuP != 7);

	}

}
