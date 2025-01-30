package Inventario;

public class Lacteo extends Producto {
    private int porcentajeagua;
    private int porcentajecalcio;
    private boolean vegano;

    public Lacteo(String nombre, int cantidad, double costo, int porcentajeagua, int porcentajecalcio, boolean vegano){
        super(nombre, cantidad, costo);
        this.porcentajeagua = porcentajeagua;
        this.porcentajecalcio = porcentajecalcio;
        this.vegano = vegano;
    }

    public int getPorcentajecalcio() {
        return porcentajecalcio;
    }

    public void setPorcentajecalcio(int porcentajecalcio) {
        this.porcentajecalcio = porcentajecalcio;
    }

    public int getPorcentajeagua() {
        return porcentajeagua;
    }

    public void setPorcentajeagua(int porcentajeagua) {
        this.porcentajeagua = porcentajeagua;
    }

    public String isVegano() {
        String a;
        if(vegano){a = "si es vegano";}else{a = "no es vegano";}
        return a;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    @Override
    public String toString() {
        return "1) Nombre: " + getNombre()
                + " \n2) Cantidad: " + getCantidad()
                + " \n3) Precio: " + getPrecio() + "$"
                + " \n4) Porcentaje de Agua: " + getPorcentajeagua() + "%"
                + " \n5) Porcentaje de Calcio: " + getPorcentajecalcio() + "%"
                + " \n6) Vegano: " + isVegano()
                + " \nId: " + getId()
                + " \nVencimiento: " + getVencimiento()
                + "Descuento: " + (getDescuento() != 0.0 ? getDescuento() + "$" : "No tiene");
    }
}