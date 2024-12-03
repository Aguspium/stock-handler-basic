import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Utils.Utils;

import java.util.InputMismatchException;

public class Deposito {
    public static void listaProductos() {
        if (Utils.listaproductos.isEmpty()) {
            System.out.println("Lista de Productos Vacia ");
        } else {
            System.out.println("Lista de Productos ");
            for (Producto p : Utils.listaproductos) {
                int a = Utils.listaproductos.indexOf(p) + 1;
                System.out.println(a + ") " + p.getNombre());
            }
        }
    }

    public static void eliminarProducto() {
        if (Utils.listaproductos.isEmpty()) {
            System.out.println("Lista de Productos Vacia ");

        } else {
            try {
                listaProductos();
                System.out.println("Selecciona el producto a eleminar: ");
                int eleccion = Utils.sc.nextInt() - 1;
                Producto producto = Utils.listaproductos.get(eleccion);
                System.out.println("Confirmas eliminar a: " + producto.getNombre() + " Si/No");
                String opcion = Utils.sc.next();
                if (opcion.equalsIgnoreCase("Si")) {
                    Utils.listaproductos.remove(eleccion);
                    System.out.println("Eliminacion completada");
                } else {
                    System.out.println("Eliminacion cancelada");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida");
                Utils.sc.nextLine();
            }
        }
    }

    public static void verProducto() {
        if (Utils.listaproductos.isEmpty()) {
            System.out.println("Lista de Productos Vacia ");

        } else {

            try {
                listaProductos();
                System.out.println("elige el producto para ver: ");
                int eleccion = Utils.sc.nextInt() - 1;

                Producto view = Utils.listaproductos.get(eleccion);
                System.out.println("nombre: " + view.getNombre());
                System.out.println("cantidad: " + view.getCantidad());
                System.out.println("precio" + view.getPrecio());
                System.out.println("id: " + view.getId());
                System.out.println("vencimiento: " + view.getVencimiento());

                if (view instanceof Carnes) {
                    System.out.println("grasa: " + ((Carnes) view).getCantidadgrasa() + "%");
                    System.out.println("proteinas: " + ((Carnes) view).getCantidadproteinas() + "g");

                } else if (view instanceof Fruta) {
                    System.out.println("agua: " + ((Fruta) view).getCantidadagua() + "%");
                    System.out.println("azucar: " + ((Fruta) view).getCantidadazucar() + "g");

                } else {
                    Lacteo lacteo = (Lacteo) view;

                    System.out.println("agua: " + lacteo.getPorcentajeagua() + "%");

                    System.out.println("calcio: " + lacteo.getPorcentajecalcio() + "%");

                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida");
                Utils.sc.nextLine();
            }
        }
    }

    public static void editarProducto() {
        if (Utils.listaproductos.isEmpty()) {
            System.out.println("Lista de Productos Vacia ");

        } else {
            try {
                listaProductos();
                System.out.println("Elige el producto a editar");
                int eleccion = Utils.sc.nextInt() - 1;

                Producto producto = Utils.listaproductos.get(eleccion);
                producto.Editor(producto);
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida Solo numeros");
                Utils.sc.nextLine();
            }
        }
    }
}
