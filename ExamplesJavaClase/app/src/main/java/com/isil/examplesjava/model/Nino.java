package com.isil.examplesjava.model;

import android.util.Log;

/**
 * Created by emedinaa on 27/08/15.
 */
public class Nino  extends Persona{

    private static final String TAG = "Nino";

    @Override
    public void jugar() {
        //super.jugar();
        Log.v(TAG, "jugar en el Nido");
    }

    @Override
    protected void estudios(String msg) {
        super.estudios(msg);
        Log.v(TAG, "Nino estudios en : "+msg);
    }
}
