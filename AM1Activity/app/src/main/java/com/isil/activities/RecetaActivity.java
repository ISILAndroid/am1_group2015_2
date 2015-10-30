package com.isil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.isil.activities.model.NoteEntity;
import com.isil.activities.model.RecetaEntity;
import com.isil.activities.view.adapters.NoteAdapter;
import com.isil.activities.view.adapters.RecetaAdapter;

import java.util.List;

public class RecetaActivity extends ActionBarActivity {

    private Button btnAddNote;
    private ListView lstNotes;
    private View tviLogout;
    private List<RecetaEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        app();

    }

    private void app() {
        ui();
        events();
        //populate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {
        RecetaAdapter recetaAdapter= new RecetaAdapter(this,data );
        lstNotes.setAdapter(recetaAdapter);
    }

    private void loadData() {

        NoteApplication application= (NoteApplication)getApplication();
        data= application.allRecetas();
    }

    private void ui() {
        btnAddNote= (Button)findViewById(R.id.btnAddNote);
        tviLogout= findViewById(R.id.tviLogout);
        lstNotes= (ListView)findViewById(R.id.lstNotes);
    }

    private void events() {
        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoNote();
            }
        });
        tviLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSesion();
            }
        });
        lstNotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                NoteEntity noteEntity= (NoteEntity)adapterView.getAdapter().getItem(position);
                gotoNoteDetail(noteEntity);

            }
        });
    }

    private void gotoNoteDetail(NoteEntity noteEntity) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("ENTITY",noteEntity);

        Intent intent = new Intent(RecetaActivity.this, NoteDetailActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    private void closeSesion() {
        finish();
    }

    private void gotoNote() {
        Intent intent = new Intent(RecetaActivity.this, NoteActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
