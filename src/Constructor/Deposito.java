package Constructor;

import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
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
        System.out.println("1) Nombre: " + producto.getNombre() +
                "\n2) Cantidad: " + producto.getCantidad() +
                "\n3) Precio: " + producto.getPrecio());

        switch (producto) {
            case Carnes carne -> System.out.println("4) Grasa: " + carne.getCantidadgrasa() + "%" +
                        "\n5) Proteínas: " + carne.getCantidadproteinas() + "g");
            case Fruta fruta -> System.out.println("4) Agua: " + fruta.getCantidadagua() + "%" +
                        "\n5) Azúcar: " + fruta.getCantidadazucar() + "g");
            case Lacteo lacteo -> System.out.println("4) Agua: " + lacteo.getPorcentajeagua() + "%" +
                        "\n5) Calcio: " + lacteo.getPorcentajecalcio() + "%" +
                        "\n6) Vegano: "+ lacteo.isVegano());
            default -> System.out.println("Tipo de producto no reconocido.");
        }
        System.out.println("\nId: " + producto.getId() +
                "\nVencimiento: " + producto.getVencimiento());
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
}