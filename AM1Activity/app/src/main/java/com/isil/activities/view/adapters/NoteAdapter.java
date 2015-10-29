package com.isil.activities.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.activities.R;
import com.isil.activities.model.NoteEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emedinaa on 15/09/15.
 */
public class NoteAdapter extends BaseAdapter implements Filterable {

    private Context context;
    private List<NoteEntity> lsNoteEntities;
    private List<NoteEntity> originalData;
    private Filter noteFilter;

    public NoteAdapter(Context context, List<NoteEntity> originalData) {
        this.context = context;
        this.originalData = originalData;
        this.lsNoteEntities = originalData;
    }

    @Override
    public int getCount() {
        return lsNoteEntities.size();
    }

    @Override
    public Object getItem(int i) {
        return lsNoteEntities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_note, null);
            ViewHolder holder = new ViewHolder();
            //holder.iviNote = (ImageView)v.findViewById(R.id.iviUser);
            holder.tviName = (TextView)v.findViewById(R.id.tviName);
            v.setTag(holder);
        }
        NoteEntity entry = lsNoteEntities.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            holder.tviName.setText(entry.getName());
        }


        return v;
    }

    public void resetData() {
        lsNoteEntities = originalData;
    }

    @Override
    public Filter getFilter() {
        if (noteFilter == null)
            noteFilter = new NoteFilter();
        return noteFilter;
    }

    private class NoteFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            // We implement here the filter logic
            if (constraint == null || constraint.length() == 0) {
                // No filter implemented we return all the list
                results.values = originalData;
                results.count = originalData.size();
            }
            else {
                // We perform filtering operation
                List<NoteEntity> nNoteList = new ArrayList<NoteEntity>();

                for (NoteEntity noteEntity : lsNoteEntities) {
                    if (noteEntity.getName().toUpperCase().startsWith(constraint.toString().toUpperCase()))
                        nNoteList.add(noteEntity);
                }

                results.values = nNoteList;
                results.count = nNoteList.size();

            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint,
                                      FilterResults results) {
            // Now we have to inform the adapter about the new list filtered
            if (results.count == 0)
                notifyDataSetInvalidated();
            else {
                lsNoteEntities = (List<NoteEntity>) results.values;
                notifyDataSetChanged();
            }

        }

    }

    static class ViewHolder
    {
        ImageView iviNote;
        TextView tviName;
    }
}