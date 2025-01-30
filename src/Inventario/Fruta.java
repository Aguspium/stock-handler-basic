package Inventario;

public class Fruta extends Producto{
    private int porcentajeagua;
    private int cantidadazucar;

    public Fruta(String nombre, int cantidad, double costo, int cantidadagua, int cantidadazucar){
        super(nombre, cantidad, costo);
        this.porcentajeagua = cantidadagua;
        this.cantidadazucar = cantidadazucar;
    }

    public int getPorcentajeagua() {
        return porcentajeagua;
    }

    public void setPorcentajeagua(int cantidadagua) {
        this.porcentajeagua = cantidadagua;
    }

    public int getCantidadazucar() {
        return cantidadazucar;
    }

    public void setCantidadazucar(int cantidadazucar) {
        this.cantidadazucar = cantidadazucar;
    }

    @Override
    public String toString() {
        return "1) Nombre: " + getNombre()
                + " \n2) Cantidad: " + getCantidad()
                + " \n3) Precio: " + getPrecio() + "$"
                + " \n4) Porcentaje de Agua: " + getPorcentajeagua() + "%"
                + " \n5) Cantidad de Azucar: " + getCantidadazucar()
                + " \nId: " + getId()
                + " \nVencimiento: " + getVencimiento()
                + " \nDescuento: " + (getDescuento() != 0.0 ? getDescuento() + "$" : "No tiene");
    }
}