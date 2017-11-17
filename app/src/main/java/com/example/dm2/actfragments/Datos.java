package com.example.dm2.actfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;

public class Datos extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        FragmentDatos datos = (FragmentDatos)getSupportFragmentManager().findFragmentById(R.id.FrgDatos);
        datos.mostrarDatos((Pelicula) getIntent().getSerializableExtra("PELICULA"));
    }
}
