import Inventario.Utils.Creador;
import Inventario.Utils.Utils;

public class Menu {

    public Menu(){

    while (true){
        System.out.println("Stock Handler");

        System.out.println("1) Lista de Productos");
        System.out.println("2) Añadir un Producto");
        System.out.println("3) Eliminar un Producto");
        System.out.println("4) Editar un Producto");

        int opcion = Utils.sc.nextInt();

        switch (opcion){
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
            default:

                System.out.println("Opcion no valida");
                break;
        }

    }

    }
}
