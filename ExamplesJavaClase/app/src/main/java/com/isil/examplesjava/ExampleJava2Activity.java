package com.isil.examplesjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class ExampleJava2Activity extends ActionBarActivity {

    private static final String TAG = "ExampleJava2A";
    private TextView tviDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_java2);
        tviDay= (TextView)findViewById(R.id.tviDay);
        init();
    }

    private void init() {

        Calendar calendar= Calendar.getInstance();
        calendar.setTime(new Date());
        int year= calendar.get(Calendar.YEAR);
        int month= calendar.get(Calendar.MONTH);
        int day= calendar.get(Calendar.DAY_OF_MONTH);
        int dayW= calendar.get(Calendar.DAY_OF_WEEK);

        String mes= getMes(month);
        String dia= getDay(dayW);

        Log.v(TAG, "year month day + mes " + year + " " + month + " " + day + " " + mes);
        Log.v(TAG, "dia de la semana "+dayW);

        //String nDay= day + "/"+mes+"/"+year;
        String nDay= dia +" "+day+ " de "+mes+" del "+year;
        tviDay.setText(nDay);

    }
    private String getMes(int mes)
    {
        String nmes="Enero";
        switch (mes)
        {
            case 0:
                nmes="Enero";
                break;
            case 1:
                nmes="Febrero";
                break;
            case 2:
                nmes="Marzo";
                break;
            case 3:
                nmes="Abril";
                break;
            case 4:
                nmes="Mayo";
                break;
            case 5:
                nmes="Junio";
                break;
            case 6:
                nmes="Julio";
                break;
            case 7:
                nmes="Agosto";
                break;
            case 8:
                nmes="Septiembre";
                break;
            case 9:
                nmes="Octubre";
                break;
            case 10:
                nmes="Noviembre";
                break;
            case 11:
                nmes="Diciembre";
                break;
        }
        return nmes;
    }

    private String getDay(int day)
    {
        //http://developer.android.com/reference/java/util/Calendar.html
        String nDay="";
        switch (day)
        {
            case 1:
                nDay="Domingo";
                break;
            case 2:
                nDay="Lunes";
                break;
            case 3:
                nDay="Martes";
                break;
            case 4:
                nDay="Miercoles";
                break;
            case 5:
                nDay="Jueves";
                break;
            case 6:
                nDay="Viernes";
                break;
            case 7:
                nDay="Sabado";
                break;
        }
        return nDay;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
