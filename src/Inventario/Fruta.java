package Inventario;
import Inventario.Utils.Utils;

public class Fruta extends Producto{
    private String cantidadagua;
    private int cantidadazucar;

    public Fruta(String nombre, int cantidad, double costo, String cantidadagua, int cantidadazucar){
        super(nombre, cantidad, costo);
        this.cantidadagua = cantidadagua;
        this.cantidadazucar = cantidadazucar;
    }

    public String getCantidadagua() {
        return cantidadagua;
    }

    public void setCantidadagua(String cantidadagua) {
        this.cantidadagua = cantidadagua;
    }

    public int getCantidadazucar() {
        return cantidadazucar;
    }

    public void setCantidadazucar(int cantidadazucar) {
        this.cantidadazucar = cantidadazucar;
    }



    @Override
    public void Editor(Producto edit){
            Fruta frutas = (Fruta) edit;
            System.out.println("Que deseas Editar? ");
            System.out.println("1) Editar Nombre: "+ frutas.getNombre() );
            System.out.println("2) Editar Cantidad: "+ frutas.getCantidad() );
            System.out.println("3) Editar Precio: "+ frutas.getPrecio() );
            System.out.println("4) Editar Cantidad de Agua: " + frutas.getCantidadagua());
            System.out.println("5) Editar Cantidad de Azucar:"+ frutas.getCantidadazucar());
            int opcion = Utils.sc.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese el nuevo nombre: ");
                    String nombre = Utils.sc.next();
                    frutas.setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese la nueva cantidad: ");
                    int cantidad = Utils.sc.nextInt();
                    frutas.setCantidad(cantidad);
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo precio: ");
                    double precio = Utils.sc.nextDouble();
                    frutas.setPrecio(precio);
                    break;
                case 4:
                    System.out.println("Ingrese la nueva cantidad de agua: ");
                    String cantidadagua = Utils.sc.next();
                    frutas.setCantidadagua(cantidadagua);
                    break;
                case 5:
                    System.out.println("Ingrese la nueva cantidad de azucar: ");
                    int cantidadazucar = Utils.sc.nextInt();
                    frutas.setCantidadazucar(cantidadazucar);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        }

    }
