import Inventario.Producto;
import Inventario.Utils.Utils;

public class Deposito {
    public Deposito(){
        System.out.println("Lista de Productos ");
        for(int i = 0; i < Utils.listaproductos.size(); i++ ){
            Producto view = Utils.listaproductos.get(i);
            System.out.println(i + 1 +") "+ view.getNombre());

        }
    }
}
