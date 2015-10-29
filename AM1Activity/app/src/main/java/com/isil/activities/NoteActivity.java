package com.isil.activities;

import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.isil.activities.model.NoteEntity;

import java.util.Calendar;

public class NoteActivity extends ActionBarActivity {

    private Button btnAddNote;
    private EditText eteName;
    private EditText eteDesc;
    private EditText eteNote;

    private String name,desc,note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        btnAddNote= (Button)findViewById(R.id.btnAddNote);
        eteName= (EditText)findViewById(R.id.eteName);
        eteDesc= (EditText)findViewById(R.id.eteDesc);
        eteNote= (EditText)findViewById(R.id.eteNote);

        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNote();
                gotoMain();
            }
        });
    }

    private void gotoMain() {
        finish();
    }

    private void addNote() {
        name= eteName.getText().toString().trim();
        desc= eteDesc.getText().toString().trim();
        note= eteNote.getText().toString().trim();

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();

        NoteEntity noteEntity= new NoteEntity(name,desc,ndate);

        NoteApplication application= (NoteApplication)getApplication();
        application.addNote(noteEntity);
    }
    /*private void addNote() {
        name= eteName.getText().toString().trim();
        desc= eteDesc.getText().toString().trim();
        note= eteNote.getText().toString().trim();

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();

        NoteEntity noteEntity= new NoteEntity(name,desc,"0",ndate);
        //mListener.getCrudOperations().addNote(noteEntity);
        noteRepository= new NoteRepository(getActivity());
        noteRepository.create(noteEntity);
        Log.v(TAG, "noteEntity " + noteEntity);

        getActivity().finish();

    }*/
}
