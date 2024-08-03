package org.example;

public class Auto {
    private String marca;
    private String color;
    private String tipo;
    private String modelo;
    private String cantidadDpasajeros;

    public Auto(String marca, String color, String tipo, String modelo, String cantidadDpasajeros) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cantidadDpasajeros = cantidadDpasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCantidadDpasajeros() {
        return cantidadDpasajeros;
    }

    public void setCantidadDpasajeros(String cantidadDpasajeros) {
        this.cantidadDpasajeros = cantidadDpasajeros;
    }
    public void infoAuto(){
        System.out.println("marca: "+getMarca());
        System.out.println("color: "+getColor());
        System.out.println("tipo: "+getTipo());
        System.out.println("modelo: "+getModelo());
        System.out.println("cantidad pasajeros: "+getCantidadDpasajeros());
    }
}
