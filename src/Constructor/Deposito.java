package Constructor;
import Inventario.Producto;
import static Inventario.Utils.Utils.listaproductos;
import Inventario.Validar.Validar;

public class Deposito {
    public static void listaProductos() {
        if (!verificarListaVacia()) return;
        System.out.println("Lista de Productos ");
        for (Producto p : listaproductos) {
            int a = listaproductos.indexOf(p) + 1;
            System.out.println(a + ") " + p.getNombre());

            if (p.verificarVencimiento()) {
                System.out.println("El producto " + p.getNombre() + " está vencido.");
            }
        }
    }

    public static void eliminarProducto() {
        if (!verificarListaVacia()) return;
        Producto producto = seleccionarProducto();
            if(Validar.SiNo("Estas seguro de que deseas eliminar el producto? [Si/No]")) {
                listaproductos.remove(producto);
                System.out.println("Eliminación de producto completada.");
            } else{
                System.out.println("Eliminación de producto cancelada.");
        }
    }

    public static void verProducto() {
        if (!verificarListaVacia()) return;
        Producto producto = seleccionarProducto();
        mostrarProducto(producto);
    }
    public static void mostrarProducto(Producto producto) {
        System.out.println(producto);
    }

    public static void editarProducto() {
        if (!verificarListaVacia()) return;
        Producto producto = seleccionarProducto();
        Editor.menuEditor(producto);
    }

    private static Boolean verificarListaVacia(){
        if (listaproductos.isEmpty()) {
            System.out.println("La lista de productos se encuentra vacía.");
            return false;
        }
        return true;
    }

    private static Producto seleccionarProducto() {
        listaProductos();
        while (true) {
            int eleccion = Validar.Int("Selecciona el producto:") - 1;
            if (eleccion >= 0 && eleccion < listaproductos.size()) {
                return listaproductos.get(eleccion);
            } else {
                System.err.println("Elección errónea.");
            }
        }
    }
    public static void calcularDescuento(){
        if(!verificarListaVacia()) return;
        System.out.println("Selecciona el producto a calcular");
        Producto p = seleccionarProducto();
        double descuento = p.calcularDescuento(Validar.Double("Ingresa el % de descuento:"));
        System.out.println( "descuento: "+descuento+
                            "\nprecio con descuento: "+ (p.getPrecio() - descuento)+
                            "\nprecio sin decuento: "+ p.getPrecio());

        if(Validar.SiNo("Aplicar descuento? [Si/No]")){
            p.setPrecio(p.getPrecio() - descuento);
            p.setDescuento(descuento);
        }else{
            System.out.println("Descuento no aplicado.");
        }
    }
}