package Inventario;

public class Lacteo extends Producto {
    private String porcentajeagua;
    private String porcentajecalcio;
    private boolean vegano;

    public Lacteo(String nombre, int cantidad, double costo, String porcentajeagua, String porcentajecalcio, boolean vegano){
        super(nombre, cantidad, costo);
        this.porcentajeagua = porcentajeagua;
        this.porcentajecalcio = porcentajecalcio;
        this.vegano = vegano;
    }

    public String getPorcentajecalcio() {
        return porcentajecalcio;
    }

    public void setPorcentajecalcio(String porcentajecalcio) {
        this.porcentajecalcio = porcentajecalcio;
    }

    public String getPorcentajeagua() {
        return porcentajeagua;
    }

    public void setPorcentajeagua(String porcentajeagua) {
        this.porcentajeagua = porcentajeagua;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }




}
