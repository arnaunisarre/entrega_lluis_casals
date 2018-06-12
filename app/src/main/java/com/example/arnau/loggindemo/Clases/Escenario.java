package com.example.arnau.loggindemo.Clases;

import com.example.arnau.loggindemo.Clases.Celda;

public class Escenario {


    public int numHorizontales;
    public int numVerticales;
    public String nombre;
    public Celda[][] celdas;

    public int getNumHorizontales() {
        return numHorizontales;
    }

    public void setNumHorizontales(int numHorizontales) {
        this.numHorizontales = numHorizontales;
    }

    public int getNumVerticales() {
        return numVerticales;
    }

    public void setNumVerticales(int numVerticales) {
        this.numVerticales = numVerticales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Celda[][] getCeldas() {
        return celdas;
    }

    public void setCeldas(Celda[][] celdas) {
        this.celdas = celdas;
    }




    public Escenario(){

    }

    public Escenario(String nombre, int ancho, int alto) {
        this.nombre = nombre;
        this.numHorizontales = ancho;
        this.numVerticales = alto;
        celdas = new Celda[ancho][alto];
        for(int i=0;i<ancho;i++)
            for(int j=0;j<alto;j++) {
                celdas[i][j] = new Celda();
            }
    }





}
