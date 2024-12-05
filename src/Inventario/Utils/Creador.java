package Inventario.Utils;
import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import java.util.InputMismatchException;

public class Creador {

    public Creador() {
        while (true) {
                System.out.println("Ingresa el tipo de producto: ");
                System.out.println("1) Carne");
                System.out.println("2) Fruta");
                System.out.println("3) Lácteo");
                int tipo = validarInt("");

                if (tipo >= 1 && tipo <= 3) {
                    agregarProducto(tipo);
                    break;
                } else {
                    System.out.println("Opción inválida.");
                }

            }
        }

    public void agregarProducto(int tipo) {
        try {
            System.out.println("Ingresa el nombre del producto:");
            String nombre = Utils.sc.next();
            System.out.println("Ingresa la cantidad del producto:");
            int cantidad = Utils.sc.nextInt();
            System.out.println("Ingresa el costo del producto:");
            double costo = Utils.sc.nextDouble();

            Producto producto = null;

            switch (tipo) {
                case 1: // Carnes
                    producto = crearCarne(nombre, cantidad, costo);
                    break;
                case 2: // Frutas
                    producto = crearFruta(nombre, cantidad, costo);
                    break;
                case 3: // Lácteos
                    producto = crearLacteo(nombre, cantidad, costo);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (producto != null) {
                producto.generadorPrecio();
                Producto.generateId();
                Utils.listaproductos.add(producto);
                System.out.println("Producto agregado exitosamente.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Dato ingresado no valido");
            Utils.sc.nextLine();
        }
    }

    private Producto crearCarne(String nombre, int cantidad, double costo) {
        int cantidadGrasa = validarInt("Ingresa el porcentaje de grasa: ");
        int cantidadProteina = validarInt("Ingresa la cantidad de proteínas: ");
        return new Carnes(nombre, cantidad, costo, cantidadGrasa, cantidadProteina);
    }

    private Producto crearFruta(String nombre, int cantidad, double costo) {
        int cantidadAzucar = validarInt("Ingresa la cantidad de azúcar: ");
        int cantidadAgua = validarInt("Ingresa el porcentaje de agua: ");
        return new Fruta(nombre, cantidad, costo, cantidadAgua, cantidadAzucar);
    }

    private Producto crearLacteo(String nombre, int cantidad, double costo) {
        int cantidadAgua = validarInt("Ingresa el porcentaje de agua: ");
        int cantidadCalcio = validarInt("Ingresa el porcentaje de calcio: ");
        boolean vegano = validarOpcionSiNo("¿El lácteo es vegano? [Si/No]:");
        return new Lacteo(nombre, cantidad, costo, cantidadAgua, cantidadCalcio, vegano);
    }

    private boolean validarOpcionSiNo(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String eleccion = Utils.sc.next();
            if (eleccion.equalsIgnoreCase("si")) {
                return true;
            } else if (eleccion.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Opción errónea, ingresa [Si/No].");
            }
        }
    }

    private int validarInt(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return Utils.sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error, ingresa un número.");
                Utils.sc.nextLine();
            }
        }
    }
}