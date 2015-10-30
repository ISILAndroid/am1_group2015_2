package com.isil.activities;

import android.app.Application;

import com.isil.activities.model.NoteEntity;
import com.isil.activities.model.RecetaEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by emedinaa on 29/10/15.
 */
public class NoteApplication extends Application {

    private List<NoteEntity> lsNoteEntities;
    private List<RecetaEntity> lsRecetasEntities;

    @Override
    public void onCreate() {
        super.onCreate();
        lsNoteEntities= new ArrayList<NoteEntity>();
        lsRecetasEntities= new ArrayList<RecetaEntity>();

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
        //int id,String name, double price, int total, int type, String desc
        RecetaEntity recetaEntity=
                new RecetaEntity(100,"Chaufa",10.0,4,0,"Arroz guardado + cucaracha");

        RecetaEntity recetaEntity1=
                new RecetaEntity(101,"Lomo Saltado",18.0,2,0,"Arroz, Papa, Carne");

        RecetaEntity recetaEntity2=
                new RecetaEntity(101,"Estafado",14.0,4,0,"Arroz, Papa, Carne");
        lsRecetasEntities.add(recetaEntity);
        lsRecetasEntities.add(recetaEntity1);
        lsRecetasEntities.add(recetaEntity2);

    }

    public void addNote(NoteEntity noteEntity)
    {
        lsNoteEntities.add(noteEntity);
    }

    public void removeNote(NoteEntity noteEntity)
    {
        lsNoteEntities.remove(noteEntity);
    }
    public void uddateNote(int position, NoteEntity noteEntity)
    {
        if(position<lsNoteEntities.size())
        {
            lsNoteEntities.set(position, noteEntity);
        }
    }

    public List<NoteEntity> allNotes()
    {
        return this.lsNoteEntities;
    }
    public List<RecetaEntity> allRecetas()
    {
        return this.lsRecetasEntities;
    }


}
