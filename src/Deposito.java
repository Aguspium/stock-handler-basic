import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Utils.Utils;
import Inventario.Validar.Validar;
import java.util.InputMismatchException;

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
        try {
            Producto producto = seleccionarProducto();
            if(confirmarAccion()) {
                Utils.listaproductos.remove(producto);
                System.out.println("Eliminación de producto completada.");
            }
        } catch (InputMismatchException e) {
            opcioninvalida();
        }
    }

    private static Boolean confirmarAccion() {
        System.out.println("¿Estás seguro de que deseas eliminar el producto? (Si/No)");
        while(true){
        String opcion = Utils.sc.next();
            if(opcion.equalsIgnoreCase("No")) {
                System.out.println("Eliminación de producto cancelada.");
                return false;
            } else if(opcion.equalsIgnoreCase("si")){
                    return true; }
            System.out.println("Opcion incorrecta solo ingresar [si/no]");
        }
    }

    public static void verProducto() {
        if (!verificarListaVacia()) return;
        try {
            Producto producto = seleccionarProducto();
            mostrarProducto(producto);
        } catch (InputMismatchException e) {
            opcioninvalida();
        }
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
        try {
            Producto producto = seleccionarProducto();
           Editor.menuEditor(producto);
        } catch (InputMismatchException e) {
            opcioninvalida();
        }
    }

    private static void opcioninvalida(){
        System.out.println("Opción inválida. Solo se permiten números.");
        Utils.sc.nextLine();
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