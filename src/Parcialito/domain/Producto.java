package Parcialito.domain;

public class Producto {
    private String nombreP;
    private int precioP;
    private String tipoP;

    public void nombre(String nombre){
        this.nombreP = nombre;
    }

    public void precio(int precio){
        this.precioP = precio;
    }

    public void Tipo(String tipo){
        this.tipoP = tipo;
    }

    public Producto(String nombre, int precio, String tipo) {
        this.nombreP = nombre;
        this.precioP = precio;
        this.tipoP = tipo;
    }

    public String getNombreP() {
        return nombreP;
    }

    public int getPrecioP() {
        return precioP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setPrecioP(int precioP) {
        this.precioP = precioP;
    }
}