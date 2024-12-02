package Inventario.Utils;
import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import java.awt.*;

public class Creador {

    public Creador(){
            System.out.println("Ingresa el tipo de producto: ");
            System.out.println("1) carne ");
            System.out.println("2) Fruta ");
            System.out.println("3) Lacteo ");
            int tipo = Utils.sc.nextInt();
            agregarProducto(tipo);
    }

    public void agregarProducto(int tipo){
        String porsentaje;
        int cantidadGramos;

        System.out.println("Ingresa el nombre del producto");
        String nombre = Utils.sc.next();
        System.out.println("Ingresa la cantidad del producto");
        int cantidad = Utils.sc.nextInt();
        System.out.println("Ingresa el costo del producto");
        double costo = Utils.sc.nextDouble();

        switch (tipo){
            case 1: //Carnes
            System.out.println("Ingresa el % de grasa del producto del producto");
                porsentaje = Utils.sc.next();
            System.out.println("Ingresa la cantidad de proteinas del producto");
                cantidadGramos = Utils.sc.nextInt();
                Producto carnes = new Carnes(nombre, cantidad, costo, porsentaje, cantidadGramos);
            carnes.generadorPrecio();
            carnes.generadorId();
            Utils.listaproductos.add(carnes);

                break;
            case 2: //Fruta
                System.out.println("Ingresa la cantidad de Gramos de azucar del producto");
                cantidadGramos = Utils.sc.nextInt();
                System.out.println("Ingresa la cantidad de agua del producto");
                porsentaje = Utils.sc.next();
                Producto fruta = new Fruta(nombre, cantidad, costo, porsentaje, cantidadGramos);
                fruta.generadorPrecio();
                fruta.generadorId();
                Utils.listaproductos.add(fruta);
                new Menu();

                break;
            case 3: //Lacteos
                System.out.println("Ingresa el % de Agua del producto del Lacteo");
                porsentaje = Utils.sc.next();
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

                Producto lacteo = new Lacteo(nombre, cantidad, costo, porsentaje, porsentaje2, vegano);
                lacteo.generadorPrecio();
                lacteo.generadorId();

                Utils.listaproductos.add(lacteo);
                break;
            default:
                System.out.println("Opcion no valida");

        }
    }
}
