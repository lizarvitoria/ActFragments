package com.example.dm2.actfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by dm2 on 10/11/2017.
 */

public class FragmentDatos extends Fragment{

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_datos,
                container, false);
    }
   public void mostrarDatos(Pelicula p){
       if(p!=null) {
           TextView txtNombre =
                   (TextView) getView().findViewById(R.id.LblNombre);
           txtNombre.setText(p.getNombre());
           TextView txtFecha =
                   (TextView) getView().findViewById(R.id.LblFecha);
           Toast.makeText(getContext(),"La fecha es: "+p.getFecha(),Toast.LENGTH_SHORT).show();
           txtFecha.setText(p.getFecha().toString());
           TextView txtNota =
                   (TextView) getView().findViewById(R.id.LblNota);
           txtNota.setText(p.getNota() + "");
       }
       else {
           Toast.makeText(getContext(),"ERROR", Toast.LENGTH_SHORT).show();
       }
   }
}
