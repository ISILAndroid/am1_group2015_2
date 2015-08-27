package com.isil.examplesjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.isil.examplesjava.model.Adolecente;
import com.isil.examplesjava.model.Adulto;
import com.isil.examplesjava.model.Nino;


public class ExampleJava1Activity extends ActionBarActivity {

    private Adulto adulto;
    private Nino nino;
    private Adolecente adolecente;

    private TextView tviAdulto;
    private TextView tviNino;
    private TextView tviAdolecente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_java1);
        initUi();

        adulto= new Adulto();
        adulto.setNombre("Eduardo");
        adulto.jugar();
        adulto.setEdad(30);

        adolecente= new Adolecente(15,"Pedro");
        adolecente.jugar();

        nino= new Nino();
        nino.setNombre("Alicia");
        nino.setEdad(5);
        nino.jugar();

        tviAdulto.setText("Adulto " + adulto.getNombre() + " " + adulto.getEdad());
        tviAdolecente.setText("Adolecente "+adolecente.getNombre()+ " "+adolecente.getEdad());
        tviNino.setText("Nino "+nino.getNombre()+ " "+nino.getEdad());
    }

    private void initUi() {
        tviAdulto= (TextView)findViewById(R.id.tviAdulto);
        tviAdolecente= (TextView)findViewById(R.id.tviAdolecente);
        tviNino= (TextView)findViewById(R.id.tviNino);
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
