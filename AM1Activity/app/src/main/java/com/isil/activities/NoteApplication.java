package com.isil.activities;

import android.app.Application;

import com.isil.activities.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by emedinaa on 29/10/15.
 */
public class NoteApplication extends Application {

    private List<NoteEntity> lsNoteEntities;

    @Override
    public void onCreate() {
        super.onCreate();
        lsNoteEntities= new ArrayList<NoteEntity>();

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();

        NoteEntity noteEntity= new NoteEntity("Nota 1","Esta es una nota",ndate);
        NoteEntity noteEntity1= new NoteEntity("Nota 2","Esta es una nota",ndate);
        NoteEntity noteEntity2= new NoteEntity("Nota 3","Esta es una nota",ndate);
        NoteEntity noteEntity3= new NoteEntity("Nota 4","Esta es una nota",ndate);

        lsNoteEntities.add(noteEntity);
        lsNoteEntities.add(noteEntity1);
        lsNoteEntities.add(noteEntity2);
        lsNoteEntities.add(noteEntity3);

    }

    public void addNote(NoteEntity noteEntity)
    {
        lsNoteEntities.add(noteEntity);
    }

    public void removeNote(NoteEntity noteEntity)
    {
        lsNoteEntities.remove(noteEntity);
    }

    public List<NoteEntity> allNotes()
    {
        return this.lsNoteEntities;
    }

}
