package Inventario;

import Inventario.Utils.Utils;

import javax.swing.text.Style;

public class Lacteo extends Producto {
    private String porcentajeagua;
    private String porcentajecalcio;
    private boolean vegano;

    public Lacteo(String nombre, int cantidad, double costo, String porcentajeagua, String porcentajecalcio, boolean vegano){
        super(nombre, cantidad, costo);
        this.porcentajeagua = porcentajeagua;
        this.porcentajecalcio = porcentajecalcio;
        this.vegano = vegano;
    }

    public String getPorcentajecalcio() {
        return porcentajecalcio;
    }
    public void setPorcentajecalcio(String porcentajecalcio) {
        this.porcentajecalcio = porcentajecalcio;
    }

    public String getPorcentajeagua() {
        return porcentajeagua;
    }

    public void setPorcentajeagua(String porcentajeagua) {
        this.porcentajeagua = porcentajeagua;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    @Override
    public void Editor(Producto edit){
        if(edit instanceof Lacteo lacteos){
            System.out.println("Que deseas Editar? ");
            System.out.println("1) Editar Nombre: "+ lacteos.getNombre() );
            System.out.println("2) Editar Cantidad: "+ lacteos.getCantidad() );
            System.out.println("3) Editar Precio: "+ lacteos.getPrecio() );
            System.out.println("4) Editar Cantidad de Agua: " + lacteos.getPorcentajeagua());
            System.out.println("5) Editar Cantidad de Calcio:"+ lacteos.getPorcentajecalcio());
            String a = "";
            if(lacteos.isVegano()){a = "si es vegano";}else{a = "no es vegano";}
            System.out.println("6) Editar Vegano: "+ a );
            int opcion = Utils.sc.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese el nuevo nombre: ");
                    String nombre = Utils.sc.next();
                    lacteos.setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese la nueva cantidad: ");
                    int cantidad = Utils.sc.nextInt();
                    lacteos.setCantidad(cantidad);
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo precio: ");
                    double precio = Utils.sc.nextDouble();
                    lacteos.setPrecio(precio);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo porsentaje de agua: ");
                    String cantidadagua = Utils.sc.next();
                    lacteos.setPorcentajeagua(cantidadagua);
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo porsentaje de calcio: ");
                    String cantidadcalcio = Utils.sc.next();
                    lacteos.setPorcentajecalcio(cantidadcalcio);
                    break;
                case 6:
                    System.out.println("Es vegano si/no: ");
                    while (true) {
                        String eleccion = Utils.sc.next();
                        if (eleccion.equalsIgnoreCase("si")) {
                            lacteos.setVegano(true);
                            break;
                        } else if (eleccion.equalsIgnoreCase("no")) {
                            lacteos.setVegano(false);
                            break;
                        } else {
                            System.out.println("Opcion erronea debes elegir si/no");
                        }

                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
