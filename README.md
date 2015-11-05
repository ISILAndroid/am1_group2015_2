# am1_group2015_2
Aplicaciones Móviles 1 - Grupo 2015-II

https://github.com/ISILAndroid

Instructor
------------

Eduardo José Medina Alfaro
- Email: isil@qd.pe

### Lesson 9 - Application

        * Uso de Application como clase global de la App.

1. Application

 1.1. Registro en el manifest

        ```xml
              <application
                  android:name=".NoteApplication"
                  android:allowBackup="true"
                  android:icon="@mipmap/ic_launcher"
                  android:label="@string/app_name"
                  android:theme="@style/AppTheme" >
        ```

 1.2. Creamos la clase "NoteApplication"

        ```java
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
               
                       NoteEntity noteEntity= new NoteEntity(1,"Nota 1","Esta es una nota",ndate);
                       NoteEntity noteEntity1= new NoteEntity(2,"Nota 2","Esta es una nota",ndate);
                       NoteEntity noteEntity2= new NoteEntity(3,"Nota 3","Esta es una nota",ndate);
                       NoteEntity noteEntity3= new NoteEntity(4,"Nota 4","Esta es una nota",ndate);
               
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
                       this.lsNoteEntities.remove(noteEntity);
                   }
               
                   public void removeNoteById(int noteId)
                   {
                       int position=-1;
                       NoteEntity note;
                       for (int i = 0; i <this.lsNoteEntities.size() ; i++)
                       {
                           note= lsNoteEntities.get(i);
                           if(note.getId()==noteId)
                           {
                               position=i;
                               break;
                           }
                       }
                       if(position>=0 && position<lsNoteEntities.size())
                       {
                           this.lsNoteEntities.remove(position);
                       }
                   }
               
                   public void updateNote(int position, NoteEntity noteEntity)
                   {
                       if(position<lsNoteEntities.size())
                       {
                           lsNoteEntities.set(position, noteEntity);
                       }
                   }
                   public void updateNoteById(int noteId, NoteEntity noteEntity)
                   {
                       int position=-1;
                       NoteEntity note;
                       for (int i = 0; i <this.lsNoteEntities.size() ; i++) {
                           note= lsNoteEntities.get(i);
                           if(note.getId()==noteId)
                           {
                               position=i;
                               break;
                           }
                       }
                       if(position>=0 && position<lsNoteEntities.size())
                       {
                           this.lsNoteEntities.set(position, noteEntity);
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
               
                   public int countNotes()
                   {
                       return this.lsNoteEntities.size();
                   }
                   public NoteEntity lastNote()
                   {
                       if(this.lsNoteEntities.size()>0)
                       {
                           return this.lsNoteEntities.get(this.lsNoteEntities.size()-1);
                       }
                       return null;
                   }
               
               
               }

        ```

 1.3. Invocar a la clase Application en cualquier Activity o Fragment

        ```java
                   private void loadData() {
                
                        NoteApplication application= (NoteApplication)getApplication();
                        data= application.allNotes();
                    }
        ```


### Referencia

- [Application](http://developer.android.com/intl/es/reference/android/app/Application.html)


