package Inventario;
import Inventario.Interfaces.FuncionesObligatorias;
import Inventario.Utils.Utils;

public class Producto implements FuncionesObligatorias {
        protected String nombre;
        protected int cantidad;
        protected double costo;
        private double precio;
        protected static int id;
        protected int vencimiento = 0;

    public Producto(String nombre, int cantidad, double costo){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;

    }

    public double getPrecio(){
        return precio;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public int getId() {
        return id;
    }

    public static void generateId(){
        id = Utils.rm.nextInt();
    }

    @Override
    public void generadorPrecio() {
    double aux = costo * 0.5;
    precio = aux + costo;

    }
    public void Editor(Producto view){}
}
