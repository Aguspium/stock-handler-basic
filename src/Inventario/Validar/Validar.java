package Inventario.Validar;
import Inventario.Producto;
import java.util.InputMismatchException;
import static Inventario.Utils.Utils.listaproductos;
import static Inventario.Utils.Utils.sc;

public class Validar {

    public static int Int(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("\nError, ingresa un número.");
                sc.nextLine();
            }
        }
    }

    public static double Double(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("\nError, ingresa un número Ejemplo: [100,23].");
                sc.nextLine();
            }
        }
    }

    public static byte Byte(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextByte();
            } catch (InputMismatchException e) {
                System.err.println("\nError, ingresa un número.");
                sc.nextLine();
            }
        }
    }

    public static boolean SiNo(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            String eleccion = sc.next();
            if (eleccion.equalsIgnoreCase("si")) {
                return true;
            } else if (eleccion.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.err.println("\nOpción errónea, ingresa [Si/No].");
            }
        }
    }

    public static String Nombre(String mensaje) {
        boolean a;
        String nombre;
        do {
            System.out.println(mensaje);
            nombre = sc.next();
            a = true;
            for (Producto p : listaproductos) {
                if (nombre.equalsIgnoreCase(p.getNombre())) {
                    System.err.println("\nEste producto ya existe prueba con otro!");
                    a = false;
                    break;
                }
            }
        } while (!a);
        System.out.println("\nNombre " + nombre + " Agregado con Éxito!");
        return nombre;
    }
}