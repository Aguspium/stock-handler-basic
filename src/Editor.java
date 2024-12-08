import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Utils.Utils;
import Inventario.Validar.Validar;

public class Editor {

    public static void menuEditor(Producto p) {
        Deposito.mostrarProducto(p);
        int opcion = Validar.Int("\nQue desea editar: ");
        if(opcion >= 1 && opcion < 5){
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
            case 4 -> carne.setCantidadgrasa(Validar.Int("Ingresa el nuevo porcentaje de Grasa: "));
            case 5 -> carne.setCantidadproteinas(Validar.Int("Ingresa la nueva cantidad de Proteínas: "));
        }
    }

    public static void Fruta(Fruta fruta, int opcion){
        switch (opcion) {
            case 4 -> fruta.setCantidadagua(Validar.Int("Ingresa el nuevo porcentaje de Agua"));
            case 5 -> fruta.setCantidadazucar(Validar.Int("Ingresa la nueva cantidad de Azúcar: "));
        }
    }

    public static void Lacteo(Lacteo lacteo, int opcion) {
        switch (opcion) {
            case 4 -> lacteo.setPorcentajeagua(Validar.Int("Ingresa el nuevo porcentaje de Agua"));
            case 5 -> lacteo.setPorcentajecalcio(Validar.Int("Ingresa el nuevo porcentaje de Calcio "));
            case 6 -> lacteo.setVegano(Validar.SiNo("Es vegano? [si/no]: "));
        }
    }

    public static void Basic(int opcion, Producto p){
        switch(opcion){
            case 1 -> {System.out.println("Ingresa el nuevo Nombre: "); p.setNombre(Utils.sc.next());}
            case 2 -> p.setCantidad(Validar.Int("Ingresa la nueva Cantidad: "));
            case 3 -> p.setPrecio(Validar.Int("Ingresa el nuevo Precio: "));
        }
    }
}