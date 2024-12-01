import Inventario.Producto;
import Inventario.Utils.Utils;

public class Deposito {
    public static void listaProductos(){
        System.out.println("Lista de Productos ");
        for(int i = 0; i < Utils.listaproductos.size(); i++ ){
            Producto view = Utils.listaproductos.get(i);
            System.out.println(i + 1 +") "+ view.getNombre());

        }
    }

    public static void eliminarProducto(){
        Deposito.listaProductos();
        System.out.println("Selecciona el producto a eleminar: ");
        int eleccion = Utils.sc.nextInt() - 1;
        Producto producto = Utils.listaproductos.get(eleccion);
        System.out.println("Confirmas eliminar a: "+ producto.getNombre()+ " Si/No");
        String opcion = Utils.sc.next();
        if(opcion.equalsIgnoreCase("Si")){
            Utils.listaproductos.remove(eleccion);
            System.out.println("Eliminacion completada");
        }else{
            System.out.println("Eliminacion cancelada");
        }


    }

}
