package com.example.arnau.loggindemo.Clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("nombre")
    @Expose
    private String nombre;


    @SerializedName("password")
    @Expose
    private  String password;

    public Login(){

    }

    public Login(String nombre, String password){
        nombre=this.nombre;
        password=this.password;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
