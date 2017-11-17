package com.example.dm2.actfragments;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dm2 on 06/11/2017.
 */

public class Pelicula implements Serializable{
    private String nombre;
    private String fecha;
    private double nota;

    public Pelicula(String n, String f, double no){
        nombre=n;
        fecha=f;
        nota=no;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}
