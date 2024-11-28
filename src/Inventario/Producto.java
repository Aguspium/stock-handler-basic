package Inventario;
import Inventario.Interfaces.FuncionesObligatorias;

public abstract class Producto implements FuncionesObligatorias {
        protected String nombre;
        protected int cantidad;
        protected double precio;
        protected int id;
        protected int vencimiento;

    public Producto(String nombre, int cantidad, double precio){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void GeneratedId() {

    }

    @Override
    public void GeneratedPrecio() {

    }
    @Override
    public void GeneratedVencimiento() {

    }
}
