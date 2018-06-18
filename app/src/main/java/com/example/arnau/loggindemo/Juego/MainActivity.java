package com.example.arnau.loggindemo.Juego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arnau.loggindemo.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {





    private Call<Boolean> callLogin;
    private Call<String> callstring;




    private EditText Name;

    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText)findViewById(R.id.etName);









        Button salta = (Button) findViewById(R.id.salta);

        salta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //startActivity(intent);


                Intent intent = new Intent(MainActivity.this, llistaActivity.class);
                String usuario = Name.getText().toString();
                intent.putExtra("id", "usuario");

                startActivity(intent);
            }
        });{

        }


    }





}
