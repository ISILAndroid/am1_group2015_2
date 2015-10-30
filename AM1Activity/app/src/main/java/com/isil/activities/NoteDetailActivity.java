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

    private String name,desc;
    private NoteEntity noteEntity;
    private NoteApplication noteApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);
        extras();
        app();
    }

    private void app() {
        ui();
        //pintar
        if(noteEntity!=null)
        {
            eteName.setText(noteEntity.getName());
            eteDesc.setText(noteEntity.getDescription());
        }
        noteApplication= (NoteApplication)(getApplication());
        //events
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteNote();
                gotoMain();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateNote();
                gotoMain();
            }
        });

    }

    private void updateNote()
    {
        name= eteName.getText().toString().trim();
        desc= eteDesc.getText().toString().trim();

        NoteEntity note= new NoteEntity(noteEntity.getId(),name,desc);
        noteApplication.updateNoteById(noteEntity.getId(), note);
    }

    private void deleteNote()
    {
        int noteId= noteEntity.getId();
        noteApplication.removeNoteById(noteId);
    }

    private void ui() {
        btnUpdate= (Button)findViewById(R.id.btnUpdate);
        btnDelete= (Button)findViewById(R.id.btnDelete);
        eteName= (EditText)findViewById(R.id.eteName);
        eteDesc= (EditText)findViewById(R.id.eteDesc);
        eteNote= (EditText)findViewById(R.id.eteNote);
    }

    private void extras()
    {
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
