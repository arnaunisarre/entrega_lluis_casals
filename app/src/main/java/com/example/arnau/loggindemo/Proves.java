package com.example.arnau.loggindemo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arnau.loggindemo.Juego.GameView;
import com.example.arnau.loggindemo.Juego.SecondActivity;

public class Proves extends AppCompatActivity {

//    private TextView Pregunta;
//    private Button DerechaArriba;
//    private Button DerechaAbajo;
//    private Button IzquierdaArriba;
//    private Button IzquierdaAbajo;
//    private ImageView fotoMalo;
//    private String malo;
//    private String respuestaCorrecta;
//    private String respuestaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set fullscreen
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        // Set No Title
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(new GameView(this));
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//
//        setContentView(R.layout.activity_proves);
//        Pregunta = (TextView) findViewById(R.id.textPregunta);
//        DerechaArriba = (Button)findViewById(R.id.bDerechaArriba);
//        DerechaAbajo = (Button)findViewById(R.id.bDerechaAbajo);
//        IzquierdaArriba = (Button)findViewById(R.id.bIzquierdaArriba);
//        IzquierdaAbajo= (Button)findViewById(R.id.bIzquierdaAbajo);
//        fotoMalo=(ImageView)findViewById(R.id.malo) ;
//        Intent i = this.getIntent();
//        malo = i.getStringExtra("malo");
//
//        if (malo.equals("malo1")){
//
//            Pregunta.setText("Aquesta es la pregunta del dolent1");
//            DerechaArriba.setText("andres");
//            DerechaAbajo.setText("anna");
//            IzquierdaArriba.setText("liz");
//            IzquierdaAbajo.setText("arnau");
//            respuestaCorrecta = "arnau";
//            fotoMalo.setImageResource(R.drawable.malo1);
//        }
//        DerechaArriba.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                respuestaUsuario = DerechaArriba.getText().toString();
//                corregir();
//            }
//        });
//        DerechaAbajo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                respuestaUsuario = DerechaAbajo.getText().toString();
//                corregir();
//            }
//        });
//        IzquierdaArriba.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                respuestaUsuario = IzquierdaArriba.getText().toString();
//                corregir();
//            }
//        });
//        IzquierdaAbajo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                respuestaUsuario = IzquierdaAbajo.getText().toString();
//                corregir();
//            }
//        });



    }

//    private  void corregir(){
//
//        if (respuestaCorrecta.equals(respuestaUsuario)){
//
//            onBackPressed();
//
//        }
//        else{
//
//
//        }
//    }


}
