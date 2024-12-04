import Inventario.Utils.Creador;
import Inventario.Utils.Utils;
import java.util.InputMismatchException;

public class Menu {

    public Menu() {
            while (true) {
            try {
                System.out.println("\nStock Handler");
                System.out.println("1) Lista de Productos");
                System.out.println("2) Añadir un Producto");
                System.out.println("3) Eliminar un Producto");
                System.out.println("4) Editar un Producto");
                System.out.println("5) Cerrar el Programa \n");

                int opcion = Utils.sc.nextInt();

                switch (opcion) {
                    case 1:
                        Deposito.verProducto();
                        break;
                    case 2:
                        new Creador();
                        break;
                    case 3:
                        Deposito.eliminarProducto();
                        break;
                    case 4:
                        Deposito.editarProducto();
                        break;
                    case 5:
                        System.out.println("Adios!");
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Solo se permiten números, seleccione nuevamente.");
                Utils.sc.nextLine();
            }
        }
    }
}
