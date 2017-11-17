package com.example.dm2.actfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentLista.PeliculasListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentLista frgLista = (FragmentLista)getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgLista.setPeliculasListener(this);
    }

    @Override
    public void onPeliculaSeleccionada(Pelicula c) {
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDatos)!=null);

        if(hayDetalle){
            ((FragmentDatos)getSupportFragmentManager().findFragmentById(R.id.FrgDatos)).mostrarDatos(c);
        }else{
            Intent i = new Intent(this, Datos.class);
            i.putExtra("PELICULA",c);
            startActivity(i);
        }
    }
}
