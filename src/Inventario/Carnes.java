package Inventario;

public class Carnes extends Producto {
    private String cantidadgrasa;
    private int cantidadproteinas;

    public Carnes(String nombre, int cantidad, double costo, String cantidadgrasa, int cantidadproteinas ){
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

    public String getCantidadgrasa() {
        return cantidadgrasa;
    }

    public void setCantidadgrasa(String cantidadgrasa) {
        this.cantidadgrasa = cantidadgrasa;
    }





}
