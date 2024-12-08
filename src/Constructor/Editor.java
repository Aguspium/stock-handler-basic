package Constructor;
import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import Inventario.Validar.Validar;
import java.util.function.Consumer;

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

    public static void Carne(Carnes carne, int opcion){
        switch (opcion){
            case 4 -> editarAtributo("Ingresa el nuevo porcentaje de Grasa: ", carne::setCantidadgrasa);
            case 5 -> editarAtributo("Ingresa la nueva cantidad de Proteínas: ", carne::setCantidadproteinas);
        }
    }

    public static void Fruta(Fruta fruta, int opcion){
        switch (opcion) {
            case 4 -> editarAtributo("Ingresa el nuevo porcentaje de Agua: ", fruta::setCantidadagua);
            case 5 -> editarAtributo("Ingresa la nueva cantidad de Azúcar: ", fruta::setCantidadazucar);
        }
    }

    public static void Lacteo(Lacteo lacteo, int opcion) {
        switch (opcion) {
            case 4 -> editarAtributo("Ingresa el nuevo porcentaje de Agua: ", lacteo::setPorcentajeagua);
            case 5 -> editarAtributo("Ingresa el nuevo porcentaje de Calcio: ", lacteo::setPorcentajecalcio);
            case 6 -> lacteo.setVegano(Validar.SiNo("Es vegano? [si/no]: "));
        }
    }

    public static void Basic(int opcion, Producto p){
        switch(opcion){
            case 1 -> p.setNombre(Validar.Nombre("\nIngresa el nuevo nombre del Producto: "));
            case 2 -> editarAtributo("Ingresa la nueva cantidad: ", p::setCantidad);
            case 3 -> editarAtributo("Ingresa el nuevo precio: ", p::setPrecio);
        }
    }

    public static void editarAtributo(String mensaje, Consumer<Integer> set) {
        set.accept(Validar.Int(mensaje));
    }
}