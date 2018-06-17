package com.example.arnau.loggindemo.Clases;



public class Celda {

    public String tipo = "x";
    Boolean  puedopasar = true;

    public Boolean getPuedopasar() {
        return puedopasar;
    }

    public void setPuedopasar(Boolean puedopasar) {
        this.puedopasar = puedopasar;
    }
    public void setFalsePuedopasar(){
        this.puedopasar = false;
    }
    public void setTruePuedopasar(){
        this.puedopasar= true;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Celda() {
    }


   public Celda (String tipo){
        this.tipo = tipo;

   }
}

