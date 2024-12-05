package Inventario;

public class Fruta extends Producto{
    private int cantidadagua;
    private int cantidadazucar;

    public Fruta(String nombre, int cantidad, double costo, int cantidadagua, int cantidadazucar){
        super(nombre, cantidad, costo);
        this.cantidadagua = cantidadagua;
        this.cantidadazucar = cantidadazucar;
    }

    public int getCantidadagua() {
        return cantidadagua;
    }

    public void setCantidadagua(int cantidadagua) {
        this.cantidadagua = cantidadagua;
    }

    public int getCantidadazucar() {
        return cantidadazucar;
    }

    public void setCantidadazucar(int cantidadazucar) {
        this.cantidadazucar = cantidadazucar;
    }
}