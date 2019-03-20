package com.example.practica7pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner categorias;
    ImageView imgMapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgMapa = findViewById(R.id.imgMapa);


        final String[] categoriaLugar = {getResources().getString(R.string.todos) , getResources().getString(R.string.restaurantes), getResources().getString(R.string.cines) , getResources().getString(R.string.tiendas), getResources().getString(R.string.parques), getResources().getString(R.string.pubs)};
        ArrayAdapter adaptadorCategoriaLugar = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, categoriaLugar);

        final Spinner OpcionesEC = findViewById(R.id.categorias);
        OpcionesEC.setAdapter(adaptadorCategoriaLugar);
        imgMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });
    }
}
