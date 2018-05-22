package com.example.arnau.loggindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Actllista extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actllista);

        String[] arrayMontains = new String[]{
                "Cadi",
                "Pedraforca",
                "Puigpedrós",
                "Puigmal",
                "Pica d'Estats",
                "Canigó"
        };

        ListAdapter adaptadorL = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, arrayMontains);


        ListView lisv = (ListView) findViewById(android.R.id.list);
        lisv.setAdapter(adaptadorL);
        lisv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

            }
        });
        }


    }







