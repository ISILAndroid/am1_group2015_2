package com.isil.examplesjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CalculadoraActivity extends ActionBarActivity {

    private View imgOp1;
    private View imgOp2;
    private View imgOp3;
    private View imgOp4;
    private EditText eteValor1;
    private EditText eteValor2;
    private TextView tviResultado;

    private List<View> arrOperations;
    private int valor1, valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        initUI();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return false;
    }

    private void initUI() {

        imgOp1= findViewById(R.id.imgOp1);
        imgOp2= findViewById(R.id.imgOp2);
        imgOp3= findViewById(R.id.imgOp3);
        imgOp4= findViewById(R.id.imgOp4);

        eteValor1= (EditText)findViewById(R.id.eteValor1);
        eteValor2= (EditText)findViewById(R.id.eteValor2);
        tviResultado= (TextView)findViewById(R.id.tviResultado);

        arrOperations= new ArrayList<View>();
        arrOperations.add(imgOp1);
        arrOperations.add(imgOp2);
        arrOperations.add(imgOp3);
        arrOperations.add(imgOp4);

        events();

    }

    private void events() {

        for (View v:arrOperations) {
            v.setOnClickListener(onClickListener);
        }
    }

    private View.OnClickListener onClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String sValor1= eteValor1.getText().toString().trim();
            String sValor2= eteValor2.getText().toString().trim();

            valor1=Integer.parseInt(sValor1);
            valor2=Integer.parseInt(sValor2);

            switch (view.getId())
            {
                case R.id.imgOp1:
                    int resultado= sumar(valor1,valor2);
                    tviResultado.setText(String.valueOf(resultado));
                    //sumar
                    break;
                case R.id.imgOp2:
                    //restar
                    break;
                case R.id.imgOp3:
                    //multiplicar
                    break;
                case R.id.imgOp4:
                    //dividir
                    break;
            }
        }
    };

    private int sumar(int valor1, int valor2)
    {
        return valor1+valor2;
    }

    private int restar(int valor1, int valor2)
    {
        return valor1-valor2;
    }

    private int multiplicar(int valor1, int valor2)
    {
        return 0;
    }

    private int dividir(int valor1, int valor2)
    {
        return 0;
    }
}
