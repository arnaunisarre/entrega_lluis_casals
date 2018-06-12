package com.example.arnau.loggindemo;

import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.arnau.loggindemo.Juego.SecondActivity;

public class Proves extends AppCompatActivity {


    Rect buttonDreta = new Rect(0,0,1200,1200); // Define the dimensions of the button here
    //Rect buttonDreta = new Rect(400,h-300,496,h-300+96); // Define the dimensions of the button here
    boolean buttonClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proves);

    }

    public boolean onTouch(View view, MotionEvent event) {



        if (buttonDreta.contains((int)event.getX(), (int)event.getY())) {
            buttonClicked = true;
          Toast.makeText(this, "Dretaaa",
                  Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Proves.this, SecondActivity.class);
           startActivity(intent);
        } else {
            buttonClicked = false;
        }

        return buttonClicked;
    }
}
