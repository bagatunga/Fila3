package com.fila3.daniela.inventario;

import java.util.ArrayList;

public class Mochila {
    private ArrayList<String> items;

    public Mochila() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public void mostrarItems() {
        System.out.println("Contenido de la mochila:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
