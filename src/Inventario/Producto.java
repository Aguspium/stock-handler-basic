package Inventario;
import Inventario.Interfaces.Funciones;
import static Inventario.Utils.Utils.listaproductos;
import java.time.LocalDate;

public abstract class Producto implements Funciones {
        protected String nombre;
        protected int cantidad;
        protected double costo;
        private double precio;
        protected int id;
        protected LocalDate vencimiento;
        protected Double descuento = 0.0;

    public Producto(String nombre, int cantidad, double costo){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.generadorPrecio();
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

    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public LocalDate generateVencimiento() {
        return LocalDate.now().plusYears(1);
    }

    public boolean verificarVencimiento() {
        return LocalDate.now().isAfter(this.vencimiento);} //si la fecha actual pasa a la del vencimiento devuelve true

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

    public void generadorPrecio() {
    double aux = costo * 0.5;
    precio = aux + costo;

    }

    @Override
    public double calcularDescuento(double descuento) {
        if (descuento < 0) {
            System.out.println("\nEl descuento no puede ser menos de 0.");
            return descuento;
        }
        return (precio * descuento/100);
    }
    public static Producto addProducto(Producto p){
        p.setId(p.generateId());
        p.setVencimiento(p.generateVencimiento());
        listaproductos.add(p);
        System.out.println("\nProducto agregado exitosamente.");
        return p;
    }

    public abstract String toString();
}