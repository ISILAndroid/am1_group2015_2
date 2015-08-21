package com.isil.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    private ImageView img;
    private Button btnImg;
    private TextView txtImg;
    private int count;
    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images= new int[]{
                R.drawable.sample_0,
                R.drawable.sample_1,
                R.drawable.sample_2,
                R.drawable.sample_3,
                R.drawable.sample_4,
                R.drawable.sample_5,
                R.drawable.sample_6,
                R.drawable.sample_7};

        img= (ImageView)findViewById(R.id.img);
        btnImg= (Button)findViewById(R.id.butImg);
        txtImg = (TextView)findViewById(R.id.txtImg);

        img.setImageResource(images[0]);
        count=0;

        txtImg.setText("Imagen " + count);
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                count++;
                if (count >= images.length) {
                    count = 0;
                }
                img.setImageResource(images[count]);
                txtImg.setText("Imagen " + count);
                Log.v("CONSOLE", " count " + count);

                //count--;
            }
        });
    }

    public void  click_handler(View v)
    {
        Toast.makeText(this, "hola ISIL", Toast.LENGTH_LONG).show();
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
