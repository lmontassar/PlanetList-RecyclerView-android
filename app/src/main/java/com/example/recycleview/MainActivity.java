package com.example.recycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlanetAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", "The smallest planet in our solar system.", R.drawable.mercury));
        planets.add(new Planet("Venus", "Often called Earth's twin due to its similar size.", R.drawable.venus));
        planets.add(new Planet("Earth", "Our home planet, the only known planet with life.", R.drawable.earth));
        planets.add(new Planet("Mars", "Known as the Red Planet due to its reddish appearance.", R.drawable.mars));
        planets.add(new Planet("Jupiter", "The largest planet in our solar system.", R.drawable.jupiter));
        planets.add(new Planet("Saturn", "Famous for its prominent ring system.", R.drawable.saturn));
        planets.add(new Planet("Uranus", "An ice giant with a tilted rotation axis.", R.drawable.uranus));
        planets.add(new Planet("Neptune", "The windiest planet in our solar system.", R.drawable.neptune));
        planets.add(new Planet("Neptune", "The windiest planet in our solar system.", R.drawable.neptune));
        planets.add(new Planet("Neptune", "The windiest planet in our solar system.", R.drawable.neptune));
        adapter = new PlanetAdapter(this,planets);
        recyclerView.setAdapter(adapter);
    }
}