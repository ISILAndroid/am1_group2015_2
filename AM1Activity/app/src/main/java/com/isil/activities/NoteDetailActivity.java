package com.isil.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.isil.activities.model.NoteEntity;

import java.util.Calendar;

public class NoteDetailActivity extends ActionBarActivity {

    private Button btnUpdate;
    private Button btnDelete;
    private EditText eteName;
    private EditText eteDesc;
    private EditText eteNote;

    private String name,desc,note;
    private NoteEntity noteEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);
        extras();
        btnUpdate= (Button)findViewById(R.id.btnUpdate);
        btnDelete= (Button)findViewById(R.id.btnDelete);
        eteName= (EditText)findViewById(R.id.eteName);
        eteDesc= (EditText)findViewById(R.id.eteDesc);
        eteNote= (EditText)findViewById(R.id.eteNote);

        //pintar
        if(noteEntity!=null)
        {
            eteName.setText(noteEntity.getName());
            eteDesc.setText(noteEntity.getDescription());
        }

    }

    private void extras() {
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            noteEntity = (NoteEntity)bundle.getSerializable("ENTITY");
        }
    }

    private void gotoMain() {
        finish();
    }

}
