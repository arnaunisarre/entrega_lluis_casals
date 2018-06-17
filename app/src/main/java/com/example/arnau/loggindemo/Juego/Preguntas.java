package com.example.arnau.loggindemo.Juego;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arnau.loggindemo.Clases.Objeto;
import com.example.arnau.loggindemo.Clases.Usuario;
import com.example.arnau.loggindemo.R;

public class Preguntas extends AppCompatActivity {

    private TextView Pregunta;
    private Button DerechaArriba;
    private Button DerechaAbajo;
    private Button IzquierdaArriba;
    private Button IzquierdaAbajo;
    private ImageView fotoMalo;
    private String malo;
    private String respuestaCorrecta;
    private String respuestaUsuario;
    private Objeto objeto;
    private GameView gameView;
    private Usuario jugador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameView(this));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_proves);
        Pregunta = (TextView) findViewById(R.id.textPregunta);
        DerechaArriba = (Button)findViewById(R.id.bDerechaArriba);
        DerechaAbajo = (Button)findViewById(R.id.bDerechaAbajo);
        IzquierdaArriba = (Button)findViewById(R.id.bIzquierdaArriba);
        IzquierdaAbajo= (Button)findViewById(R.id.bIzquierdaAbajo);
        fotoMalo=(ImageView)findViewById(R.id.malo) ;
        Intent i = this.getIntent();
        jugador = (Usuario)i.getExtras().getSerializable("usuario");
        malo = i.getStringExtra("malo");

        if (malo.equals("malo1")){

            Pregunta.setText("Aquesta es la pregunta del dolent1");
            DerechaArriba.setText("andres");
            DerechaAbajo.setText("anna");
            IzquierdaArriba.setText("liz");
            IzquierdaAbajo.setText("arnau");
            respuestaCorrecta = "arnau";
            fotoMalo.setImageResource(R.drawable.malo1);
            Objeto m = new Objeto("libro2",1,"este permite leer mejor","imagen");
            setObjeto(m);

        }
        DerechaArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuestaUsuario = DerechaArriba.getText().toString();
                corregir();
            }
        });
        DerechaAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuestaUsuario = DerechaAbajo.getText().toString();
                corregir();
            }
        });
        IzquierdaArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuestaUsuario = IzquierdaArriba.getText().toString();
                corregir();
            }
        });
        IzquierdaAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuestaUsuario = IzquierdaAbajo.getText().toString();
                corregir();
            }
        });



    }

    private  void corregir(){

        if (respuestaCorrecta.equals(respuestaUsuario)){
            Log.d("nombreobjeto", objeto.getNombreObjeto());
            int l =1;
            int a = añadirObjeto(objeto);
            if (a == 1){
                Log.d("s","s'ha afegit");
            }
            if (a==2)
            {
                Log.d("s","ja estava  afegit");
            }
            Intent resultIntent = new Intent();
            resultIntent.putExtra("usuario", jugador);
            setResult(SecondActivity.RESULT_OK, resultIntent);
            finish();

        }
        else{


        }
    }
    public void setGameView(GameView view){
        this.gameView = view;

    }
    public void setObjeto(Objeto l){
        objeto = l;
    }
    public int añadirObjeto(Objeto obj){
        Log.d("nombreobjeto", obj.getNombreObjeto());


        if (jugador.getObjeto(obj.getNombreObjeto())==null){
            jugador.miInventario.add(obj);
            return 1;
        }
        else{

            return 2;
        }


    }


}
