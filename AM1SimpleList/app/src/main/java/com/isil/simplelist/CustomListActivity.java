package com.isil.simplelist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.isil.simplelist.adapter.SimpleListAdapter;
import com.isil.simplelist.storage.Cheeses;


public class CustomListActivity extends ActionBarActivity {


    private String[] mStrings = Cheeses.sCheeseStrings;
    private ListView lviCheeses;
    private SimpleListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_list);
        lviCheeses=(ListView)findViewById(R.id.lviCheeses);

        adapter= new SimpleListAdapter(this,mStrings);

        lviCheeses.setAdapter(adapter);

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
