package Inventario.Utils;
import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Validar.Validar;
import java.util.InputMismatchException;

public class Creador {

    public Creador() {
        while (true) {
            System.out.println("""
                    Ingresa el tipo de producto:
                    1) Carne
                    2) Fruta
                    3) Lácteo
                    4) Volver al menu""");
            int tipo = Validar.Int("");

            if (tipo >= 1 && tipo <= 3) {
                agregarProducto(tipo);
                break;
            } else if (tipo == 4) {
                break;
            }else {
                    System.err.println("Opción inválida.");
                }
            }
        }

    public void agregarProducto(int tipo) {
        try {
            String nombre = Validar.Nombre();
            int cantidad = Validar.Int("\nIngresa la cantidad del producto: ");
            double costo = Validar.Double("\nIngresa el costo del producto");
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
                    System.err.println("\nOpción no válida.");
            }
            if (producto != null) {
                producto.generadorPrecio();
                Producto.generateId();
                Utils.listaproductos.add(producto);
                System.out.println("\nProducto agregado exitosamente.");
            }
        } catch (InputMismatchException e) {
            System.err.println("\nDato ingresado no valido");
            Utils.sc.nextLine();
        }
    }

    private Producto crearCarne(String nombre, int cantidad, double costo) {
        int cantidadGrasa = Validar.Int("\nIngresa el porcentaje de grasa: ");
        int cantidadProteina = Validar.Int("\nIngresa la cantidad de proteínas: ");
        return new Carnes(nombre, cantidad, costo, cantidadGrasa, cantidadProteina);
    }

    private Producto crearFruta(String nombre, int cantidad, double costo) {
        int cantidadAzucar = Validar.Int("\nIngresa la cantidad de azúcar: ");
        int cantidadAgua = Validar.Int("\nIngresa el porcentaje de agua: ");
        return new Fruta(nombre, cantidad, costo, cantidadAgua, cantidadAzucar);
    }

    private Producto crearLacteo(String nombre, int cantidad, double costo) {
        int cantidadAgua = Validar.Int("\nIngresa el porcentaje de agua: ");
        int cantidadCalcio = Validar.Int("\nIngresa el porcentaje de calcio: ");
        boolean vegano = Validar.SiNo("\n¿El lácteo es vegano? [Si/No]:");
        return new Lacteo(nombre, cantidad, costo, cantidadAgua, cantidadCalcio, vegano);
    }
}