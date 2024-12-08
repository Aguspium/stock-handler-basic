package test;
import Inventario.Carnes;
import Inventario.Producto;
import Inventario.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductoTest {

   @DisplayName("Se espera que el Id sea diferente" +
            "Que la fecha de vencimiento sea la misma" +
            "Que el precio sea el mismo" +
            "Que el objeto sea distinto")
    @Test
    public void carneTest() {
        Producto esperado = Producto.addProducto(new Carnes("Bife de lomo", 2, 500.0, 20, 50));
        Producto resultado = Producto.addProducto(new Carnes("Bife de lomo", 2, 500.0, 20, 50));

        Assertions.assertNotEquals(esperado.getId(), resultado.getId());
        Assertions.assertEquals(esperado.getVencimiento(), resultado.getVencimiento());
        Assertions.assertEquals(esperado.getPrecio(), resultado.getPrecio());
        Assertions.assertNotEquals(esperado, resultado);
        Assertions.assertNotEquals(Utils.listaproductos.getFirst(), resultado); //Compara la direccion de memoria no los valores

    }
}