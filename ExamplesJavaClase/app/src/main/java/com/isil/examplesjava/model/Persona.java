package com.isil.examplesjava.model;

import android.util.Log;

/**
 * Created by emedinaa on 27/08/15.
 */
public class Persona implements IPersona {

    private static final String TAG = "Persona"; //Constante

    //Propiedades
    protected int edad;
    protected String nombre, apellidos;
    protected String dni;
    //private boolean isDoctor=false;


    protected void estudios(String msg)
    {
    }

    private void pensamientos()
    {

    }

    //METODOS DE ACCESO GET Y SET

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //METODOS IMPLEMENTADOS DE LA INTERFACE
    @Override
    public void jugar() {

        Log.v(TAG," Jugar ");
    }

    @Override
    public void comer() {
        Log.v(TAG," Comer ");
    }

    @Override
    public void dormir() {
        Log.v(TAG," Dormir ");
    }

    @Override
    public void programar() {
        Log.v(TAG," programar ");
    }
}
