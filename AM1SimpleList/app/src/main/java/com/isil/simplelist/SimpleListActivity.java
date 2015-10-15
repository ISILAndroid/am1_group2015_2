package com.isil.simplelist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.isil.simplelist.storage.Cheeses;


public class SimpleListActivity extends ActionBarActivity {

    private String[] mStrings = Cheeses.sCheeseStrings;
    private ListView lviCheeses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);
        lviCheeses=(ListView)findViewById(R.id.lviCheeses);
        lviCheeses.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mStrings));
        lviCheeses.setTextFilterEnabled(true);

        //events
        lviCheeses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value= String.valueOf(adapterView.getAdapter().getItem(position));
                showItem(value);
            }
        });
    }

    private void showItem(String value) {

        Toast.makeText(this,"item "+value,Toast.LENGTH_LONG).show();
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
