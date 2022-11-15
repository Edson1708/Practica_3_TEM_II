
package com.emergentes.modelo;

public class Producto {
    private int id;
    private String producto;
    private double precio;
    private int cantidad;

    public Producto() {
        this.id=0;
        this.producto="";
        this.precio=0;
        this.cantidad=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
