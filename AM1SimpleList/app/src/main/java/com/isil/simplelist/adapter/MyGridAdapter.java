package com.isil.simplelist.adapter;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by emedinaa on 15/10/15.
 */
public class MyGridAdapter extends BaseAdapter {

    private Context context;
    private List<ResolveInfo> data;

    public MyGridAdapter(Context context,List<ResolveInfo> data) {
        this.context=context;
        this.data=data;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i;

        if (convertView == null) {
            i = new ImageView(context);
            i.setScaleType(ImageView.ScaleType.FIT_CENTER);
            i.setLayoutParams(new GridView.LayoutParams(50, 50));
        } else {
            i = (ImageView) convertView;
        }

        ResolveInfo info = data.get(position);
        i.setImageDrawable(info.activityInfo.loadIcon(context.getPackageManager()));

        return i;
    }


    public final int getCount() {
        return data.size();
    }

    public final Object getItem(int position) {
        return data.get(position);
    }

    public final long getItemId(int position) {
        return position;
    }
}