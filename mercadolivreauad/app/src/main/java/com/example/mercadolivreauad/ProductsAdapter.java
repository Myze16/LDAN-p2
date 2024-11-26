package com.example.mercadolivreauad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ProductsAdapter extends ArrayAdapter<Product> {
    List<Product> productList;

    public ProductsAdapter(@NonNull Context context, List<Product> productList) {
        super(context, 0, productList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_products, parent, false);
        }
        Product currentProduct = getItem(position);

        // Esse listAlgumaCoisa é o ID do XML
        TextView nameTextView = convertView.findViewById(R.id.listProductsName);
        ImageView thumbImageView = convertView.findViewById(R.id.listProductsThumb);
        TextView priceTextView = convertView.findViewById(R.id.listProductsPrice);

        nameTextView.setText(currentProduct.getName());
        thumbImageView.setImageResource(currentProduct.getThumbId());
        priceTextView.setText("R$" + currentProduct.getPrice());

        return convertView;
    }
}
