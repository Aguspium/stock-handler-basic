package Inventario;
import Inventario.Utils.Utils;

public class Carnes extends Producto {
    private int cantidadgrasa;
    private int cantidadproteinas;

    public Carnes(String nombre, int cantidad, double costo, int cantidadgrasa, int cantidadproteinas ){
        super(nombre, cantidad, costo);
        this.cantidadgrasa = cantidadgrasa;
        this.cantidadproteinas = cantidadproteinas;
    }
    public int getCantidadproteinas() {
        return cantidadproteinas;
    }

    public void setCantidadproteinas(int cantidadproteinas) {
        this.cantidadproteinas = cantidadproteinas;
    }

    public int getCantidadgrasa() {
        return cantidadgrasa;
    }

    public void setCantidadgrasa(int cantidadgrasa) {
        this.cantidadgrasa = cantidadgrasa;
    }

    @Override
    public void Editor(Producto edit){
            Carnes carnes = (Carnes) edit;
            System.out.println("Que deseas Editar? ");
            System.out.println("1) Editar Nombre: "+ carnes.getNombre() );
            System.out.println("2) Editar Cantidad: "+ carnes.getCantidad() );
            System.out.println("3) Editar Precio: "+ carnes.getPrecio() );
            System.out.println("4) Editar Cantidad de Grasa: " + carnes.getCantidadgrasa());
            System.out.println("5) Editar Cantidad de Proteinas:"+ carnes.getCantidadproteinas());
            int opcion = Utils.sc.nextInt();

            switch (opcion)
                {
                case 1:
                    System.out.println("Ingrese el nuevo nombre: ");
                    String nombre = Utils.sc.next();
                    carnes.setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese la nueva cantidad: ");
                    int cantidad = Utils.sc.nextInt();
                    carnes.setCantidad(cantidad);
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo precio: ");
                    double precio = Utils.sc.nextDouble();
                    carnes.setPrecio(precio);
                    break;
                case 4:
                    System.out.println("Ingrese la nueva cantidad de grasa: ");
                    int cantidadgrasa = Utils.sc.nextInt();
                    carnes.setCantidadgrasa(cantidadgrasa);
                    break;
                case 5:
                    System.out.println("Ingrese la nueva cantidad de proteinas: ");
                    int cantidadproteinas = Utils.sc.nextInt();
                    carnes.setCantidadproteinas(cantidadproteinas);
                    break;

                    default:
                        System.out.println("Opcion no valida");
                        break;

        }
    }
}
