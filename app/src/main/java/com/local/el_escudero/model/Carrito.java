package com.local.el_escudero.model;
/**
 * Created by ANA on 22/03/2018.
 */

public class Carrito {
    String nombre, precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Carrito(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
