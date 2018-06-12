package com.example.arnau.loggindemo.Clases;

public class Objeto{



    private int idObjeto;
    private String nombreObjeto;
    private String descripcion;
    private String urlObjeto;


    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlObjeto() {
        return urlObjeto;
    }

    public void setUrlObjeto(String urlObjeto) {
        this.urlObjeto = urlObjeto;
    }



   /* public Objeto(String nombre, String tipo, String descripcion, int valor, int coste){
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Descripcion = descripcion;
        this.Valor = valor;
        this.Coste = coste;
    }*/

   public  Objeto(){

   }
    public Objeto(String nombre, int idObjeto, String descripcion, String urlObjeto){
        this.nombreObjeto = nombre;
        this.idObjeto = idObjeto;
        this.descripcion = descripcion;
        this.urlObjeto = urlObjeto;
    }


}
