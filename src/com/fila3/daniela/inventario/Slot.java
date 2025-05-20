package com.fila3.daniela.inventario;

public class Slot {
    private String contenido;

    public Slot() {
        this.contenido = null;
    }

    public void guardarItem(String item) {
        this.contenido = item;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean estaVacio() {
        return contenido == null;
    }
}
