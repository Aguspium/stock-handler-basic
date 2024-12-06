import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Utils.Utils;
import Inventario.Validar.Validar;

public class Deposito {
    public static void listaProductos() {
        if (!verificarListaVacia()) return;
        System.out.println("Lista de Productos ");
        for (Producto p : Utils.listaproductos) {
            int a = Utils.listaproductos.indexOf(p) + 1;
            System.out.println(a + ") " + p.getNombre());
        }
    }

    public static void eliminarProducto() {
        if (!verificarListaVacia()) return;
        Producto producto = seleccionarProducto();
            if(Validar.SiNo("Estas seguro de que deseas eliminar el producto? [Si/No]")) {
                Utils.listaproductos.remove(producto);
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
        System.out.println("1)nombre: " + producto.getNombre() +
                "\n2)cantidad: " + producto.getCantidad() +
                "\n3)precio: " + producto.getPrecio() +
                "\nid: " + producto.getId() +
                "\nvencimiento: " + producto.getVencimiento());

        switch (producto) {
            case Carnes carne -> System.out.println("6)grasa: " + carne.getCantidadgrasa() + "%" +
                        "\n7)proteínas: " + carne.getCantidadproteinas() + "g");
            case Fruta fruta -> System.out.println("6)agua: " + fruta.getCantidadagua() + "%" +
                        "\n7)azúcar: " + fruta.getCantidadazucar() + "g");
            case Lacteo lacteo -> System.out.println("6)agua: " + lacteo.getPorcentajeagua() + "%" +
                        "\n7)calcio: " + lacteo.getPorcentajecalcio() + "%" +
                        "\n8)Vegano: "+ lacteo.isVegano());
            default -> System.out.println("Tipo de producto no reconocido.");
        }
    }

    public static void editarProducto() {
        if (!verificarListaVacia()) return;
        Producto producto = seleccionarProducto();
        Editor.menuEditor(producto);

    }

    private static Boolean verificarListaVacia(){
        if (Utils.listaproductos.isEmpty()) {
            System.out.println("La lista de productos se encuentra vacía.");
            return false;
        }
        return true;
    }

    private static Producto seleccionarProducto() {
        listaProductos();
        while (true) {
            int eleccion = Validar.Int("Selecciona el producto:") - 1;
            if (eleccion >= 0 && eleccion < Utils.listaproductos.size()) {
                return Utils.listaproductos.get(eleccion);
            } else {
                System.err.println("Elección errónea.");
            }
        }
    }
}