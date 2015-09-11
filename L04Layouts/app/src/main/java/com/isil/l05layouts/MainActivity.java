package com.isil.l05layouts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.layout_relative1);
        //setContentView(R.layout.layout_relative_example);
        //setContentView(R.layout.layout_example1);
        //setContentView(R.layout.layout_example2);
        //setContentView(R.layout.layout_example3);
        //setContentView(R.layout.layout_example4);
        //setContentView(R.layout.layout_example5);
        //setContentView(R.layout.layout_example6);
        //setContentView(R.layout.layout_example7);
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
