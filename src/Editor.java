import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Utils.Utils;
import Inventario.Validar.Validar;

public class Editor {
    public Editor(Producto p) {
        Deposito.mostrarProducto(p);
        int opcion = Validar.Int("\nQue desea editar: ");
        if(opcion >= 1 && opcion <= 5){
            Basic(opcion, p);
        }

        switch (p) {
            case Carnes carne -> Carne(carne, opcion);
            case Fruta fruta -> Fruta(fruta, opcion);
            case Lacteo lacteo -> Lacteo(lacteo, opcion);
            default -> System.out.println("Tipo de producto no reconocido.");
        }
    }

    private static void Carne(Carnes carne, int opcion){
        switch (opcion){
            case 6 -> carne.setCantidadgrasa(Validar.Int("Ingresa el nuevo porcentaje de Grasa: "));
            case 7 -> carne.setCantidadproteinas(Validar.Int("Ingresa la nueva cantidad de Proteínas: "));
        }
    }

    public static void Fruta(Fruta fruta, int opcion){
        switch (opcion) {
            case 6 -> fruta.setCantidadagua(Validar.Int("Ingresa el nuevo porcentaje de Agua"));
            case 7 -> fruta.setCantidadazucar(Validar.Int("Ingresa la nueva cantidad de Azúcar: "));
        }
    }

    public static void Lacteo(Lacteo lacteo, int opcion) {
        switch (opcion) {
            case 6 -> lacteo.setPorcentajeagua(Validar.Int("Ingresa el nuevo porcentaje de Agua"));
            case 7 -> lacteo.setPorcentajecalcio(Validar.Int("Ingresa el nuevo porcentaje de Calcio "));
            case 8 -> lacteo.setVegano(Validar.SiNo("Es vegano? [si/no]: "));
        }
    }

    public static void Basic(int opcion, Producto p){

        switch(opcion){
            case 1 -> {System.out.println("Ingresa el nuevo Nombre: "); p.setNombre(Utils.sc.next());}
            case 2 -> p.setCantidad(Validar.Int("Ingresa la nueva Cantidad: "));
            case 3 -> p.setPrecio(Validar.Int("Ingresa el nuevo Precio: "));
            case 4 -> p.setId(Validar.Int("Ingresa la nueva Id: "));
            case 5 -> p.setVencimiento(Validar.Int("Ingresa el nuevo Vencimiento: "));
        }
    }
}


