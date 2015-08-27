package com.isil.examplesjava.model;

import android.util.Log;

/**
 * Created by emedinaa on 27/08/15.
 */
public class Adolecente extends Persona{

    private static final String TAG = "Adolecente";

    public Adolecente(int edad, String nombre) {
        this.edad= edad;
        this.nombre= nombre;
    }

    @Override
    public void jugar() {
        //super.jugar();
        Log.v(TAG, "jugar en la colegio");
    }
}
