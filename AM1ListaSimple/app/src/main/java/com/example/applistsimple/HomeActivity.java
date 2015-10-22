package com.example.applistsimple;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends Activity {


	private Button btnSimple, btnCompuesta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

        btnSimple= (Button)findViewById(R.id.btnSimple);
        btnCompuesta= (Button)findViewById(R.id.btnCompuesta);

        //eventos

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,LSimpleActivity.class));
            }
        });

        btnCompuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,LCompuestaActivity.class));
            }
        });

	}



    @Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return false;
	}

}
