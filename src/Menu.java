import Inventario.Utils.Utils;

public class Menu {

    public Menu(){

        System.out.println("Stock Handler");

        System.out.println("1) Lista de Productos");
        System.out.println("2) Añadir un Producto");
        System.out.println("3) Eliminar un Producto");

        int opcion = Utils.sc.nextInt();

        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}
