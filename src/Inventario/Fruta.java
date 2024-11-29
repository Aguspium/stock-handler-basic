package Inventario;

public class Fruta extends Producto{
    private String cantidadagua;
    private int cantidadazucar;

    public Fruta(String nombre, int cantidad, double costo, String cantidadagua, int cantidadazucar){
        super(nombre, cantidad, costo);
        this.cantidadagua = cantidadagua;
        this.cantidadazucar = cantidadazucar;
    }

    public String getCantidadagua() {
        return cantidadagua;
    }

    public void setCantidadagua(String cantidadagua) {
        this.cantidadagua = cantidadagua;
    }

    public int getCantidadazucar() {
        return cantidadazucar;
    }

    public void setCantidadazucar(int cantidadazucar) {
        this.cantidadazucar = cantidadazucar;
    }





}
