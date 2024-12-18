import Constructor.Creador;
import Constructor.Deposito;
import Inventario.Validar.Validar;

public class Menu {
    public Menu() {


       while (true) {
            System.out.println("""
                --- Stock Handler ---
                
                1) Lista de Productos
                2) Añadir un Producto
                3) Eliminar un Producto
                4) Editar un Producto
                5) Cerrar el Programa
                """);

            switch (Validar.Byte("Selecciona una opcion: ")) {
                case 1 -> Deposito.verProducto();
                case 2 -> new Creador();
                case 3 -> Deposito.eliminarProducto();
                case 4 -> Deposito.editarProducto();
                case 5 -> {System.out.println("Adios!");
                            System.exit(0);}
                default -> System.out.println("Opción inválida");
            }
        }
    }
}