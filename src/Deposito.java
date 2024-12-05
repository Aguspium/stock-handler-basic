import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Utils.Utils;

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
        String opcion = Utils.sc.next();
        if(opcion.equalsIgnoreCase("No")) {
            System.out.println("Eliminación de producto cancelada.");
            return false;
        }
        return true;
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

    private static void mostrarProducto(Producto producto) {
        System.out.println("nombre: " + producto.getNombre() +
                "\ncantidad: " + producto.getCantidad() +
                "\nprecio: " + producto.getPrecio() +
                "\nid: " + producto.getId() +
                "\nvencimiento: " + producto.getVencimiento());

        switch (producto) {
            case Carnes carne -> System.out.println("grasa: " + carne.getCantidadgrasa() + "%" +
                        "\nproteínas: " + carne.getCantidadproteinas() + "g");
            case Fruta fruta -> System.out.println("agua: " + fruta.getCantidadagua() + "%" +
                        "\nazúcar: " + fruta.getCantidadazucar() + "g");
            case Lacteo lacteo -> System.out.println("agua: " + lacteo.getPorcentajeagua() + "%" +
                        "\ncalcio: " + lacteo.getPorcentajecalcio() + "%");
            default -> System.out.println("Tipo de producto no reconocido.");
        }
    }

    public static void editarProducto() {
        if (!verificarListaVacia()) return;
        try {
            Producto producto = seleccionarProducto();
            producto.Editor(producto);
        } catch (InputMismatchException e) {
            opcioninvalida();
        }
    }

    // Separo código repetitivo.
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

    private static Producto seleccionarProducto(){
        listaProductos();
        System.out.println("Selecciona el producto: ");
        int eleccion = Utils.sc.nextInt() - 1;
        return Utils.listaproductos.get(eleccion);
    }
}
