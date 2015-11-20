package com.isil.am2template;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.isil.am2template.view.OnMessageListener;
import com.isil.am2template.view.fragments.AFragment;
import com.isil.am2template.view.fragments.BFragment;
import com.isil.am2template.view.fragments.OneFragment;
import com.isil.am2template.view.fragments.TwoFragment;


public class MessageActivity extends ActionBarActivity implements OnMessageListener{

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        init();
    }

    private void init() {
            fragmentManager= getSupportFragmentManager();
            oneFragment= (OneFragment)fragmentManager.findFragmentById(R.id.fragmentOne);
            twoFragment= (TwoFragment)fragmentManager.findFragmentById(R.id.fragmentTWo);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void recibiryEnviarMessage(String message) {
        twoFragment.showMessage(message);



    }
}
