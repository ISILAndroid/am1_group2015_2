package com.example.applistsimple.model.adapters;

import java.util.List;



import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.applistsimple.R;
import com.example.applistsimple.model.entity.ProductEntity;

public class ProductAdapter extends ArrayAdapter<ProductEntity> {

	private List<ProductEntity> data;
	private Context context;
	
	public ProductAdapter(Context _context, int resource,
			List<ProductEntity> objects) {
		super(_context, resource, objects);
		// TODO Auto-generated constructor stub
		context=_context;
		data=objects;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		//return super.getCount();
		return data.size();
	}
	
	@Override
	public ProductEntity getItem(int position) {
		// TODO Auto-generated method stub
		return data.get(position);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		LayoutInflater inflater=LayoutInflater.from(context);
		View container= inflater.inflate(R.layout.row_product, null);
		
		//acceder elementos del layout
		ImageView imgProduct=(ImageView)container.findViewById(R.id.imgProduct);
		TextView txtName=(TextView)container.findViewById(R.id.txtName);
		TextView txtDesc=(TextView)container.findViewById(R.id.txtDesc);
		TextView txtPrice=(TextView)container.findViewById(R.id.txtPrice);
				
		ProductEntity entity=data.get(position);
		String p_name=(entity.getName()!=null)?(entity.getName()):("");
		String p_price= "S/."+entity.getPrice();
		//entity.getId();
		String p_desc= entity.getDesc();
		int p_photoid= entity.getPhotoID();
		int p_state=entity.getState();
		
		//setear valores de la entidad
		txtName.setText(p_name);
		txtDesc.setText(p_desc);
		txtPrice.setText(p_price);
		imgProduct.setImageResource(p_photoid);
		
		if(p_state==ProductEntity.STOCK)
		{
			txtName.setTextColor(
					container.getResources().getColor(R.color.color_b));
		}else if(p_state==ProductEntity.NOSTOCK)
		{
			txtName.setTextColor(
					container.getResources().getColor(R.color.color_r));
		}
		return container;
		
	}

	
}
