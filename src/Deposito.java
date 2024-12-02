import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
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

    public static void verProducto(){

        Deposito.listaProductos();
        System.out.println("elige el producto para ver: ");
        int eleccion = Utils.sc.nextInt() - 1;

        Producto view = Utils.listaproductos.get(eleccion);
        System.out.println("nombre: "+view.getNombre());
        System.out.println("cantidad: "+view.getCantidad());
        System.out.println("precio" +view.getPrecio());
        System.out.println("id: " +view.getId());
        System.out.println("vencimiento: "+view.getVencimiento());

        if (view instanceof Carnes){
            System.out.println("grasa: "+((Carnes) view).getCantidadgrasa()+"%");
            System.out.println("proteinas"+((Carnes) view).getCantidadproteinas()+"g");

        }else if (view instanceof Fruta){
            System.out.println("agua: "+((Fruta) view).getCantidadagua()+"%");
            System.out.println("azucar: "+((Fruta) view).getCantidadazucar()+ "g");

        }else{ Lacteo lacteo = (Lacteo) view;

            System.out.println("agua: "+lacteo.getPorcentajeagua()+"%");

            System.out.println("calcio: "+lacteo.getPorcentajecalcio()+ "%");

        }

    }

}
