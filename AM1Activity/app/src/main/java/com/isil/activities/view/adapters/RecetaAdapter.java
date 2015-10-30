package com.isil.activities.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.activities.R;
import com.isil.activities.model.RecetaEntity;

import java.util.List;

/**
 * Created by emedinaa on 15/09/15.
 */
public class RecetaAdapter extends BaseAdapter  {

    private Context context;
    private List<RecetaEntity> lsRecetaEntities;

    public RecetaAdapter(Context context, List<RecetaEntity> originalData) {
        this.context = context;
        this.lsRecetaEntities = originalData;
    }

    @Override
    public int getCount() {
        return lsRecetaEntities.size();
    }

    @Override
    public Object getItem(int i) {
        return lsRecetaEntities.get(i);
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
            v = inflater.inflate(R.layout.row_receta, null);
            ViewHolder holder = new ViewHolder();
            holder.tviName = (TextView)v.findViewById(R.id.tviName);
            holder.tviPrice = (TextView)v.findViewById(R.id.tviPrice);
            holder.tviTotal = (TextView)v.findViewById(R.id.tviTotal);
            v.setTag(holder);
        }
        RecetaEntity entry = lsRecetaEntities.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            holder.tviName.setText(entry.getName());
            holder.tviPrice.setText("S/."+entry.getPrice());
            holder.tviTotal.setText(entry.getTotal()+" personas");
        }


        return v;
    }




    static class ViewHolder
    {
        ImageView iviReceta;
        TextView tviName;
        TextView tviTotal;
        TextView tviPrice;
    }
}