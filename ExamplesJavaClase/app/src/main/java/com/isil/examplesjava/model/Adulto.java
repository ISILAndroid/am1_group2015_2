package com.isil.examplesjava.model;

import android.util.Log;

/**
 * Created by emedinaa on 27/08/15.
 */
public class Adulto extends Persona {

    private static final String TAG = "Adulto";

    /*@Override
    public void jugar() {
        //super.jugar();
        Log.v(TAG, "jugar con cartas y cerveza");
    }*/

    @Override
    public void jugar() {
        //super.jugar();
        Log.v(TAG, "jugar con cartas y cerveza");
    }

    @Override
    protected void estudios(String msg) {
        super.estudios(msg);
        Log.v(TAG, "Adulto estudios en : "+msg);
    }
}
