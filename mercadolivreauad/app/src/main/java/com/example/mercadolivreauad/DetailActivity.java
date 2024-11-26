package com.example.mercadolivreauad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String description = intent.getStringExtra("description");
        int rating = intent.getIntExtra("rating", 0);
        int fullImageId = intent.getIntExtra("fullImageId", -1);
        double price = intent.getDoubleExtra("price", 0);

        TextView nameTextView = findViewById(R.id.productName);
        TextView descriptionTextView = findViewById(R.id.productDescription);
        TextView ratingTextView = findViewById(R.id.productRating);
        ImageView fullImageView = findViewById(R.id.productFullImageId);
        TextView priceTextView = findViewById(R.id.productPrice);
        Button backButton = findViewById(R.id.backButton);

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        ratingTextView.setText(rating);
        fullImageView.setImageResource(fullImageId);
        priceTextView.setText((int) price);

        backButton.setOnClickListener(v -> {
            Intent backIntent = new Intent(DetailActivity.this, ListActivity.class);
            startActivity(backIntent);
        });
    }
}
