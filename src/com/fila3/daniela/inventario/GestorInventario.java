package com.fila3.daniela.inventario;

public class GestorInventario {
    private Mochila mochila;

    public GestorInventario() {
        this.mochila = new Mochila();
    }

    public void añadirItem(String item) {
        mochila.agregarItem(item);
    }

    public void mostrarInventario() {
        mochila.mostrarItems();
    }
}

