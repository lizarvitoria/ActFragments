package com.example.dm2.actfragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Date;

public class FragmentLista extends Fragment{

        private Pelicula[] datos =
                new Pelicula[]{
                        new Pelicula("El secreto de Marrowbone", "2017/10/27", 6.4),
                        new Pelicula("Thor: Ragnarok", "2017/10/27", 7.8),
                        new Pelicula("Annabelle: Creation", "2017/10/12", 7.1)};
        private ListView lstListado;
    private PeliculasListener listener;
        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment,
                    container, false);
        }
        @Override
        public void onActivityCreated(Bundle state) {
            super.onActivityCreated(state);
            lstListado =(ListView)getView().findViewById(R.id.lstListado);
            lstListado.setAdapter(new AdaptadorPeliculas(this));
            lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                public void onItemClick(AdapterView<?> a, View v, int position, long id){
                    if(listener!=null)
                        listener.onPeliculaSeleccionada((Pelicula)lstListado.getAdapter().getItem(position));
                }
            });
        }
        class AdaptadorPeliculas extends ArrayAdapter<Pelicula> {
            Activity context;

            AdaptadorPeliculas(FragmentLista context) {
                super(context.getActivity(), R.layout.listapelis, datos);
                this.context = context.getActivity();
            }

            public View getView(int position,
                                View convertView,
                                ViewGroup parent) {
                LayoutInflater inflater = context.getLayoutInflater();
                View item = inflater.inflate(R.layout.listapelis, null);
                TextView lblNombre = (TextView) item.findViewById(R.id.LblNombre);
                lblNombre.setText(datos[position].getNombre());
                return (item);
            }
        }
    public interface PeliculasListener{
        void onPeliculaSeleccionada(Pelicula c);
    }
    public void setPeliculasListener (PeliculasListener listener){
        this.listener=listener;
    }

}
