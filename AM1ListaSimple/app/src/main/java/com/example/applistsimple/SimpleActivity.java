package com.example.applistsimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SimpleActivity extends Activity {

    private TextView tviSimple;
    private String mSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        tviSimple= (TextView)findViewById(R.id.tviSimple);

        //OBTENER PARÁMETROS
        if(getIntent()!=null)
        {
            if(getIntent().getExtras()!=null)
            {
                mSimple= getIntent().getExtras().getString("DATA");
            }
        }

        tviSimple.setText(mSimple);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return false;
    }
}
