package Inventario;
import Inventario.Interfaces.FuncionesObligatorias;
import static Inventario.Utils.Utils.listaproductos;
import java.time.LocalDate;

public class Producto implements FuncionesObligatorias {
        protected String nombre;
        protected int cantidad;
        protected double costo;
        private double precio;
        protected int id;
        protected LocalDate vencimiento;

    public Producto(String nombre, int cantidad, double costo){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public LocalDate getVencimiento(){
        return vencimiento;
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

    public int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public LocalDate generateVencimiento() {
        return LocalDate.now().plusYears(1);
    }

    public int generateId(){
        int numero = 1;
        if(listaproductos.isEmpty()){
            return numero;
        }else  {
            int i = listaproductos.getLast().getId() + 1;
            for (Producto p : listaproductos) {
                if (p.getId() == i) {
                    i++;
                }
            }
            return i;
        }
    }

    @Override
    public void generadorPrecio() {
    double aux = costo * 0.5;
    precio = aux + costo;

    }

    public static Producto addProducto(Producto p){
        p.generadorPrecio();
        p.setId(p.generateId());
        p.setVencimiento(p.generateVencimiento());
        listaproductos.add(p);
        System.out.println("\nProducto agregado exitosamente.");
        return p;
    }
}