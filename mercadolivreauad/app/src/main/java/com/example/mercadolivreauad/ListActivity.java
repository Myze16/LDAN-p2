package com.example.mercadolivreauad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.List;

public class ListActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ProductsDB productsDB = new ProductsDB();
        List<Product> allProducts = productsDB.getProductsList();

        ProductsAdapter productsAdapter = new ProductsAdapter(this, allProducts);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(productsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product product = allProducts.get(i);

                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                intent.putExtra("name", product.getName());
                intent.putExtra("description", product.getDescription());
                intent.putExtra("rating", product.getRating());
                intent.putExtra("imageResourceId", product.getFullImageId());
                intent.putExtra("thumbResourceId", product.getThumbId());
                intent.putExtra("price", product.getPrice());

                startActivity(intent);
            }
        });

    }
}
