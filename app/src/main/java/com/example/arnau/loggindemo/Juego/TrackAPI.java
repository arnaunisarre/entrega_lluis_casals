package com.example.arnau.loggindemo.Juego;



import com.example.arnau.loggindemo.Clases.Objeto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface TrackAPI {




    @GET("json/listaObjetosUsuario/{nombreusuario}")
    Call <List<Objeto>> getlistaObjetosUser (@Path("nombreusuario") String nombreus);

    @GET ("json/{obj}")
    Call<Objeto> getObjeto(@Path("obj") String nombreObjeto);


}
