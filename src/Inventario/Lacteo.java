package Inventario;

public class Lacteo extends Producto {
    private int porcentajeagua;
    private int porcentajecalcio;
    private boolean vegano;

    public Lacteo(String nombre, int cantidad, double precio, int porcentajeagua, int porcentajecalcio, boolean vegano){
        super(nombre, cantidad, precio);
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

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }




}
