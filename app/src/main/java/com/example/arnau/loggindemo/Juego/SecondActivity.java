package com.example.arnau.loggindemo.Juego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.arnau.loggindemo.Actllista;
import com.example.arnau.loggindemo.Proves;
import com.example.arnau.loggindemo.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Button buto1 = (Button) findViewById(R.id.buto1);

        buto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, llistaActivity.class);
                startActivity(intent1);
            }
        });

        Button buto2 = (Button) findViewById(R.id.buto2);

        buto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, Pintarescenario.class);
                startActivity(intent1);
            }
        });
        Button prov = (Button) findViewById(R.id.prova);

        prov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, Proves.class);
                startActivity(intent1);
            }
        });

    }
}
