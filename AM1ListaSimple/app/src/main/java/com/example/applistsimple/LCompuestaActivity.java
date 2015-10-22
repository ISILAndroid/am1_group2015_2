package com.example.applistsimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.applistsimple.model.adapters.ProductAdapter;
import com.example.applistsimple.model.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;


public class LCompuestaActivity extends Activity {


    private ListView lstProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcompuesta);

        app();
    }

    private void app() {
        // TODO Auto-generated method stub
        //1. Instanciar ListView
        lstProduct=(ListView)findViewById(R.id.lstProduct);
        //2. Data
        //2.1 Clase Entity
        //2.2 Item Layout

        List<ProductEntity> data=new ArrayList<ProductEntity>();

        data.add(new ProductEntity(100, "Arroz", "Descripción Arroz",
                14.0f, R.drawable.img003,
                ProductEntity.STOCK));
        data.add(new ProductEntity(101, "Azucar", "Descripción Azucar",
                10.0f, R.drawable.folders,
                ProductEntity.NOSTOCK));
        data.add(new ProductEntity(102, "Aceite", "Descripción Azucar",
                10.0f, R.drawable.img002,
                ProductEntity.STOCK));
        data.add(new ProductEntity(103, "Detergente", "Descripción Azucar",
                10.0f, R.drawable.img003
                ,ProductEntity.STOCK));
        data.add(new ProductEntity(104, "Azucar", "Descripción Azucar",
                10.0f, R.drawable.img004,
                ProductEntity.NOSTOCK));
        data.add(new ProductEntity(105, "Arroz", "Descripción Azucar",
                10.0f, R.drawable.ic_launcher,
                ProductEntity.STOCK));
        data.add(new ProductEntity(106, "Aceite", "Descripción Azucar",
                10.0f, R.drawable.ic_launcher,
                ProductEntity.STOCK));

        //3. Clase Adapter
        final ProductAdapter adapter=new ProductAdapter(this,
                R.layout.row_product, data);

        //4. Setear Adapter - ListView

        lstProduct.setAdapter(adapter);
        lstProduct.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                ProductEntity aux= adapter.getItem(position);
                showProduct(aux);
            }
        });

    }

    protected void showProduct(ProductEntity aux) {
        // TODO Auto-generated method stub
        /*Intent intent = new Intent(HomeActivity.this, ProductActivity.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("PRODUCT", aux);
        intent.putExtras(bundle);

        startActivity(intent);
        //finish();*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return false;
    }
}
