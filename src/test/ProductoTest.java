package test;
import Inventario.Carnes;
import Inventario.Fruta;
import Inventario.Lacteo;
import Inventario.Producto;
import static Inventario.Utils.Utils.listaproductos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static test.Mocks.editaratributoMock;

public class ProductoTest {

    @DisplayName("Se espera que el Id sea diferente" +
            " Que la fecha de vencimiento sea la misma" +
            " Que el precio sea el mismo" +
            " Que el objeto sea distinto")
    @Test
    public void carneTest() {
        Producto esperado = Producto.addProducto(new Carnes("Bife de lomo", 2, 500.0, 20, 50));
        Producto resultado = Producto.addProducto(new Carnes("Bife de lomo", 2, 500.0, 20, 50));

        Assertions.assertNotEquals(esperado.getId(), resultado.getId());
        Assertions.assertEquals(esperado.getVencimiento(), resultado.getVencimiento());
        Assertions.assertEquals(esperado.getPrecio(), resultado.getPrecio());
        Assertions.assertNotEquals(esperado, resultado);
        Assertions.assertNotEquals(listaproductos.getFirst(), resultado); //Compara la direccion de memoria no los valores
    }

    @Test
    public void frutaTest() {
        Producto esperado = Producto.addProducto(new Fruta("Manzana", 2, 500.0, 20, 50));
        Producto resultado = Producto.addProducto(new Fruta("Manzana", 2, 500.0, 20, 50));

        Assertions.assertNotEquals(esperado.getId(), resultado.getId());
        Assertions.assertEquals(esperado.getVencimiento(), resultado.getVencimiento());
        Assertions.assertEquals(esperado.getPrecio(), resultado.getPrecio());
        Assertions.assertNotEquals(esperado, resultado);
        Assertions.assertNotEquals(listaproductos.getFirst(), resultado);
    }

    @Test
    public void lacteoTest() {
        Producto esperado = Producto.addProducto(new Lacteo("Leche", 2, 500.0, 20, 50, true));
        Producto resultado = Producto.addProducto(new Lacteo("Leche", 2, 500.0, 20, 50, true));

        Assertions.assertNotEquals(esperado.getId(), resultado.getId());
        Assertions.assertEquals(esperado.getVencimiento(), resultado.getVencimiento());
        Assertions.assertEquals(esperado.getPrecio(), resultado.getPrecio());
        Assertions.assertNotEquals(esperado, resultado);
        Assertions.assertNotEquals(listaproductos.getFirst(), resultado);
    }

    @Test
    public void editarAtributoTest() {
        Carnes p = new Carnes("Bife de lomo", 2, 500.0, 20, 50);
        editaratributoMock(p::setCantidadgrasa, 50);
        Assertions.assertEquals(50, p.getCantidadgrasa());
    }
}