package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlanetDetail extends AppCompatActivity {

    public static final String EXTRA_PLANET_NAME = "planet_name";
    public static final String EXTRA_PLANET_IMAGE = "planet_image";
    public static final String EXTRA_PLANET_DESCRIPTION = "planet_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planet_detail);
        TextView planetDescription = findViewById(R.id.detailPlanetName);
        ImageView planetImage = findViewById(R.id.image);
        TextView planetName = findViewById(R.id.nom);
        String name = getIntent().getStringExtra(EXTRA_PLANET_NAME);
        String description = getIntent().getStringExtra(EXTRA_PLANET_DESCRIPTION);

        int imageResourceId = getIntent().getIntExtra(EXTRA_PLANET_IMAGE, 0);

        planetImage.setImageResource(imageResourceId);
        planetName.setText(name);
        planetDescription.setText(description);
    }
}