package Inventario.Utils;
import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import java.awt.*;
import java.util.InputMismatchException;

public class Creador {

    public Creador() {
        try {
            System.out.println("Ingresa el tipo de producto: ");
            System.out.println("1) carne ");
            System.out.println("2) Fruta ");
            System.out.println("3) Lacteo ");
            int tipo = Utils.sc.nextInt();
            if (tipo == 1 || tipo == 2 || tipo == 3) {
                agregarProducto(tipo);
            } else {
                System.out.println("Opción invalida");
            }
        } catch (InputMismatchException e) {
            System.out.println("Opción inválida");
            Utils.sc.nextLine();
        }
    }

    public void agregarProducto(int tipo) {
        String porCentaje;
        int cantidadGramos;
        try {
            System.out.println("Ingresa el nombre del producto");
            String nombre = Utils.sc.next();
            System.out.println("Ingresa la cantidad del producto");
            int cantidad = Utils.sc.nextInt();
            System.out.println("Ingresa el costo del producto");
            double costo = Utils.sc.nextDouble();

            switch (tipo) {
                case 1: //Carnes
                    System.out.println("Ingresa el % de grasa del producto del producto");
                    porCentaje = Utils.sc.next();
                    System.out.println("Ingresa la cantidad de proteinas del producto");
                    cantidadGramos = Utils.sc.nextInt();
                    Producto carnes = new Carnes(nombre, cantidad, costo, porCentaje, cantidadGramos);
                    carnes.generadorPrecio();
                    Producto.generateId();
                    Utils.listaproductos.add(carnes);

                    break;
                case 2: //Fruta
                    System.out.println("Ingresa la cantidad de Gramos de azucar del producto");
                    cantidadGramos = Utils.sc.nextInt();
                    System.out.println("Ingresa la cantidad de agua del producto");
                    porCentaje = Utils.sc.next();
                    Producto fruta = new Fruta(nombre, cantidad, costo, porCentaje, cantidadGramos);
                    fruta.generadorPrecio();
                    Producto.generateId();
                    Utils.listaproductos.add(fruta);
                    new Menu();

                    break;
                case 3: //Lacteos
                    System.out.println("Ingresa el % de Agua del producto del Lacteo");
                    porCentaje = Utils.sc.next();
                    System.out.println("Ingresa el % de Calcio del producto");
                    String porsentaje2 = Utils.sc.next();
                    System.out.println("El producto es vegano? si/no");
                    boolean vegano;

                    while (true) {

                        String eleccion = Utils.sc.next();
                        if (eleccion.equalsIgnoreCase("si")) {
                            vegano = true;
                            break;
                        } else if (eleccion.equalsIgnoreCase("no")) {
                            vegano = false;
                            break;
                        } else {
                            System.out.println("Opcion erronea");
                        }
                    }

                    Producto lacteo = new Lacteo(nombre, cantidad, costo, porCentaje, porsentaje2, vegano);
                    lacteo.generadorPrecio();
                    Producto.generateId();

                    Utils.listaproductos.add(lacteo);
                    break;
                default:
                    System.out.println("Opcion no valida");


            }
        }catch (InputMismatchException e) {
            System.out.println("Opcion no valida");
            Utils.sc.nextLine();
        }
    }
}
