package com.example.practica7pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner categorias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] categoriaLugar = {"Restaurantes" , "Cines", "Tiendas" , "Parques", "PUBS"};
        ArrayAdapter adaptadorCategoriaLugar = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, categoriaLugar);

        final Spinner OpcionesEC = findViewById(R.id.categorias);
        OpcionesEC.setAdapter(adaptadorCategoriaLugar);
    }
}
