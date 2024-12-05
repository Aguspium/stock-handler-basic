package Inventario;

import Inventario.Utils.Utils;

public class Lacteo extends Producto {
    private int porcentajeagua;
    private int porcentajecalcio;
    private boolean vegano;

    public Lacteo(String nombre, int cantidad, double costo, int porcentajeagua, int porcentajecalcio, boolean vegano){
        super(nombre, cantidad, costo);
        this.porcentajeagua = porcentajeagua;
        this.porcentajecalcio = porcentajecalcio;
        this.vegano = vegano;
    }

    public int getPorcentajecalcio() {
        return porcentajecalcio;
    }
    public void setPorcentajecalcio(int porcentajecalcio) {
        this.porcentajecalcio = porcentajecalcio;
    }

    public int getPorcentajeagua() {
        return porcentajeagua;
    }

    public void setPorcentajeagua(int porcentajeagua) {
        this.porcentajeagua = porcentajeagua;
    }

    public String isVegano() {
        String a;
        if(vegano){a = "si es vegano";}else{a = "no es vegano";}
        return a;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }



    @Override
    public void Editor(Producto edit){
        Lacteo lacteos = (Lacteo) edit;
            System.out.println("Que deseas Editar? ");
            System.out.println("1) Editar Nombre: "+ lacteos.getNombre() );
            System.out.println("2) Editar Cantidad: "+ lacteos.getCantidad() );
            System.out.println("3) Editar Precio: "+ lacteos.getPrecio() );
            System.out.println("4) Editar Cantidad de Agua: " + lacteos.getPorcentajeagua());
            System.out.println("5) Editar Cantidad de Calcio:"+ lacteos.getPorcentajecalcio());
            System.out.println("6) Editar Vegano: "+ lacteos.isVegano());
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
                    int cantidadagua = Utils.sc.nextInt();
                    lacteos.setPorcentajeagua(cantidadagua);
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo porsentaje de calcio: ");
                    int cantidadcalcio = Utils.sc.nextInt();
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
