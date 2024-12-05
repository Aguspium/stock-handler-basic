package Inventario;

public class Carnes extends Producto {
    private int cantidadgrasa;
    private int cantidadproteinas;

    public Carnes(String nombre, int cantidad, double costo, int cantidadgrasa, int cantidadproteinas ){
        super(nombre, cantidad, costo);
        this.cantidadgrasa = cantidadgrasa;
        this.cantidadproteinas = cantidadproteinas;
    }

    public int getCantidadproteinas() {
        return cantidadproteinas;
    }

    public void setCantidadproteinas(int cantidadproteinas) {
        this.cantidadproteinas = cantidadproteinas;
    }

    public int getCantidadgrasa() {
        return cantidadgrasa;
    }

    public void setCantidadgrasa(int cantidadgrasa) {
        this.cantidadgrasa = cantidadgrasa;
    }

}
